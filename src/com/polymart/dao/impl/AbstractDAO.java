package com.polymart.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.polymart.dao.GenericDAO;
import com.polymart.mapper.RowMapper;

public class AbstractDAO<T> implements GenericDAO<T> {

    private Connection _connection = null;
    private PreparedStatement _statement = null;
    private ResultSet _resultSet = null;

    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;database=POLYMART_v1;integratedSecurity=true"; // add
            // databaseName
            // using
            // window
            // authentication
            String user = "";
            String password = "";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeConnection() {
        try {
            if (_statement != null) {
                _statement.close();
            }
            if (_resultSet != null) {
                _resultSet.close();
            }
            if (_connection != null) {
                _connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private PreparedStatement setParameter(PreparedStatement statement, Object... parameters) {
        try {
            for (int i = 0; i < parameters.length; i++) {
                Object parameter = parameters[i];
                int index = i + 1;
                if (parameter instanceof Long) {
                    statement.setLong(index, (Long) parameter);
                } else if (parameter instanceof String) {
                    statement.setNString(index, (String) parameter);
                } else if (parameter instanceof Integer) {
                    statement.setInt(index, (Integer) parameter);
                } else if (parameter instanceof Timestamp) {
                    statement.setTimestamp(index, (Timestamp) parameter);
                } else if (parameter instanceof Date) {
                    statement.setDate(index, new java.sql.Date(((Date) parameter).getTime()));
                } else if (parameter instanceof Boolean) {
                    statement.setBoolean(index, (Boolean) parameter);
                }
            }
            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        List<T> results = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            statement = setParameter(statement, parameters);
            if (statement != null) {
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    results.add(rowMapper.mapRow(resultSet));
                }
                return results;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                return null;
            }
        }
        return null;
    }

    @Override
    public Integer update(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;
        int count = -1;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            setParameter(statement, parameters);
            count = statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    e.printStackTrace();
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return count;
    }

    @Override
    public Integer insert(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            Integer id = null;
            connection = getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            setParameter(statement, parameters);
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            connection.commit();
            return id;
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    e.printStackTrace();
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public ResultSet queryBySql(String sql, Object... parameters) {
        try {
            _connection = getConnection();
            _statement = _connection.prepareStatement(sql);
            _statement = setParameter(_statement, parameters);
            if (_statement != null) {
                _resultSet = _statement.executeQuery();
                return _resultSet;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

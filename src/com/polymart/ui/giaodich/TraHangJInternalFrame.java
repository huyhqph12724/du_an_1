package com.polymart.ui.giaodich;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.polymart.config.SecurityConfig;
import com.polymart.entity.EntityAuthorization;
import com.polymart.entity.EntityExcel;
import com.polymart.entity.EntityMessage;
import com.polymart.entity.EntityValidate;
import com.polymart.model.ChiTietHoaDonTraHangModel;
import com.polymart.model.HoaDonTraHangModel;
import com.polymart.service.IChiTietHoaDonThanhToanService;
import com.polymart.service.IChiTietHoaDonTraHangService;
import com.polymart.service.IChiTietSanPhamService;
import com.polymart.service.IHoaDonTraHangService;
import com.polymart.service.impl.ChiTietHoaDonThanhToanService;
import com.polymart.service.impl.ChiTietHoaDonTraHangService;
import com.polymart.service.impl.ChiTietSanPhamService;
import com.polymart.service.impl.HoaDonTraHangService;
import com.polymart.ui.MainFrame;
import com.polymart.ui.common.uiCommon;
import com.toedter.calendar.JDateChooser;

public class TraHangJInternalFrame extends JInternalFrame {

    private static final long serialVersionUID = -4824323272953818563L;

    private JPanel contentPane;
    private JPanel panel = new JPanel();
    private JPanel hangHoaJPanel = new JPanel();

    private JTextField txtTimPhieuNhap;
    private JFrame optionKiemKhoFrame = new JFrame();
    private JPanel panelOption;
    private JTable tableTraHang;
    private DefaultTableModel modelTraHang;

    private IHoaDonTraHangService hoaDonTraHangService = new HoaDonTraHangService();
    private IChiTietHoaDonThanhToanService chiTietHoaDonThanhToanService = new ChiTietHoaDonThanhToanService();
    private IChiTietHoaDonTraHangService chiTietHoaDonTraHangService = new ChiTietHoaDonTraHangService();
    private IChiTietSanPhamService chiTietSanPhamService = new ChiTietSanPhamService();

    private List<HoaDonTraHangModel> lstHoaDonTraHangModels = hoaDonTraHangService.findAll();

    private HoaDonTraHangModel hoaDonTraHangModel = new HoaDonTraHangModel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TraHangJInternalFrame frame = new TraHangJInternalFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TraHangJInternalFrame() {
        init();
    }

    public void init() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        modelTraHang = new DefaultTableModel() {

            private static final long serialVersionUID = -7807772237459649491L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setBounds(100, 100, 1920, 639);
        setFocusable(true);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(75, 0, 130));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        panel.setBackground(Color.WHITE);
        contentPane.add(panel, BorderLayout.NORTH);
        panel.setBounds(68, 120, 96, 20);
        hangHoaJPanel.setBackground(Color.WHITE);

        contentPane.add(hangHoaJPanel, BorderLayout.WEST);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        JLabel lblNewLabel_9 = new JLabel("Th???i gian");

        JDateChooser dateChooser = new JDateChooser(new Date());

        JButton btnLocTheoNgay = new JButton("L???c");
        uiCommon.editButtonCenter(btnLocTheoNgay);
        GroupLayout gl_hangHoaJPanel = new GroupLayout(hangHoaJPanel);
        gl_hangHoaJPanel.setHorizontalGroup(
                gl_hangHoaJPanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_hangHoaJPanel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_hangHoaJPanel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLocTheoNgay, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_hangHoaJPanel.setVerticalGroup(
                gl_hangHoaJPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_hangHoaJPanel.createSequentialGroup()
                                .addGap(5)
                                .addComponent(lblNewLabel_9)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnLocTheoNgay, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(133, Short.MAX_VALUE))
        );

        hangHoaJPanel.setLayout(gl_hangHoaJPanel);
        tableTraHang = new JTable();
        tableTraHang.setBackground(Color.WHITE);
        scrollPane.setViewportView(tableTraHang);
        modelTraHang.addColumn("M?? tr??? h??ng");
        modelTraHang.addColumn("M?? thanh to??n");
        modelTraHang.addColumn("Th???i gian");
        modelTraHang.addColumn("Kh??ch h??ng");
        modelTraHang.addColumn("T???ng ti???n ho??n tr???");
        modelTraHang.addColumn("Ghi ch??");
        tableTraHang.setModel(modelTraHang);

        // Click ????p v??o 1 h??a ????n s??? show th??ng tin l??n chiTietHoaDonTraHang
        tableTraHang.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                int row = tableTraHang.getSelectedRow();
                if (row > -1 && row < tableTraHang.getRowCount()) {
                    hoaDonTraHangModel = hoaDonTraHangService.findById(Integer.parseInt(tableTraHang.getValueAt(row, 0).toString()));
                }
                setOpenThemHoaDonTraHang(mouseEvent);
            }
        });

        // hi???n th??? danh s??ch h??a ????n tr???
        showTable(lstHoaDonTraHangModels);

        // btn l???c theo ng??y
        btnLocTheoNgay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtBtnLoc(dateChooser);
            }
        });
        tableTraHang.setRowHeight(25);
        tableTraHang.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableTraHang.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableTraHang.getColumnModel().getColumn(2).setPreferredWidth(120);
        tableTraHang.getColumnModel().getColumn(3).setPreferredWidth(120);
        tableTraHang.getColumnModel().getColumn(4).setPreferredWidth(120);
        tableTraHang.getColumnModel().getColumn(4).setPreferredWidth(120);


        optionKiemKhoFrame.setSize(344, 234);
        optionKiemKhoFrame.setLocation(uiCommon.width - 360, uiCommon.height - (uiCommon.height / 100 * 86));
        panelOption = new JPanel();
        panelOption.setLayout(null);
        panelOption.setBackground(Color.white);
        panelOption.setBorder(new EmptyBorder(0, 0, 5, 5));

        optionKiemKhoFrame.getContentPane().add(panelOption);
        optionKiemKhoFrame.setUndecorated(true);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(75, 0, 130));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JButton btnExport = new JButton("??? Xu???t");
        btnExport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                evtBtnXuatFileExcel();
            }
        });
        JButton btnXoa = new JButton("- Xo?? ");

        // x??a
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtBtnXoa(tableTraHang);
            }
        });

        JButton btnThemPhieuNhap = new JButton("+ Th??m");

        btnThemPhieuNhap.addActionListener(openThemHoaDonTraHang);
        JButton btnTimKiem = new JButton("T??m");

        // t??m ki???m
        btnTimKiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtBtnTim(txtTimPhieuNhap);
            }
        });

        txtTimPhieuNhap = new JTextField();
        txtTimPhieuNhap.setText("T??m theo h??a ????n tr??? h??ng");
        txtTimPhieuNhap.setColumns(10);
        txtTimPhieuNhap.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtTimPhieuNhap.getText().equals("T??m theo h??a ????n tr??? h??ng")) {
                    txtTimPhieuNhap.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtTimPhieuNhap.getText().equals("")) {
                    txtTimPhieuNhap.setText("T??m theo h??a ????n tr??? h??ng");
                }
            }
        });
        JLabel lblNewLabel = new JLabel("H??a ????n tr??? h??ng");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(txtTimPhieuNhap, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(btnTimKiem, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(btnThemPhieuNhap, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(btnExport, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnExport, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThemPhieuNhap, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTimPhieuNhap, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTimKiem, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        panel.setLayout(gl_panel);

        uiCommon.editButtonTop(btnTimKiem);
        uiCommon.editButtonTop(btnThemPhieuNhap);
        uiCommon.editButtonTop(btnExport);
        uiCommon.editButtonTop(btnXoa);

        setPhanQuyen(btnExport, btnXoa, btnThemPhieuNhap);
    }

    private void setPhanQuyen(JButton btnExport, JButton btnXoa, JButton btnThemPhieuNhap) {
        if (EntityAuthorization.USER.getChucVu().equals(SecurityConfig.VAITRO_QUANLY)) return;
        btnThemPhieuNhap.setVisible(false);
        btnXoa.setVisible(false);
        btnExport.setVisible(false);
        if (EntityAuthorization.USER.getChucVu().equals(SecurityConfig.VAITRO_THUNGAN)) {
            btnThemPhieuNhap.setVisible(true);
            btnXoa.setVisible(true);
            btnExport.setVisible(true);
        }
    }

    private void setOpenThemHoaDonTraHang(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            int row = tableTraHang.getSelectedRow();
            if ((row > -1 && row < tableTraHang.getRowCount()) && hoaDonTraHangModel != null) {
                List<ChiTietHoaDonTraHangModel> lstChiTiet = chiTietHoaDonTraHangService.findByIdHoaDonTraHang(hoaDonTraHangModel.getId());
                hoaDonTraHangModel = hoaDonTraHangService.findById(Integer.parseInt(tableTraHang.getValueAt(row, 0).toString()));
                if (!lstChiTiet.isEmpty()) {
                    new ChiTietHoaDonTraHang(lstChiTiet, hoaDonTraHangModel.getGhiChu()).setVisible(true);
                } else {
                    EntityMessage.show(this, "H??a ????n kh??ng c?? s???n ph???m");
                }
            }
        }

    }

    ActionListener openThemHoaDonTraHang = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setOpenThemHoaDonTraHang();
        }
    };

    // set s??? ki???n m??? form th??m h??a ????n tr???
    private void setOpenThemHoaDonTraHang() {
        ThemTraHangJInternalFrame themHoaDonTraHang = new ThemTraHangJInternalFrame(this);
        MainFrame.pnlMain.add(themHoaDonTraHang);
        themHoaDonTraHang.setVisible(true);
    }

    // hi???n th??? danh s??ch h??a ????n tr??? h??ng
    public void showTable(List<HoaDonTraHangModel> lst) {
        if (!lst.isEmpty()) {
            modelTraHang.setRowCount(0);
            for (HoaDonTraHangModel x : lst) {
                Object[] result = hoaDonTraHangService.getDataTableById(x.getId());
                if (result != null) {
                    modelTraHang.addRow(new Object[]{
                            result[0],
                            result[1],
                            new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(result[2]),
                            result[3],
                            EntityValidate.dinhDangMonney(Long.valueOf(result[4].toString())),
                            x.getGhiChu()
                    });
                }
            }
        }
    }

    // t??m theo h??a ????n tr??? h??ng
    private void evtBtnTim(JTextField txtTimPhieuNhap) {
        String getTimKiem = txtTimPhieuNhap.getText();
        if (getTimKiem.equals("T??m theo h??a ????n tr??? h??ng")) {
            showTable(getData());
        } else {
            if (EntityValidate.checkIdNumber(this, getTimKiem)) {
                hoaDonTraHangModel = hoaDonTraHangService.findById(Integer.parseInt(getTimKiem));
                if (hoaDonTraHangModel == null) {
                    EntityMessage.show(this, "M?? h??a ????n kh??ng t???n t???i");
                } else {
                    lstHoaDonTraHangModels = new ArrayList<>();
                    lstHoaDonTraHangModels.add(hoaDonTraHangModel);
                    showTable(lstHoaDonTraHangModels);
                }
            }
        }
    }

    // l???c theo ng??y
    private void evtBtnLoc(JDateChooser dateChooser) {
        try {
            Timestamp timestamp = new Timestamp(dateChooser.getCalendar().getTimeInMillis());
            List<HoaDonTraHangModel> lstLoc = hoaDonTraHangService.filterByDate(timestamp);
            if (lstLoc.isEmpty()) {
                EntityMessage.show(this, "Kh??ng c?? h??a ????n n??o trong ng??y ???????c ch???n");
            } else {
                lstHoaDonTraHangModels = lstLoc;
                showTable(lstHoaDonTraHangModels);
            }
        } catch (Exception e) {
            EntityMessage.show(this, "M???i ch???n ng??y mu???n t??m");
        }
    }

    // x??a m???t h??ng tr??n table
    private void evtBtnXoa(JTable tbDanhSach) {
        int row = tbDanhSach.getSelectedRow();
        if (row > -1 && row < tbDanhSach.getRowCount()) {
            if (EntityMessage.confirm(this, "Thao t??c n??y c?? th??? s??? b??? m???t d??? li???u\n?????ng ?? x??a?")) {
                hoaDonTraHangModel = hoaDonTraHangService.findById(Integer.parseInt(tableTraHang.getValueAt(row, 0).toString()));
                if (hoaDonTraHangModel != null && hoaDonTraHangService.remove(hoaDonTraHangModel)) {
                    EntityMessage.show(this, "X??a th??nh c??ng");
                    modelTraHang.removeRow(row);
                    chiTietHoaDonTraHangService.reloadData();
                    chiTietSanPhamService.reloadData();
                    chiTietHoaDonThanhToanService.reloadData();
                } else {
                    EntityMessage.show(this, "X??a th???t b???i");
                }
            }
        } else {
            EntityMessage.show(this, "Vui l??ng ch???n 1 h??ng");
        }
    }

    // xu???t file excel
    private void evtBtnXuatFileExcel() {
        try {
            EntityExcel.exportExcel(tableTraHang);
            EntityMessage.show(this, "L??u th??nh c??ngg");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            EntityMessage.show(this, "L??u th???t b???i");
        }
    }

    // getDataList
    public List<HoaDonTraHangModel> getData() {
        return lstHoaDonTraHangModels = hoaDonTraHangService.findAll();
    }
}

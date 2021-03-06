package com.polymart.model;

public class SanPhamModel extends AbstractModel {
    private Integer idLoaiSP;
    private String tenSP;
    private String moTa;
    private boolean statusKinhDoanh;

    public boolean isStatusKinhDoanh() {
		return statusKinhDoanh;
	}

	public void setStatusKinhDoanh(boolean statusKinhDoanh) {
		this.statusKinhDoanh = statusKinhDoanh;
	}

	public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getIdLoaiSP() {
        return idLoaiSP;
    }

    public void setIdLoaiSP(Integer idLoaiSP) {
        this.idLoaiSP = idLoaiSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

	@Override
	public String toString() {
		return "SanPhamModel [idLoaiSP=" + idLoaiSP + ", tenSP=" + tenSP + ", moTa=" + moTa + ", statusKinhDoanh="
				+ statusKinhDoanh + "]";
	}
    
}

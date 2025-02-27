package com.example.ThiThu03_KiemThu.bai03;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String email;
    private String diaChi;
    private String chucVu;
    private int tienLuong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String email, String diaChi, String chucVu, int tienLuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.email = email;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.tienLuong = tienLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(int tienLuong) {
        this.tienLuong = tienLuong;
    }

}

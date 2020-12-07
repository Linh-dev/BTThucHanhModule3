package model;

public class SanPham {
    private int id;
    private String ten;
    private String nhaSanXuat;
    private int gia;
    private int soLuong;

    public SanPham(){}

    public SanPham(String ten, String nhaSanXuat, int gia, int soLuong) {
        this.ten = ten;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public SanPham(int id, String ten, String nhaSanXuat, int gia, int soLuong) {
        this.id = id;
        this.ten = ten;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

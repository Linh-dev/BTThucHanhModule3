package service;

import model.SanPham;

import java.util.List;

public interface IService {
    public List<SanPham> hienThiAll();
    public void them(SanPham sp);
    public void xoa(int id);
    public void sua(SanPham sp);
    public SanPham timKiemId(int id);
    public List<SanPham> timKiemTen(String ten);
}

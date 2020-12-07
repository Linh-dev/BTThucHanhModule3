package service;

import JBDCConnection.KetNoi;
import com.mysql.cj.jdbc.JdbcConnection;
import model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service implements IService {
    Connection connection = KetNoi.getConnection();

    private static final String insert = "Insert into product (ten,nhaSanXuat,gia,soLuong) values (?,?,?,?);";
    private static final String selectAll = "select * from product;";
    private static final String delete = "delete from product where id = ?;";
    private static final String update = "update product set ten=?,nhaSanXuat=?,gia=?,soLuong=? where id = ?;";
    private static final String findById ="select * from product where id=?;";
    private static final String findByName = "select * from product where ten like ?;";

    @Override
    public List<SanPham> hienThiAll() {
        List<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(selectAll);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String nhaSanXuat = rs.getString("nhaSanXuat");
                int gia = rs.getInt("gia");
                int soLuong = rs.getInt("soLuong");
                SanPham sp = new SanPham(id, ten, nhaSanXuat,gia, soLuong);
                list.add(sp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void them(SanPham sp) {
        try {
            PreparedStatement ps = connection.prepareStatement(insert);
            ps.setString(1,sp.getTen());
            ps.setString(2,sp.getNhaSanXuat());
            ps.setInt(3,sp.getGia());
            ps.setInt(4,sp.getSoLuong());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void xoa(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement(delete);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void sua(SanPham sp) {
        try {
            PreparedStatement ps = connection.prepareStatement(update);
            ps.setString(1,sp.getTen());
            ps.setString(2,sp.getNhaSanXuat());
            ps.setInt(3,sp.getGia());
            ps.setInt(4,sp.getSoLuong());
            ps.setInt(5,sp.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public SanPham timKiemId(int id) {
        SanPham sp = null;
        try {
            PreparedStatement ps = connection.prepareStatement(findById);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String ten = rs.getString("ten");
                String nhaSanXuat = rs.getString("nhaSanXuat");
                int gia = rs.getInt("gia");
                int soLuong = rs.getInt("soLuong");
                sp = new SanPham(id,ten,nhaSanXuat,gia,soLuong);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sp;
    }

    @Override
    public List<SanPham> timKiemTen(String ten) {
        List<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(findByName);
            ps.setString(1,"%"+ten+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String ten1 = rs.getString("ten");
                String nhaSanXuat = rs.getString("nhaSanXuat");
                int gia = rs.getInt("gia");
                int soLuong = rs.getInt("soLuong");
                SanPham sp = new SanPham(id, ten1, nhaSanXuat,gia, soLuong);
                list.add(sp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}

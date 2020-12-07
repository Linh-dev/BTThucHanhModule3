package controller;

import model.SanPham;
import service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Sua",urlPatterns = "/sua")
public class Sua extends HttpServlet {
    Service service = new Service();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        String nhaSanXuat = request.getParameter("nhaSanXuat");
        int gia = Integer.parseInt(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));
        SanPham sp = new SanPham(id, ten, nhaSanXuat, gia, soLuong);
        service.sua(sp);
        List<SanPham> list = service.hienThiAll();
        request.setAttribute("list",list);
        RequestDispatcher rd = request.getRequestDispatcher("view/trangchu.jsp");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        SanPham sp = service.timKiemId(id);
        request.setAttribute("sp",sp);
        RequestDispatcher rd = request.getRequestDispatcher("view/sua.jsp");
        rd.forward(request, response);
    }
}

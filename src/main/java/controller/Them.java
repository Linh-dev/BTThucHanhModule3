package controller;

import model.SanPham;
import service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Them", urlPatterns = "/them")
public class Them extends HttpServlet {
    Service service = new Service();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("ten");
        String nhaSanXuat = request.getParameter("nhaSanXuat");
        int gia = Integer.parseInt(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));
        SanPham sp = new SanPham(ten,nhaSanXuat,gia,soLuong);
        service.them(sp);
        response.sendRedirect("view/them.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

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

@WebServlet(name = "ShowListServlet", urlPatterns = "/trangchu")
public class TrangChu extends HttpServlet {
    Service service = new Service();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tuKhoa = request.getParameter("tuKhoa");
        List<SanPham> list =  service.timKiemTen(tuKhoa);
        request.setAttribute("list",list);
        RequestDispatcher rd = request.getRequestDispatcher("view/trangchu.jsp");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SanPham> list = service.hienThiAll();
        request.setAttribute("list",list);
        RequestDispatcher rd = request.getRequestDispatcher("view/trangchu.jsp");
        rd.forward(request, response);
    }
}

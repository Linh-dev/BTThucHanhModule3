<%--
  Created by IntelliJ IDEA.
  User: bacli
  Date: 12/7/2020
  Time: 1:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center"><a href="/trangchu">Trang Chu</a></h1>
<div align="center">
    <form method="post" action="/sua" >
        <table style="border: solid 1px black; width: 40%">
            <caption><h2>Edit form</h2></caption>
            <tr>
                <td><input type="hidden" name="id" value="${sp.getId()}" ></td>
            </tr>
            <tr>
                <th>Ten</th>
                <td><input type="text" name="ten" value="${sp.getTen()}"></td>
            </tr>
            <tr>
                <th>Nha San Xuat</th>
                <td><input type="text" name="nhaSanXuat" value="${sp.getNhaSanXuat()}"></td>
            </tr>
            <tr>
                <th>Gia</th>
                <td><input type="number" name="gia" value="${sp.getGia()}"></td>
            </tr>
            <tr>
                <th>So Luong</th>
                <td><input type="number" name="soLuong" value="${sp.getSoLuong()}"></td>
            </tr>
            <tr><td><input type="submit" value="Save"></td></tr>
        </table>
    </form>
</div>
</body>
</html>

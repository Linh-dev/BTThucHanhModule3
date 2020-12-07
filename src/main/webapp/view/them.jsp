<%--
  Created by IntelliJ IDEA.
  User: bacli
  Date: 12/7/2020
  Time: 1:43 AM
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
    <form method="post" action="/them" >
        <table style="border: solid 1px black; width: 40%">
            <tr>
                <th>Ten</th>
                <td><input type="text" name="ten"></td>
            </tr>
            <tr>
                <th>Nha San Xuat</th>
                <td><input type="text" name="nhaSanXuat"></td>
            </tr>
            <tr>
                <th>Gia</th>
                <td><input type="number" name="gia"></td>
            </tr>
            <tr>
                <th>So Luong</th>
                <td><input type="number" name="soLuong"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>

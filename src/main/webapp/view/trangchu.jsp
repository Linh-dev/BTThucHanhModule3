<%--
  Created by IntelliJ IDEA.
  User: bacli
  Date: 12/7/2020
  Time: 1:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang Chu</title>
</head>
<body>
<h1 style="text-align: center" >Trang Chu</h1>
<h2 style="text-align: center"><a href="view/them.jsp">Them Moi</a></h2>
<div>
    <form method="post" action="/trangchu">
        <td><input type="text" name="tuKhoa"></td>
        <a href="/timkiem"><td><input type="submit" value="Tim Kiem"></td></a>
    </form>
</div>
<table style="border: solid 1px black; width: 70%">
    <h3><a href="/trangchu">Danh sach</a></h3>
    <tr>
        <td style="width: 15%">Ten</td>
        <td style="width: 20%">Nha san xuat</td>
        <td style="width: 10%">Gia</td>
        <td style="width: 10%">So Luong</td>
        <td style="width: 10%">Action</td>
    </tr>
    <c:forEach items="${list}" var="sp">
        <tr>
            <td><c:out value="${sp.getTen()}"></c:out></td>
            <td><c:out value="${sp.getNhaSanXuat()}"></c:out></td>
            <td><c:out value="${sp.getGia()}"></c:out></td>
            <td><c:out value="${sp.getSoLuong()}"></c:out></td>
            <td>
                <a href="/sua?id=${sp.getId()}"><input type="submit" value="Sua"></a>
                <a href="/xoa?id=${sp.getId()}"><input type="submit" value="Xoa"></a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

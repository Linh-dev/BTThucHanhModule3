<%--
  Created by IntelliJ IDEA.
  User: bacli
  Date: 12/7/2020
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center"><a href="/trangchu">Trang Chu</a></h1>
<table style="border: solid 1px black; width: 70%">
    <h2><caption>Danh sach</caption></h2>
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

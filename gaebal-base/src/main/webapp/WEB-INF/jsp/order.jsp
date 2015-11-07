<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>계발자 주문 페이지</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>계발자 주문 페이지</h2>
    <p>계발자에서 치킨을 주문하고자 하시는 분은 하단에 주문 내역을 추가하여 주시기 바랍니다.</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>주문일시</th>
            <th>주문자</th>
            <th>주소</th>
            <th>연락처</th>
            <th>주문내용</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="order" items="${orders}">
        <tr>
            <td>${order.datetime}</td>
            <td>${order.name}</td>
            <td>${order.address}</td>
            <td>${order.cellphone}</td>
            <td>${order.order}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

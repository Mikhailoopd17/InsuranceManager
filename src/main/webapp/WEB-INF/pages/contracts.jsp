<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contracts</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 2px;
            border-color: black;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
        .design {
            display: inline-block; /* Строчно-блочный элемент */
            padding: 5px 20px; /* Добавляем поля */
            text-decoration: none; /* Убираем подчёркивание у ссылки */
            cursor: pointer; /* Курсор в виде руки */
            background: #deefff; /* Фон для браузеров, не поддерживающих градиент */
            /* Градиент */
            background: -moz-linear-gradient(top, #deefff 0%, #98bede 100%);
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#deefff), color-stop(100%,#98bede));
            background: -webkit-linear-gradient(top, #deefff 0%,#98bede 100%);
            background: -o-linear-gradient(top, #deefff 0%,#98bede 100%);
            background: -ms-linear-gradient(top, #deefff 0%,#98bede 100%);
            background: linear-gradient(top, #deefff 0%,#98bede 100%);
            /*border-radius: 10px; *//* Скругляем уголки */
            border: 1px solid black /*Добавляем синюю рамку */
            /*font: 12px/1 Arial, sans-serif; *//* Рубленый шрифт */
            /*color: #2c539e; *//* Цвет текста и ссылки */
    </style>
</head>
<body>
<h1>Список контрактов</h1>
<br/>
<br/>
<%--<c:url var="addAction" value="/add"/>--%>

<a href="/addContract" class="design">Добавить новый контракт</a>


<%--<button onclick="<c:url value="/add"/>">Добавить новый контракт</button>--%>
<%--<input type="submit" value="<spring:message text="Добавить новый контракт"/>"/>--%>
<br/>
<br/>
<div align="center">
<c:if test="${!empty listContracts}">
    <table class="tg">
        <tr align="center">
            <th width="120">Серия-Номер</th>
            <th width="120">Дата заключения</th>
            <th width="250">Страхователь</th>
            <th width="120">Премия</th>
            <th width="150">Срок действия</th>
        </tr>
        <c:forEach items="${listContracts}" var="contract">
            <tr align="center">
                <td>${contract.id}</td>
                <td>${contract.dateCalc}</td>
                <td>${contract.person.fio}</td>
                <td>${contract.premium}</td>
                <td>${contract.dateFirst} -- ${contract.dateLast}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>

<div align="center">
    <c:if test="${!empty listPerson}">
        <table class="tg">
            <tr align="center">
                <th width="120">Номер</th>
                <th width="120">ФИО</th>
                <th width="250">Дата рождения</th>
            </tr>
            <c:forEach items="${listPerson}" var="person">
                <tr align="center">
                    <td>${person.idPerson}</td>
                    <td>${person.fio}</td>
                    <td>${person.birth}</td>
                    </a>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
<a href="<c:url value='/home'/>">Домашняя страница</a>
</body>
</html>

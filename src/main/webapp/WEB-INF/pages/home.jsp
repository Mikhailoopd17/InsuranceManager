<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Home page</title>
    <style type="text/css">
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
<table>
    <tr>
        <td><a href="<c:url value='/contractsList'/>" class="design">Список контрактов</a></td>
        <td><a href="<c:url value='/personslist'/>" class="design">Список клиентов</a></td>
    </tr>
</table>
<br/>
</body>
</html>
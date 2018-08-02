<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
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
<h1>Форма добавления нового клиента</h1>

<sf:form method="POST" modelAttribute="person">
    <fieldset>
    <table>
        <tr>
            <td>
                <label for="fio">ФИО</label>
            </td>
            <td>
                <sf:input path="Fio" id="fio"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="birth">Дата рождения</label>
            </td>
            <td>
                <sf:input path="Birth" id="birth" type="date"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="passport">Паспотрные данные</label>
            </td>
            <td>
                <sf:input path="Passport" id="passport"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                    <input type="submit" value="Добавить"/>
            </td>
        </tr>
    </table>
    </fieldset>
</sf:form>
<a href="<c:url value='/home'/>">Домашняя страница</a>
</body>
</html>

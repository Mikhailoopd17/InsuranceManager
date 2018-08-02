<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add new contract</title>
    <style type="text/css">
        .auto-style1 {
            width: 141px;
        }
        .auto-style2 {
            width: 116px;
        }
        #Select1 {
            width: 103px;
        }
        .auto-style3 {
            width: 30px;
        }
        .auto-style4 {
            width: 112px;
        }
        .auto-style5 {
            width: 122px;
        }
        .auto-style6 {
            width: 173px;
        }
        #Button1 {
            width: 125px;
        }
        #Button2 {
            width: 125px;
        }
        #Select2 {
            width: 103px;
        }
        #Button2 {
            width: 125px;
        }
        .auto-style7 {
            width: 207px;
            font-size: medium;
        }
        #Button3 {
            width: 125px;
        }
        #Button3 {
            width: 125px;
        }
        .auto-style8 {
            width: 207px;
        }
        #Text14 {
            width: 383px;
        }
        #Button4 {
            width: 125px;
        }
        #Button4 {
            width: 125px;
        }
        #Select2 {
            width: 103px;
        }
        #Button5 {
            width: 125px;
        }
        .auto-style9 {
            width: 178px;
            font-size: medium;
        }
        .auto-style10 {
            width: 178px;
        }
        .auto-style11 {
            width: 178px;
            font-size: xx-small;
            text-align: center;
        }
        #Text23 {
            width: 219px;
        }
        #Select3 {
            width: 103px;
        }
        #Select3 {
            width: 103px;
        }
        .auto-style18 {
            width: 178px;
            height: 27px;
        }
        .auto-style19 {
            width: 116px;
            height: 27px;
        }
        .auto-style20 {
            width: 30px;
            height: 27px;
        }
        .auto-style21 {
            width: 112px;
            height: 27px;
        }
        .auto-style22 {
            width: 122px;
            height: 27px;
        }
        .auto-style23 {
            width: 173px;
            height: 27px;
        }
        #Select4 {
            width: 103px;
        }
        #Select4 {
            width: 103px;
        }
        .auto-style24 {
            font-size: medium;
        }
        .auto-style25 {
            width: 135px;
        }
        #TextArea1 {
            height: 59px;
            width: 934px;
            margin-top: 0px;
        }
        #Button5 {
            width: 125px;
        }
        #Button5 {
            width: 125px;
        }
        #Button6 {
            width: 125px;
        }
        #Button6 {
            width: 125px;
        }
        #Button6 {
            width: 125px;
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
<h2>Новый контракт</h2>


<div style="height: 197px; width: 1097px">
    <table style="width:98%;">
        <tr>
            <td class="auto-style3">Страховая сумма</td>
            <td class="auto-style1">
                <input id="sum" type="text" />
            </td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">Срок действия</td>
            <td class="auto-style5">с&nbsp;
                <input id="datefirst" type="date" />
            </td>
            <td class="auto-style6">по&nbsp;
                <input id="datelast" type="date" />
            </td>

        </tr>
        <tr>
            <td class="auto-style1">Тип недвижимости</td>
            <td class="auto-style2">
                <select id="type" name="D1">
                    <option>Квартира</option>
                    <option>Дом</option>
                    <option>Комната</option>
                </select></td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style1">Год постройки</td>
            <td class="auto-style2">
                <input id="datebuild" type="date" /></td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style1">Площадь,м.кв.</td>
            <td class="auto-style2">
                <input id="area" type="text" /></td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style1">&nbsp;</td>
            <td class="auto-style2">&nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">
                <input id="calculate" type="button" value="Рассчитать" /></td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style1">Дата расчета</td>
            <td class="auto-style2">
                <input id="datecalc" type="text" /></td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style5">Премия</td>
            <td class="auto-style6">
                <input id="premium" type="text" readonly="true" /></td>
        </tr>
        <tr>
            <td class="auto-style1">&nbsp;</td>
            <td class="auto-style2">&nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
    </table>
    <br />
</div>
<div style="height: 163px; width: 1099px">
    <table style="width:98%;">
        <tr>
            <td class="auto-style7"><strong>СТРАХОВАТЕЛЬ</strong></td>
            <td class="auto-style7">&nbsp;</td>
            <td class="auto-style2">
                &nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style8">
                <input id="Button3" type="button" value="Выбрать" /></td>
            <td class="auto-style8">
                ФИО</td>
            <td class="auto-style2">
                <input id="Text14" type="text" /></td>
            <td class="auto-style3">
                <input id="Button4" type="button" value="Изменить" /></td>
        </tr>
        <tr>
            <td class="auto-style8">&nbsp;</td>
            <td class="auto-style8">Дата рождения</td>
            <td class="auto-style8">
                <input id="Text15" type="text" /></td>
            <td class="auto-style3">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style8">&nbsp;</td>
            <td class="auto-style8">Паспорт</td>
            <td class="auto-style2">
                <input id="Text12" type="text" /></td>
            <td class="auto-style3">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style8">&nbsp;</td>
            <td class="auto-style8">&nbsp;</td>
            <td class="auto-style2">
                серия</td>
            <td class="auto-style3">номер</td>
        </tr>
    </table>
</div>

<div style="height: 197px; width: 1097px">
    <table style="width:98%;">
        <tr>
            <td class="auto-style9"><strong>Адрес недвижимости</strong></td>
            <td class="auto-style2">
                &nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style10">
                <select id="Select3" name="D3">
                    <option></option>
                </select></td>
            <td class="auto-style2">
                <input id="Text16" type="text" /></td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">
                <input id="Text24" type="text" /></td>
            <td class="auto-style5">
                <input id="Text25" type="text" /></td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style11">Государство</td>
            <td class="auto-style2">
                индекс</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">республика, край</td>
            <td class="auto-style5">район</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style18">
                <input id="Text26" type="text" /></td>
            <td class="auto-style19">
                <input id="Text27" type="text" /></td>
            <td class="auto-style20">
                <input id="Text28" type="text" /></td>
            <td class="auto-style21">
                <input id="Text29" type="text" /></td>
            <td class="auto-style22">
                <input id="Text30" type="text" /></td>
            <td class="auto-style23">
                <input id="Text31" type="text" /></td>
        </tr>
        <tr>
            <td class="auto-style10">населенный пункт</td>
            <td class="auto-style2">
                улица</td>
            <td class="auto-style3">дом</td>
            <td class="auto-style4">корпус</td>
            <td class="auto-style5">строение</td>
            <td class="auto-style6">квартира</td>
        </tr>
        <tr>
            <td class="auto-style10">&nbsp;</td>
            <td class="auto-style2">&nbsp;</td>
            <td class="auto-style3">&nbsp;</td>
            <td class="auto-style4">
                &nbsp;</td>
            <td class="auto-style5">&nbsp;</td>
            <td class="auto-style6">&nbsp;</td>
        </tr>
    </table>
    <br />
</div>


<div style="height: 197px; width: 1097px">
    <strong><span class="auto-style24">КОММЕНТАРИЙ<br />
    </span>
        <table style="width:100%;">
            <tr>
                <td class="auto-style25"><strong><span class="auto-style24">Коментарии к договору не печатаются на полисе</span></strong></td>
                <td>
                    <textarea id="TextArea1" name="S1"></textarea></td>
            </tr>
        </table>
    </strong>
    <br />
    <table style="width:100%;">
        <tr>
            <td>
                <input id="Button5" type="submit" value="Сохранить" /></td>
            <td>
                <a href="/contracts" class="design">К списку контрактов</a>
        </tr>
    </table>
</div>
<a href="<c:url value='/home'/>">Домашняя страница</a>
</body>
</html>





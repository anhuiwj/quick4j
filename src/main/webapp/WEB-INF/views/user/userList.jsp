<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/views/include/lib.jsp" %>
<%--<%--%>
    <%--String path = request.getContextPath();--%>
    <%--String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";--%>
<%--%>--%>
<html>
<head>
    <%@include file="/WEB-INF/views/include/static-js.jsp" %>
    <%@include file="/WEB-INF/views/include/statics-css.jsp" %>
    <title>Title</title>
</head>
<body>
    <div class ="tableContainer">
    <table class ="table table-hover table-striped">
        <thead>
        <tr>
            <th class ="col-md-4 text-center"> 乘车码 </th >
            <th class ="col-md-4 text-center"> 订单号 </th >
            <th class ="col-md-4 text-center"> 订单日期 </th >
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>213 </td>
            <td> 22 </td>
            <td>22</td>
        </tr>
        </tbody>
    </table>
    <ul id ="example"></ul>
    </div >
</body>
</html>

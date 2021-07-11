
<%--
  Created by IntelliJ IDEA.
  User: Feat丶Mellow
  Date: 2021/7/10
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--
<h3>展示数据</h3>
<div>文件id：${files.id}</div>
<div>文件名称：${files.filename}</div>
<div>文件地址：${files.fileurl}</div>
-->
<c:forEach items="${pager.datas}" var="order" varStatus="now">
    <table border="1">
        <tr>     <td>网址编号</td><td>${files.id}</td></tr>
        <tr>     <td>网址名称</td><td>${files.filename}</td></tr>
        <tr>     <td>网址地址</td><td><a href="${files.fileurl}">${files.fileurl}</a></td></tr>
    </table>
</c:forEach>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: FeatؼMellow
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
<h3>չʾ����</h3>
<div>�ļ�id��${files.id}</div>
<div>�ļ����ƣ�${files.filename}</div>
<div>�ļ���ַ��${files.fileurl}</div>
-->
<c:forEach items="${pager.datas}" var="order" varStatus="now">
    <table border="1">
        <tr>     <td>��ַ���</td><td>${files.id}</td></tr>
        <tr>     <td>��ַ����</td><td>${files.filename}</td></tr>
        <tr>     <td>��ַ��ַ</td><td><a href="${files.fileurl}">${files.fileurl}</a></td></tr>
    </table>
</c:forEach>
</body>
</html>

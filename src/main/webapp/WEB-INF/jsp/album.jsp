<%--
  Created by IntelliJ IDEA.
  User: Drag
  Date: 06.07.2017
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Album</title>
    <table border="1" cellpadding="8" cellspacing="0">
    <c:forEach items="${files}" var="file">
        <jsp:useBean id="file" scope="page" type="com.drag.ftptowebpictures.model.File"/>
        <tr>
            <td><img src="/getImage?imageId=${file.id}"/></td>
        </tr>
    </c:forEach>
    </table>
</head>
<body>

</body>
</html>

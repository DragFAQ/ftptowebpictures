<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>FtpToWebPictures</title>
    <form method="post">
        <input type="text" name="login"><br />
        <input type="password" name="password"><br />
        <button type="submit" formaction="/login">Login</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button type="submit" formaction="/reindex">Reindex</button>
    </form>
</head>
<body>

</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <%-- Metadata --%>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <%-- CSS --%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />

        <%-- JS --%>
        <script src="${pageContext.request.contextPath}/js/index.js"></script>
    </head>
    <body>
        <div class="left-panel">
            <%@ include file="tMenu.jsp" %>
        </div>
        <div class="right-dashboard">
        </div>
    </body>
    <footer></footer>
</html>
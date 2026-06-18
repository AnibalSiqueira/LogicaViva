<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<DOCTYPE html>
<html>
    <head>
        <!-- Metadata -->
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <!-- CSS -->
        <link rel="stylesheet" href="css/styles.css" />
        <link rel="stylesheet" href="css/login.css" />

        <!-- JS -->
        <%-- 
            Some of the scripts will be 
            at the bottom of the page to 
            load correctly. 
        --%>
        <script src="js/index.js"></script>

        <title>Index</title>

        <!-- TODO: Add favicon -->
    </head>
    <header>
    </header>
    <body>
        <div>
            <form action="submit" method="post" name="login-form">

                <label for="email">E-Mail:</label>
                <input type="text" id="email" name="email" value="userEmail" />

                <label for="password">Senha:</label>
                <input type="password" id="password" name="passwd" value="userPassword" />

                <input type="submit" id="submit" value="enviar" /> 
            </form>
        </div>
    </body>
    <footer>
    </footer>
</html>
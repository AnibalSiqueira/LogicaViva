//package br.edu.ifsuldeminas.logicaviva.servlet;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import br.edu.ifsuldeminas.logicaviva.model.User;
//
//import java.io.IOException;
//
///**
// *
// *
// * @author Anibal Siqueira
// */
//@WebServlet(urlPatterns = "/login")
//public class AuthServlet extends HttpServlet {
//
//    String email;
//    String password;
//    AuthFilter authFilter;
//
//    @Override
//    public void init() {
//        authFilter = new AuthFilter();
//    }
//
//    @Override
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        /*
//        Todo:
//         * Login verification;
//         * Password hashing;
//         * Account creation;
//         * Session status;
//         */
//        this.email = request.getParameter("email");
//        this.password = request.getParameter("password");
//
//
//        if(AuthService.authenticate(email, password)) {
//            request.getSession(true);
//        }
//
//    }
//
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //Forwards any get requests to login.jsp.
//        //P.S. It's fine since all other requests are handled through post.
//        String loginPath = getServletContext().getRealPath("/views/login.jsp");
//        System.out.println("Resolved path: " + loginPath); // check your GlassFish log
//        request.getRequestDispatcher("/views/login.jsp").forward(request, response);
//    }
//
//    //Request (Username and password hash) -> Check auth -> Response (Either true or false depending on privileges and registration)
//
//}

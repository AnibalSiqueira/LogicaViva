package br.edu.ifsuldeminas.logicaviva.servlet;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Anibal Siqueira
 * ---------------------------------------------------
 * This class executes before any other Servlet
 * due to it being a filter, this way, it's guaranteed
 * that there's a user connected.
 * The password is checked during doPost() not it's
 * passage here.
 */
@WebFilter(urlPatterns = "/*")
public class AuthFilter extends HttpFilter {

    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
            if (req.getDispatcherType() == DispatcherType.FORWARD ||
                    req.getDispatcherType() == DispatcherType.INCLUDE) {
                chain.doFilter(req, res);
                return;
            }

            String path = req.getRequestURI();
            String contextPath = req.getContextPath();

            // Whitelist public paths — let them through without a session check
            if (path.equals(contextPath + "/login") || path.startsWith(contextPath + "/css/") || path.startsWith(contextPath + "/js/")) {
                chain.doFilter(req, res);
                return;
            }

            HttpSession session = req.getSession(false);

            boolean loggedIn = session != null && session.getAttribute("user") != null;

            //If true then it lets it pass through.
            if(loggedIn) {
                chain.doFilter(req, res);
            } else {
                res.sendRedirect(req.getContextPath() + "/login");
            }

    }

}

package br.edu.ifsuldeminas.logicaviva.servlet;

import br.edu.ifsuldeminas.logicaviva.model.Teacher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *
 *
 * @author Anibal Siqueira
 */
@WebServlet("/Teacher")
public class TeacherServlet extends HttpServlet{

    /**
     * This method Overrides the init() method provided in the
     * HttpServlet class, it starts objects and other resources
     * necessary for the session executed during runtime
     *
     */
    @Override
    public void init() {
        Teacher teacher = new Teacher();
    }

    /**
     * This method creates a single hashed password and returns it as a String
     */
    public String passwordHash() {
        return "s";
    }

}

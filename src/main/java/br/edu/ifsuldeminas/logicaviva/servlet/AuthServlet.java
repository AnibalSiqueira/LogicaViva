package br.edu.ifsuldeminas.logicaviva.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/*")
public class AuthServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

}

package br.edu.ifsuldeminas.logicaviva.servlet;

import jakarta.servlet.FilterChain;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter
public class AuthFilter extends HttpFilter {

    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) {



    }

}

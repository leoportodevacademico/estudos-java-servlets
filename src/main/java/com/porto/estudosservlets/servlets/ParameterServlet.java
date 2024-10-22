package com.porto.estudosservlets.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/dados-pessoais")
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");
        String userAgent = req.getHeader("User-Agent");

        res.setContentType("text/html");
        res.getWriter().println("<p>Nome: " + nome + "</p>");
        res.getWriter().println("<p>Idade: " + idade + "</p>");
        res.getWriter().println("<p>User Agent: " + userAgent + "</p>");
    }
}

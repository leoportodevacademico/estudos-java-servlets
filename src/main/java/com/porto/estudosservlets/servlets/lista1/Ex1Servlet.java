package com.porto.estudosservlets.servlets.lista1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/ex1")
public class Ex1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<p>Hello, World!</p>");
    }
}

//### **1. Crie um Servlet Simples**
//
//        - Crie um Servlet que responda com a mensagem "Hello, World!" quando acessado via navegador.

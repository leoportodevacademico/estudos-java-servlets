package com.porto.estudosservlets.servlets.lista1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/ex2")
public class Ex2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");

        res.setContentType("text/html");
        res.getWriter().println("<p>Nome: " + nome + "</p>");
        res.getWriter().println("<p>Idade: " + idade + "</p>");
    }
}

//### **2. Manipule Parâmetros via GET**
//- Crie um Servlet que receba o nome e a idade de uma pessoa via parâmetros
//GET e exiba-os na resposta.

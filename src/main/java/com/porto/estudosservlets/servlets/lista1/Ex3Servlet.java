package com.porto.estudosservlets.servlets.lista1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/ex3")
public class Ex3Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");

        res.getWriter().println("Dados Recebidos!");
        res.getWriter().println("Nome: " + nome);
        res.getWriter().println("Idade: " + idade);
    }
}

//### **3. Manipule Parâmetros via POST**
//- Crie um formulário HTML que envie dados via POST para um Servlet.
//O Servlet deve exibir os dados enviados.

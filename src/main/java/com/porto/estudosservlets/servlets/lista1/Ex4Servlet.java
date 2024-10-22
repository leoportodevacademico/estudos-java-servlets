package com.porto.estudosservlets.servlets.lista1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/ex4")
public class Ex4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        res.getWriter().println("Recebemos uma requisicao GET no EX4");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        res.getWriter().println("Recebemos uma requisicao POST no EX4");
    }
}


//### **4. Crie um Servlet com `doGet()` e `doPost()`**
//- Implemente um Servlet que processe requisições tanto GET quanto POST
// e responda com diferentes mensagens para cada método.

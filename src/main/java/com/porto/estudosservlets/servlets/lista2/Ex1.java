package com.porto.estudosservlets.servlets.lista2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/lista2-ex1")
public class Ex1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<html>");
        res.getWriter().println("<header>");
        res.getWriter().println("<title>Lista 2 - Ex 1</title>");
        res.getWriter().println("</header>");
        res.getWriter().println("<body>");
        res.getWriter().println("<h1>Lista 2 - Ex 1</h1>");
        res.getWriter().println("</body>");
        res.getWriter().println("</html>");
    }
}

//1. **Crie um Servlet que responda com HTML**: Faça um Servlet que, ao
// ser acessado, responda com uma página HTML simples contendo um cabeçalho e um parágrafo.

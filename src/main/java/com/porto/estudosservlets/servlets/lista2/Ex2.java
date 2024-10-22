package com.porto.estudosservlets.servlets.lista2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/lista2-ex2")
public class Ex2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String json = "[{\"name\":\"Product1\",\"price\":10.99},{\"name\":\"Product2\",\"price\":15.49},{\"name\":\"Product3\",\"price\":7.99}]";

        res.setContentType("application/json");
        res.getWriter().println(json);
    }
}


//2. **Crie um Servlet que responda com JSON**: Implemente um Servlet que retorne
// dados em formato JSON, como uma lista de produtos com nome e preço.

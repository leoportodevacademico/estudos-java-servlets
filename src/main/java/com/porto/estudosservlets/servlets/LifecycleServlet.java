package com.porto.estudosservlets.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/ciclo-de-vida")
public class LifecycleServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet foi iniciado!");
        System.out.println(config);
    }

    @Override
    public void destroy() {
        System.out.println("Servlet está sendo destruído...Xau!");
    }
}

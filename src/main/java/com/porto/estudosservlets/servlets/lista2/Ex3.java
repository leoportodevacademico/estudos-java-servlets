package com.porto.estudosservlets.servlets.lista2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "lista2-ex3")
public class Ex3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("application/pdf");
        res.setHeader("Content-Disposition", "attachment; filename=\"sample-1.pdf\"");
    }
}

//3. **Envie um arquivo PDF como resposta**: Crie um Servlet que permita o
// download de um arquivo PDF quando acessado. Use o cabeçalho correto para forçar o download.

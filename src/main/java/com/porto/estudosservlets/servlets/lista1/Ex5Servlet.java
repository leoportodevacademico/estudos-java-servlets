package com.porto.estudosservlets.servlets.lista1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet(urlPatterns = "/ex5")
public class Ex5Servlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Iniciando o servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Recebendo alguma requisicao no servlet"); 
    }

    @Override
    public void destroy() {
        System.out.println("Finalizando o servlet");
    }
}


//### **5. Ciclo de Vida do Servlet**
//- Crie um Servlet que sobrescreva os métodos `init()`, `service()`, e `destroy()`.
// Adicione mensagens de log para cada fase do ciclo de vida e observe o comportamento.

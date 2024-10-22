Aqui estão 5 exemplos de **Servlets** com diferentes funcionalidades para ajudar a ilustrar como eles podem ser usados
em aplicações Java web. Cada exemplo cobre um caso de uso comum no desenvolvimento web com Servlets.

### 1. Servlet Básico: Resposta "Hello, World!"

Este é um exemplo clássico e simples, onde o Servlet responde com "Hello, World!" quando a página é acessada.

```java
package com.example.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Hello, World!</h1>");
    }
}
```

**Explicação:**

- Método `doGet()` é chamado quando uma requisição GET é feita para o Servlet.
- `resp.getWriter().println()` envia a resposta ao cliente, neste caso um HTML simples com a mensagem "Hello, World!".

---

### 2. Servlet de Leitura de Parâmetros de Requisição

Este Servlet lê parâmetros enviados pela URL e os exibe na resposta.

```java
package com.example.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Olá, " + nome + "!</h1>");
        resp.getWriter().println("<p>Você tem " + idade + " anos.</p>");
    }
}
```

**Explicação:**

- Parâmetros podem ser passados na URL, como `?nome=Leonardo&idade=30`.
- `req.getParameter()` captura os valores dos parâmetros e os utiliza na resposta.

---

### 3. Servlet para Redirecionamento de Página

Este Servlet redireciona o usuário para outra página (ou URL) usando o método `sendRedirect()`.

```java
package com.example.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Redireciona o usuário para o Google
        resp.sendRedirect("https://www.google.com");
    }
}
```

**Explicação:**

- O método `sendRedirect()` envia uma resposta ao cliente para redirecioná-lo para outra URL.
- Neste caso, o usuário é redirecionado para o site do Google.

---

### 4. Servlet de Upload de Arquivos

Este Servlet permite o upload de arquivos do cliente para o servidor.

```java
package com.example.servlets;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Pega o arquivo enviado
        Part filePart = req.getPart("file");
        String fileName = filePart.getSubmittedFileName();
        String uploadDir = "C:/uploads"; // Diretório onde o arquivo será salvo

        // Salva o arquivo no diretório especificado
        filePart.write(uploadDir + File.separator + fileName);

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Upload concluído com sucesso: " + fileName + "</h1>");
    }
}
```

**Explicação:**

- O Servlet está anotado com `@MultipartConfig`, o que o habilita para lidar com uploads de arquivos.
- `req.getPart("file")` obtém o arquivo enviado, e o método `write()` salva o arquivo no servidor.

---

### 5. Servlet para Gerenciamento de Sessão

Este Servlet mostra como criar e gerenciar sessões de usuário. Ele conta o número de visitas do usuário ao site.

```java
package com.example.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        Integer visitas = (Integer) session.getAttribute("visitas");

        if (visitas == null) {
            visitas = 0;
        }
        visitas++;

        // Armazena o número de visitas na sessão
        session.setAttribute("visitas", visitas);

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Visitas: " + visitas + "</h1>");
    }
}
```

**Explicação:**

- `req.getSession()` retorna a sessão atual do usuário.
- O Servlet armazena e atualiza o número de visitas na sessão.
- A cada requisição, o número de visitas é incrementado e exibido ao usuário.

---

### Conclusão

Esses 5 exemplos mostram diferentes funcionalidades dos Servlets, desde o básico (como responder com uma mensagem) até o
gerenciamento de sessões e upload de arquivos. Com essas bases, você pode expandir suas aplicações web em Java e criar
soluções mais robustas e interativas.
### **1. Introdução aos Servlets**

- O que são Servlets
- Arquitetura de Servlets
- Diferença entre CGI e Servlets

### **2. Configuração de Ambiente**

- Instalação e configuração do servidor Apache Tomcat
- Configuração do ambiente de desenvolvimento no Eclipse/IntelliJ
- Estrutura de um projeto Java Web com Servlets

### **3. Ciclo de Vida de um Servlet**

- Métodos `init()`, `service()`, e `destroy()`
- Ciclo completo de criação e destruição de um Servlet

### **4. Criação de um Servlet Simples**

- Estrutura básica de um Servlet
- Implementação dos métodos `doGet()` e `doPost()`
- Mapeamento de Servlets usando `web.xml`

### **5. Manipulação de Requisições HTTP**

- `HttpServletRequest` e `HttpServletResponse`
- Parâmetros de requisição (GET e POST)
- Manipulação de cabeçalhos HTTP

### **6. Respostas HTTP**

- Tipos de respostas HTTP
- Status codes e sua utilização em Servlets
- Redirecionamento com `sendRedirect()`
- Encaminhamento de requisições com `RequestDispatcher`

### **7. Controle de Sessões**

- Introdução a `HttpSession`
- Armazenamento de dados de usuário em sessões
- Gerenciamento de tempo de expiração de sessão

### **8. Cookies**

- Criação e leitura de cookies
- Diferença entre cookies de sessão e persistentes
- Limitações e segurança dos cookies

### **9. Filtros (Filters)**

- O que são e como funcionam
- Implementação de filtros para validação e logging
- Cadeias de filtros

### **10. Listeners**

- Introdução a `ServletContextListener` e `HttpSessionListener`
- Aplicações práticas de listeners
- Gerenciamento de eventos no ciclo de vida da aplicação

### **11. ServletContext**

- Uso do `ServletContext` para compartilhamento de dados entre Servlets
- Configuração de parâmetros no `web.xml`

### **12. Forward e Redirect**

- Diferença entre `forward()` e `sendRedirect()`
- Exemplos práticos de uso de ambos os métodos

### **13. Gerenciamento de Threads**

- Como os Servlets tratam múltiplas requisições de forma concorrente
- Gerenciamento de segurança e sincronização de recursos compartilhados

### **14. Upload e Download de Arquivos**

- Implementação de upload de arquivos usando Servlets
- Configuração de permissões e limites de tamanho de arquivo
- Download de arquivos através de Servlets

### **15. Tratamento de Erros e Exceções**

- Configuração de páginas de erro personalizadas no `web.xml`
- Exceções específicas de Servlets
- Manipulação de erros com código HTTP

### **16. Padrão MVC com Servlets**

- Estrutura MVC com Servlets, JSP e JavaBeans
- Divisão de responsabilidades entre camadas
- Uso do `RequestDispatcher` para navegação

### **17. Integração com JSP**

- Comunicação entre Servlets e JSP usando atributos de requisição
- Forward para JSPs
- Uso de `Expression Language (EL)` e JSTL em JSPs

### **18. Autenticação e Autorização**

- Implementação de login/logout com Servlets e sessões
- Controle de acesso a páginas protegidas
- Autenticação baseada em formulário e segurança declarativa

### **19. Pool de Conexões com JDBC**

- Configuração de pool de conexões no `context.xml` do Tomcat
- Integração de Servlets com banco de dados via JDBC
- Melhores práticas para uso de conexões de banco em Servlets

### **20. Cacheamento de Respostas**

- Como configurar cache em respostas HTTP
- Cache-Control e ETags
- Exemplos de cache de recursos estáticos

### **21. Streaming de Dados**

- Servlets para streaming de grandes arquivos (imagens, vídeos)
- Otimização de desempenho em streaming

### **22. Internacionalização (i18n) e Localização (l10n)**

- Configuração de Servlets para suporte a múltiplos idiomas
- Uso de `Locale` e `ResourceBundles`
- Implementação de sistemas multilíngues

### **23. Deploy de Aplicações Servlet**

- Empacotamento de arquivos `.war`
- Deploy no Tomcat e outros servidores de aplicação
- Configuração de servidores para aplicações Java Web

### **24. Integração com REST APIs**

- Exposição de APIs REST usando Servlets
- Tratamento de requisições JSON e XML
- Implementação de endpoints RESTful com Servlets

### **25. Streaming de Dados em Tempo Real (Servlet 3.1)**

- Introdução ao conceito de Non-blocking I/O (NIO)
- Implementação de Servlets assíncronos
- Uso de Servlets para streaming em tempo real

### **26. WebSockets com Servlets**

- Introdução ao protocolo WebSocket
- Configuração de WebSockets em aplicações Java
- Implementação de comunicação bidirecional com Servlets

### **27. Integração com Frameworks**

- Uso de Servlets em conjunto com frameworks como Spring MVC
- Como os Servlets funcionam dentro de um contêiner de inversão de controle (IoC)

### **28. Segurança com HTTPS**

- Configuração de SSL no Tomcat
- Redirecionamento de requisições HTTP para HTTPS
- Criação de certificados e configuração de criptografia

### **29. Performance e Escalabilidade**

- Técnicas para melhorar o desempenho de Servlets
- Uso de cache de dados e otimizações no lado do servidor
- Considerações para aplicações escaláveis

### **30. Testes de Servlets**

- Testes unitários de Servlets com frameworks como JUnit e Mockito
- Testes de integração com Tomcat Embutido
- Testes de performance e carga para Servlets

Esse guia cobre desde os fundamentos de Servlets até tópicos avançados como segurança, integração com APIs e frameworks,
além de técnicas de desempenho e testes.#   e s t u d o s - j a v a - s e r v l e t s  
 
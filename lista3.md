Aqui está uma lista com **20 exercícios** para praticar os conceitos abordados no artigo sobre **controle de sessões**
com **`HttpSession`**, incluindo o armazenamento de dados, gerenciamento de expiração de sessão e validação de sessão.

---

### **Exercícios sobre Criação e Armazenamento em Sessões:**

1. **Crie um Servlet que armazene o nome do usuário na sessão**:
    - Crie um Servlet que solicite o nome do usuário via GET e o armazene na sessão usando `setAttribute()`.

2. **Armazene o número de acessos de um usuário em uma sessão**:
    - Crie um Servlet que conte quantas vezes um usuário acessou a página e exiba esse número, armazenando-o na sessão.

3. **Simule um carrinho de compras com sessões**:
    - Implemente um Servlet que permita adicionar itens a um "carrinho de compras", armazenando esses itens na sessão.

4. **Crie um sistema de login simples com sessão**:
    - Desenvolva um Servlet que, após um login bem-sucedido, armazene o nome do usuário na sessão e redirecione-o para
      uma página de boas-vindas.

5. **Armazene preferências de tema (claro ou escuro) em uma sessão**:
    - Crie um Servlet que permita ao usuário escolher entre o tema claro e o escuro, e salve essa preferência na sessão.

---

### **Exercícios sobre Recuperação de Dados de Sessão:**

6. **Recupere e exiba o nome do usuário armazenado na sessão**:
    - Crie um Servlet que recupere o nome do usuário armazenado na sessão e exiba uma saudação personalizada.

7. **Verifique se um atributo de sessão existe antes de exibi-lo**:
    - Implemente um Servlet que verifique se o atributo "usuário" está presente na sessão antes de exibi-lo. Se não
      estiver, redirecione para uma página de login.

8. **Simule uma página de perfil utilizando dados da sessão**:
    - Crie um Servlet que mostre uma página de perfil para o usuário, exibindo informações armazenadas na sessão, como
      nome e e-mail.

9. **Verifique se um usuário está logado**:
    - Implemente um Servlet que verifique se o usuário está logado (armazenado na sessão). Caso contrário, redirecione-o
      para a página de login.

10. **Recupere e liste todos os itens armazenados no "carrinho de compras" da sessão**:

- Faça um Servlet que recupere todos os itens armazenados na sessão e exiba-os como uma lista de compras.

---

### **Exercícios sobre Expiração de Sessões:**

11. **Defina o tempo de expiração de uma sessão para 5 minutos**:

- Crie um Servlet que defina o tempo de expiração da sessão como 5 minutos. Exiba uma mensagem indicando o tempo
  restante.

12. **Implemente uma verificação de sessão expirada**:

- Crie um Servlet que verifique se a sessão do usuário expirou (se não existe mais). Se a sessão tiver expirado,
  redirecione para uma página de login.

13. **Implemente um logout que invalide a sessão**:

- Faça um Servlet que permita o usuário "deslogar" da aplicação, invalidando a sessão atual com `invalidate()`.

14. **Defina um tempo de expiração personalizado via parâmetros**:

- Crie um Servlet que permita ao usuário definir, via formulário, o tempo de expiração da sessão em minutos.

15. **Crie uma página de erro personalizada para sessão expirada**:

- Implemente um Servlet que, ao detectar uma sessão expirada, redirecione o usuário para uma página de erro
  personalizada, informando que a sessão expirou.

---

### **Exercícios sobre Manipulação Avançada de Sessões:**

16. **Armazene um objeto complexo (como uma lista) na sessão**:

- Crie um Servlet que armazene uma lista de objetos (como produtos) na sessão e exiba-os na página do usuário.

17. **Compartilhe dados entre diferentes Servlets usando `HttpSession`**:

- Crie dois Servlets: o primeiro armazena um dado na sessão, e o segundo recupera esse dado e exibe para o usuário.

18. **Implemente uma página de configuração com dados persistentes na sessão**:

- Crie um Servlet que permita o usuário ajustar configurações da aplicação (como idioma ou layout), e persista essas
  configurações na sessão para uso futuro.

19. **Combine sessões com cookies para login automático**:

- Crie um Servlet que, após o login, armazene os dados do usuário em uma sessão e também crie um cookie. Ao visitar o
  site novamente, se o cookie estiver presente, faça o login automaticamente.

20. **Implemente uma página de status de sessão**:

- Crie um Servlet que mostre informações detalhadas sobre a sessão do usuário, como o ID da sessão, o tempo de expiração
  restante, e os atributos armazenados.

---

Esses exercícios ajudam a consolidar os conceitos relacionados ao controle de sessões com **`HttpSession`**, incluindo
como armazenar, recuperar e gerenciar dados de sessão, além de explorar a expiração e manipulação avançada de sessões.
Ao praticá-los, você terá uma compreensão mais profunda de como gerenciar o estado do usuário em aplicações web com
Java.
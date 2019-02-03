Teste QA BeBlue

Processo Seletivo - Teste (Analista QA) 
Para o projeto em questão foram utilizados:
    • O Teste foi realizado um pouco em PageObjects, como haviam páginas de apenas um clique deixei os testes em uma única classe
    • Selenium WebDriver com Maven para criação dos testes

O Cenário proposto foi:
Passo: 01 – Acessar o site www.magazineluiza.com
Passo 02 – Selecionar um produto no campo busca (Iphone 7)
Passo 03 – Colocar o produto no carrinho de compras
Passo 04 – Validar que o produto foi inserido com sucesso
Pacotes e classes:
Separei as classes nos seguintes pacotes para ter uma melhor percepção de PageObjects:
Pages – Neste pacote estao as classes onde foram mapeadas os objetos que se interagem nas páginas do sistema, também inserida uma BasePage onde a mesma mapeia o WebDriver do sistema.
Suporte – Neste pacote estão as classes onde dão suporte as outras classes do projeto por exemplo a classe Web, que inicia o WebDriver e abre o navegador no inicio de todos os testes, e tambem já abre o site informado, Screenshot, classe que usada em uma classe de teste tira um screenshot dos testes informados.
Tests – Neste pacote ficam os testes, nela é usada o mapeamento feito nas Pages para realização dos passos de teste.

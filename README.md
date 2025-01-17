<p align="center">
	
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/EdileneLopes/Api-alunos?color=%2304D361">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/EdileneLopes/Api-alunos">
  
  <a href="https://github.com/EdileneLopes/Api-alunos/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/EdileneLopes/Api-alunos">
  </a>
    
  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
  <a href="https://github.com/EdileneLopes/Api-alunos/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/EdileneLopes/Api-alunos?style=social">
  </a>

  <a href="">
    <img alt="Gamados por Java" src="https://img.shields.io/badge/Grupo - Gamados por Java-tomato">
  </a>

<h2 align="center">🚧 🚀 Luiza Code - 2° Edição - DESAFIO FINAL 🚀🚧</h2>

**<p align="center"> Uma das funcionalidades mais interessantes em um e-commerce é a Wishlist, ou a lista de desejos. No e-commerce o cliente pode realizar a busca de produtos, ou pode acessar a tela de detalhes do produto. Em ambas as telas ele pode selecionar os produtos de sua preferência e armazená-los na sua Wishlist. A qualquer momento o cliente pode visualizar sua Wishlist completa, com todos os produtos que ele selecionou em uma única tela.</p>**

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-documentação-completa">Documentação</a> •
 <a href="#-funcionalidades">Funcionalidades</a> •
 <a href="#-como-executar-o-projeto">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> • 
 <a href="#-contribuidores">Contribuidores</a> • 
 <a href="#-licença">Licença</a>
</p>

## 💻 Sobre o Projeto

:coffee: Sistema de Gerenciamento com objetivo desenvolver um serviço HTTP aplicando a funcionalidade de Wishlist do cliente, atendendo os seguintes requisitos:
1) Adicionar um produto na Wishlist do cliente
2) Remover um produto da Wishlist do cliente
3) Consultar todos os produtos da Wishlist do cliente
4) Consultar se um determinado produto está na Wishlist do cliente

Projeto desenvolvido durante o **Treinamento Java ** oferecida pela [Gama Academy](https://www.gama.academy/) em parceria com o [Magazine Luiza](https://www.magazineluiza.com/br-pt).

---

## :+1: Aprendizados
Conceitos da linguagem java, git, banco de dados, cultura agil, boas práticas, cultura devops, spring e boas praticas de spring boot.

---

## 📃 Documentação Completa

- <a href="https://github.com/EdileneLopes/Api-alunos/blob/master/">Back-End</a>

---

## ⚙️ [](https://github.com/EdileneLopes/Api-alunos#funcionalidades)**Funcionalidades**
- [x] Alunos podem se cadastrar na plataforma enviando:
  - Nome completo, Telefone, Email
  
- [x] Manipular na plataforma:
  - Acesso ao CRUD onde permite o gerenciamento
    - O cadastro de novos produtos;
    - O cadastro de novos clientes;
    - Adicionar um produto na Wishlist da cliente;
    - Remover um produto da Wishlist da cliente; 
    - Consultar todos os produtos da Wishlist da cliente; 
    - Consultar se um determinado produto está na Wishlist da cliente;



- [x] Validações:
  - Utilizando [JSON Schema](https://github.com/EdileneLopes/Api-alunos/blob/master/schema/Aluno.json)
    - Validação de Estrutura e Documentos JSON
    - Definir atributos obrigatórios, tipagem, tamanho entre outros.
    - Documentação clara, legível por humanos e por máquina
  - Utilizando Ajv e Ajv-i18n
    - Ajv implementa a especificação do esquema JSON
    - Ajv-i18n Traz Mensagens de erro internacionalizadas para Ajv, disponibilizando acesso a diversos idiomas
  - Utilizando Hapi/Boom
    - HTTP o código correto e mais amigável no envio com um objeto estruturado e mensagem personalizada. 
    
- [x] JSON Web Token / JWT:
  -  Como uma forma de garantir a autenticação e autorização de rotas e usuários.
    
---

## 🚀 Como executar o projeto

Este projeto está dividido em duas partes:
1. Backend Node ([Api-alunos](https://github.com/EdileneLopes/Api-alunos)) 
2. Backend Java ([Neste outro repositorio](https://github.com/EdileneLopes/accenture-java)) 

💡 O Backend deve estar sendo executado para funcionar.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Node (Versão 14 LTS ou Superior)](https://nodejs.org/en/download/), [NVM (Node Version Manager for Windows)](https://github.com/coreybutler/nvm-windows), [MongoDB(Community Edition)](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/), [NoSQLBooster](https://nosqlbooster.com/downloads). 
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/).
E para testar e consumir os Endpoints use [Postman](https://www.postman.com/)

> Para executar o projeto você obrigatoriamente deve ter o repositorio de Java.
> Acesse [Neste outro repositorio](https://github.com/EdileneLopes/accenture-java).

> E siga as instruções e pre-requisitos da documentação.

#### 🎲 Rodando o Backend (servidor)

```
# Clone este repositório
$ git clone https://github.com/EdileneLopes/Api-alunos.git

# Acesse a pasta do projeto no terminal de sua preferencia bash/cmd
$ cd Api-alunos

# Um passo antes da execução instale as dependencias
$ npm install

# Execute
$ npm start

# O servidor inciará na porta:3000 - Acesse: http://localhost:3000
```
[Acesse a Documentação com Swagger UI](http://localhost:3000/doc)
```
http://localhost:3000/doc
```

## Autenticação

Lembrando que as URLs precisam de um Authorization: Bearer Token válido (emitido no mesmo dia, com a assinatura HS256 utilizando a chave `chavesecreta` e qualquer payload.

> Antes de gerar o token você precisa acessar:
> http://localhost:3000/token

> Com Metodo POST:
> Basic Auth e Passar (E-mail e senha) cadastrados no banco de dados em colletion usuarios

## Trocando de persistência

Para configurar qual será o repositório utilizado para persistir os dados recebidos pela API, utilize o header `X-Persistence` na requisição, com um dos seguintes valores:

### `mongodb`

> mongodb é o padrão

Precisa de um servidor de MongoDB rodando em `localhost` na porta 27017.
O banco padrão para as operações é `"aluno"`.

### `rest`
> mysql

Tenta se conectar em uma API de REST rodando em `localhost` na porta 8080. 
A rota padrão para as operações é `/alunos`.

---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

#### []()**Server**  ([NodeJS](https://nodejs.org/en/))

-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/@hapi/boom?style=plastic">](https://github.com/hapijs/boom)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/@hapi/hapi?style=plastic">](https://github.com/hapijs/hapi)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/@hapi/jwt?style=plastic">](https://github.com/hapijs/jwt)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/ajv?style=plastic">](https://github.com/ajv-validator/ajv)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/ajv-i18n?style=plastic">](https://github.com/ajv-validator/ajv-i18n)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/hapi-mongodb?style=plastic">](https://github.com/Marsup/hapi-mongodb)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/hapi-swaggered?style=plastic">](https://github.com/z0mt3c/hapi-swaggered)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/hapi-swaggered-ui?style=plastic">](https://github.com/z0mt3c/hapi-swaggered-ui)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/joi?style=plastic">](https://github.com/sideway/joi)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/jsonwebtoken?style=plastic">](https://github.com/auth0/node-jsonwebtoken)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/mongodb?style=plastic">](https://github.com/mongodb/node-mongodb-native)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/node-fetch?style=plastic">](https://github.com/node-fetch/node-fetch)
-  [<img src="https://img.shields.io/github/package-json/dependency-version/edilenelopes/Api-alunos/nodemon?style=plastic">](https://github.com/remy/nodemon)

   > Veja o arquivo  [package.json](https://github.com/EdileneLopes/Api-alunos/blob/master/package.json)*

#### [](https://github.com/EdileneLopes/Api-alunos#utilitarios)**Utilitários**

-   Organização: **[Trello](https://trello.com/)**
-   JSON Schema Generator: **[JSONschema.net](https://jsonschema.net)**
-   API:  **[Swagger UI](https://swagger.io/tools/swagger-ui/)**
-   Editor:  **[Visual Studio Code](https://code.visualstudio.com/)**, **[Eclipse](https://www.eclipse.org/)**
-   Markdown:  **[Markdown Emoji](https://gist.github.com/rxaviers/7360908)**
-   Teste de API:  **[Postman](https://www.postman.com/)**

---

## 👨‍💻 Participantes

💜 Um super parabens 👏 para essa equipe nota 10 que fez tudo sair do papel :)

<table>
  <tr>
    <td align="center"><a href="https://github.com/EdileneLopes"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/60043558?v=4" width="150px;" alt=""/><br /><sub><b>Edilene Lopes</b></sub></a><br /><a href="https://www.linkedin.com/in/edilene-lopes/" title="Gamados por Java">:family: :books:</a></td>
    <td align="center"><a href="https://github.com/Rafaela1507"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/" width="150px;" alt=""/><br />href="https://www.linkedin.com/in/rafaela-nunes-de-oliveira/>:coffee:  :musical_note:</a></td>
    
    
## 💪 Como contribuir para o projeto

1. Faça um **fork** do projeto.
2. Crie uma nova branch com as suas alterações: `git checkout -b my-feature`
3. Salve as alterações e crie uma mensagem de commit contando o que você fez: `git commit -m "feature: My new feature"`
4. Envie as suas alterações: `git push origin my-feature`

---

---

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

<p><a href="#"><g-emoji class="g-emoji" alias="arrow_up" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2b06.png">⬆</g-emoji> Voltar ao topo</a><br></p>

---

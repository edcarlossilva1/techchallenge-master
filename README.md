# Projeto pós graduação | Tech challenge

Projeto Teche Challenge realizado para pós-graduação [FIAP](https://www.fiap.com.br/) do curso de [Arquitetura e desenvolvimentoJAVA](https://postech.fiap.com.br/curso/arquitetura-desenvolvimento-java) propõe na primeira fase do curso o desenvolvimento de um sistema WEB, com interfaces e APIS, para cadastro de pessoas, endereços e eletrodomésticos, com a finalidade de calcular o consumo mensal de energia. A API foi desenvolvida com as tecnologias Spring Boot, Java17, Maven e banco de dados interno h2. Com o objetivo de uma solução pratica com a utilização de endpoints para realização de operações  de criação, atualização e recuperação de registros. 

## Índice

1. [Tecnologias](#tecnologias)
2. [Ferramentas](#ferramentas)
3. [Documentação](/DOCUMENTACAO.md)
4. [Jornada](#jornada)
5. [Autor](#autor)
6. [Licença](#licença)

## Tecnologias

As tecnologias utilizadas durante o desenvolvimento do projeto.

### [Java 17](https://docs.oracle.com/en/java/javase/17/docs/api/)
Linguagem de programação escolhida para implementar a lógica do sistema, garantindo confiabilidade, segurança e escalabilidade.

### [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
Utilizado como framework para agilizar o desenvolvimento da API, oferecendo recursos como injeção de dependências, mapeamento de URLs, tratamento de requisições HTTP e muito mais.

### [h2](https://www.postgresql.org/docs/)
Banco de dados utilizado para armazenar e gerenciar as informações relacionadas a eletrodomésticos, endereços e pessoas. O PostgreSQL é conhecido por sua robustez e confiabilidade, adequado para aplicações de larga escala.

### [PostgreSQL](https://www.postgresql.org/docs/)
Banco de dados utilizado para armazenar e gerenciar as informações relacionadas a eletrodomésticos, endereços e pessoas.

### [Maven](https://maven.apache.org/guides/index.html)
Gerenciador de dependências utilizado para facilitar a configuração e o gerenciamento das bibliotecas e dependências do projeto.

### [Git](https://git-scm.com/doc)
Sistema de controle de versão utilizado para rastrear alterações no código-fonte, facilitando o trabalho em equipe, o versionamento e a colaboração no projeto.


## Ferramentas

### [Eclipse IDE](https://eclipseide.org)
Ambiente de desenvolvimento integrado (IDE) utilizado para escrever, depurar e testar o código-fonte do projeto. O Eclipse possui recursos avançados de produtividade que facilitãoo desenvolvimento em Java e agiliza o processo de construção da API's.

### [Postman](https://www.postman.com/)
Plataforma de colaboração e testes de API que permite enviar e receber solicitações HTTP, testar os endpoints da API, verificar as respostas e realizar a depuração de forma eficiente.

### [GitHub](https://github.com/)
Plataforma de hospedagem de repositórios de controle de versão Git, utilizada para armazenar e gerenciar o código-fonte do projeto. O GitHub permite o trabalho colaborativo, controle de versões, rastreamento de alterações e facilita a integração com ferramentas de desenvolvimento.


## Instalação
Passos para a execução do projeto utilizando PostgreSQL

1. Instale e configure o PostgreSQL: 
   Script utilizado para criação via powershell: 

   version: "3.7"
services:

 # POSTGRES SERVER
  pg-docker:
    image: postgres:14-alpine
    container_name: tech-postgresql
    environment:
      POSTGRES_DB: mydatabase
      POSTGRES_PASSWORD: 1234567
    ports:
      - 5433:5432
    volumes:
      - ./.data/postgresql/data:/var/lib/postgresql/data
    networks:
      - tech-network


  # PGADMIN
  pgadmin-docker:
    image: dpage/pgadmin4
    container_name: tech-pgadmin
    environment:
      PGADMIN_DEFAULT_EMAIL: me@example.com
      PGADMIN_DEFAULT_PASSWORD: 1234567
    ports:
      - 5050:80
    volumes:
      - ./.data/pgadmin:/var/lib/pgadmin
    depends_on:
      - pg-docker
    networks:
      - tech-network

  # REDE
  networks:
    tech-network:
      driver: bridge


2. Execute e inicialize os serviços na sua máquina com o DockerDesktop
<img width="960" alt="subindoserviços" src="https://github.com/edcarlossilva1/techchallenge-master/assets/138680851/727b1fb2-358d-4903-98ae-d09237a2cee2">

3.Execute o Postgres através do endereço http://localhost:5050/browser/

### Relaizar Login 
<img width="959" alt="logindocker" src="https://github.com/edcarlossilva1/techchallenge-master/assets/138680851/65aa8223-264a-4cdb-9dad-cfdcba782a94">


### Visualizando Base, schemas e tabelas criadas no inicio do projeto
<img width="957" alt="verificatabela" src="https://github.com/edcarlossilva1/techchallenge-master/assets/138680851/4b6d74d7-6c0f-4dfb-ba69-2152fba559a4">

## Jornada

### Primeira fase

O desenvolvimento do projeto foi muito desafiador uma vez que não trabalho como programador utilizando a linguagem de programação JAVA e também por ter encarado o desafio sozinho, obtive conhecimento com as live's coda comigo e os videos da plataforma da Fiap e Alura. 
Para mim é tudo novo tenho o conhecimento bem superficial, espero ter atingido um pouco da espectiva do proposto no exercicio e pretendo aprimorar mais ainda com a continuidade da Segunda fase. 

### Segunda fase

Nesta segunda fase o desafio continua grande, estou aprendendo muito com as lives do coda comigo, tem me facilitado muito em alguns entendimentos e abordagens para aplicação em meu projeto. Prentendo evoluir mais o projeto na terceira fase.  

## Autor

- [Ed Carlos](email: rm349820@fiap.com.br)

Agradeço a minha esposa[Priscia Angelica da Silva] que continua contribuindo com o projeto me apoiando com as atividades pessoais em que não pude participar devido aos estudos.  


## Licença

[Licença MIT](https://opensource.org/license/mit/): permite o uso, a modificação e a distribuição do software sem restrições significativas.


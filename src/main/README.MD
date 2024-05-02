# Pizzaria Java Backend

Este é um projeto de aplicação backend Java para uma pizzaria. Ele foi desenvolvido utilizando o framework Spring Boot e segue uma arquitetura de camadas, incluindo controllers, models, repositories, services e DTOs.

## Funcionalidades

- Cadastro e gerenciamento de pizzas.
- Gerenciamento de pedidos de pizza.
- Alteração de Pedidos.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de pacotes:

- **controller**: Contém as classes responsáveis por mapear as requisições HTTP para os métodos dos serviços.
- **model**: Contém as entidades de domínio da aplicação.
- **repository**: Contém as interfaces que estendem JpaRepository para acesso aos dados.
- **service**: Contém as classes de serviço que implementam a lógica de negócio da aplicação.
- **dto**: Contém os objetos de transferência de dados para comunicação entre as camadas da aplicação.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Spring Security (Em Andamento)
- MySQL
## Setup do Projeto

1. Clone este repositório.
2. Importe o projeto no IntelliJ IDEA ou em sua IDE preferida.
3. Configure o banco de dados no arquivo application.properties.
4. Execute a aplicação.

## Endpoints Principais

A seguir, são listados alguns dos principais endpoints da API:

- **GET /api/pizzas**: Retorna todas as pizzas cadastradas.
- **POST /api/pizzas**: Cria uma nova pizza.
- **GET /api/pedidos**: Retorna todos os pedidos de pizza.
- **POST /api/pedidos**: Cria um novo pedido de pizza.


## Classes Principais

Aqui estão algumas das principais classes do projeto:

- **Bebida**: Representa uma bebida disponível para compra.
- **BebidaPedida**: Representa uma bebida incluída em um pedido.
- **Cliente**: Representa um cliente da pizzaria.
- **Ingrediente**: Representa um ingrediente utilizado na composição de pizzas.
- **Fornada**: Representa uma fornada de pizzas recém-assadas.
- **Pedido**: Representa um pedido realizado por um cliente.
- **Pizza**: Representa uma pizza disponível para compra.
- **PizzaPedida**: Representa uma pizza incluída em um pedido.
- **Tamanho**: Representa os tamanhos disponíveis para pizzas.

## Contribuindo

Se você deseja contribuir com este projeto, por favor, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma branch para a sua feature (`git checkout -b feature/MinhaFeature`).
3. Faça commit das suas mudanças (`git commit -am 'Adicionando uma nova feature'`).
4. Faça push para a branch (`git push origin feature/MinhaFeature`).
5. Crie um novo Pull Request.

## Autores

- [Anna Karoline](https://github.com/AnnaKarolineNunes/AnnaKarolineDeveloper)

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

## Sistema de Catálogo de Filmes

Este sistema permite gerenciar um catálogo de filmes com funcionalidades como cadastro de filmes, atores, diretores, e pesquisa de filmes por nome. O projeto utiliza os conceitos de **Programação Orientada a Objetos (POO)**, incluindo **encapsulamento**, **herança**, **polimorfismo**.

## Funcionalidades

- Cadastrar Filmes: Permite cadastrar filmes com informações como nome, data de lançamento, orçamento e descrição.
- Cadastrar Atores e Diretores: Permite cadastrar atores e diretores com suas informações pessoais.
- Associar Atores e Diretores aos Filmes: É possível associar atores e diretores aos filmes cadastrados.
- Pesquisar Filmes: O sistema permite pesquisar filmes pelo nome, desconsiderando letras maiúsculas e minúsculas.

## Estrutura do Projeto

### Camadas de Arquitetura

- Model: Contém as classes de entidades, como `Filme`, `Ator`, `Diretor`.
- Repository: Gerencia o armazenamento de dados (em memória neste caso), incluindo filmes, atores e diretores.
- Controller: Gerencia a lógica de interação entre o repositório e a interface do usuário. 
- Menu: Exibe as opções no console para o usuário.
- Main: A classe principal que inicia o sistema e chama o menu.

### Estrutura do Código

1. Model (Modelo de Dados):
   - Ator: Representa um ator com uma lista de filmes em que atuou.
   - Diretor: Representa um diretor com uma lista de filmes que dirigiu.
   - Filme: Contém informações sobre o filme, como nome, data de lançamento, orçamento e descrição, além de listas de atores e diretor(es).

2. Repository:
   - Responsável por armazenar filmes, atores e diretores.
   - Contém métodos para adicionar, buscar e listar filmes, atores e diretores.

3. Controller:
   - Gerencia as operações de cadastro e pesquisa entre o repositório e o usuário.
   - Responsável por chamar os métodos do repositório para adicionar filmes, atores e diretores, além de realizar pesquisas por nome de filmes.

4. Menu:
   - Exibe as opções de interação com o sistema no console.
   - Permite que o usuário escolha entre cadastrar novos filmes, atores e diretores, ou pesquisar filmes.

5. Main:
   - Inicia o sistema e chama a classe de menu, permitindo que o usuário interaja com o catálogo.

## Como Usar

### Passos para Execução

1. Clone ou Baixe o Projeto:
   - Clone o repositório ou faça o download dos arquivos.

2. Compile as Classes:
   - Abra o terminal/linha de comando e navegue até o diretório onde o projeto foi salvo.
   - Compile todas as classes com o comando:
     ```bash
     javac Filme.java Ator.java Diretor.java Repository.java Controller.java Menu.java Main.java
     ```

3. Execute o Programa:
   - Execute o programa com o comando:
     ```bash
     java Main
     ```

4. Interaja com o Menu:
   - Após iniciar o programa, um menu será exibido no console com as opções para cadastrar filmes, atores, diretores e realizar pesquisas.

### Exemplo de Interação

1. Cadastrar Filme:
   - Escolha a opção para cadastrar um filme, informe as informações necessárias (nome, data de lançamento, orçamento, descrição).
   - Escolha um diretor já cadastrado e associe-o ao filme.
   - Adicione atores ao filme, se desejar.

2. Pesquisar Filme:
   - Digite o nome do filme que deseja pesquisar e o sistema exibirá as informações correspondentes, se o filme estiver cadastrado.

## Conceitos Usados

- Encapsulamento: As classes encapsulam dados, e o acesso a esses dados é feito por métodos específicos.
- Herança: As classes `Ator` e `Diretor` herdam de uma estrutura comum, reutilizando atributos e métodos.
- Polimorfismo: O método `toString` é polimórfico, com implementações diferentes nas classes `Ator` e `Diretor`.

## Estrutura de Pastas

```
src/
│
├── Controller.java      # Controla a lógica do sistema
├── Filme.java           # Representa a entidade Filme
├── Ator.java            # Representa a entidade Ator
├── Diretor.java         # Representa a entidade Diretor
├── Repository.java      # Gerencia o armazenamento de dados
├── Menu.java            # Exibe as opções no console para o usuário
└── Main.java            # Classe principal que inicializa o sistema
```

## Como Contribuir

1. Fork o repositório.
2. Crie um branch para a sua feature (`git checkout -b feature/nome-da-feature`).
3. Faça suas alterações e commit (`git commit -am 'Adicionando nova feature'`).
4. Envie para o repositório (`git push origin feature/nome-da-feature`).
5. Abra um pull request.

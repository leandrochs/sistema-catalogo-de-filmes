package Menu;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    final Scanner scanner = new Scanner(System.in);

    public void start() {
        int option = 0;

        do {
            option = options();

            switch (option) {
                case 1 -> registerFilmAux();
                case 2 -> registerActorAux();
                case 3 -> registerDirectorAux();
                case 4 -> System.out.printf("associateActorsAux();");
                case 5 -> System.out.printf("associateDirectorsAux();");
                case 6 -> System.out.println("Pesquisar filme");
                case 0 -> System.out.println("Encerrando o programa. Até mais....");
                default -> {
                    System.out.println("Opção Inválida! Tente novamente.");
                }


            }

        } while (option != 0);

    }

    public int options() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("            Bem-vindo ao sistema       ");
        System.out.println("        de Catalogo de Filmes       ");
        System.out.println("========================================");
        System.out.println("Escolha uma opção:");
        System.out.println("----------------------------------------");
        System.out.println("(1)   Cadastrar filmes");
        System.out.println("(2)   Cadastrar ator");
        System.out.println("(3)   Cadastrar diretor");
        System.out.println("(4)   Associar atores a um filme");
        System.out.println("(5)   Associar diretor a um filme");
        System.out.println("(6)   Pesquisar filme");
        System.out.println("(0)   Sair");
        System.out.println("----------------------------------------");
        System.out.print("Digite a opção desejada: ");


        return scanner.nextInt();
    }

    private void registerFilmAux() {

        System.out.println("==== Cadastro de Filme ====");
        System.out.print("Título: ");
        String title = scanner.nextLine();

        System.out.print("Ano de lançamento: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Orçamento");
        double budget = scanner.nextDouble();

        System.out.print("Sinopse");
        String synopsis = scanner.nextLine();

        System.out.print("Gênero: ");
        String gender = scanner.nextLine();

        System.out.print("Duração");
        int time = scanner.nextInt();

        //filmeController.cadastrarFilme(title, year, budget, synopsis, gender, time);
        //System.out.println("Filme cadastrado com sucesso!");
    }

    private void registerActorAux() {

        System.out.println("==== Cadastro de Ator ====");
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Data de nascimento (yyyy-MM-dd): ");
        String dofText = scanner.nextLine();
        LocalDate dof = LocalDate.parse(dofText);

        System.out.print("Nacionalidade: ");
        String nationality = scanner.nextLine();

        //actorController.cadastrarAtor(name, dof, nationality)
        //System.out.println("Ator cadastrado com sucesso!");

    }

    private void registerDirectorAux() {

        System.out.println("==== Cadastro de Diretor ====");
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Data de nascimento (yyyy-MM-dd): ");
        String dofText = scanner.nextLine();
        LocalDate dof = LocalDate.parse(dofText);

        System.out.print("Nacionalidade: ");
        String nationality = scanner.nextLine();

        //directorController.cadastrarAtor(name, dof, nationality)
        //System.out.println("Diretor cadastrado com sucesso!");

    }


}


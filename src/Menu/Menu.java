package Menu;

import Controller.ActorController;
import Controller.DirectorController;
import Controller.FilmController;
import Model.Actor;
import Model.Director;
import Model.Film;
import Repository.FilmRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final FilmController filmController;
    private final ActorController actorController;
    private final DirectorController directorController;
    final Scanner scanner = new Scanner(System.in);

    public Menu(FilmController filmController, ActorController actorController, DirectorController directorController) {
        this.filmController = filmController;
        this.actorController = actorController;
        this.directorController = directorController;
    }

    public void start() {
        int option = 0;

        do {
            option = options();

            switch (option) {
                case 1 -> registerFilmAux();
                case 2 -> registerActorAux();
                case 3 -> registerDirectorAux();
                case 4 -> associateActorsAux();
                case 5 -> associateDirectorsAux();
                case 6 -> searchFilms();
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


        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número.");
            scanner.nextLine();
        }
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    private void registerFilmAux() {

        System.out.println("==== Cadastro de Filme ====");
        System.out.print("Título: ");
        String title = scanner.nextLine();

        Film existingFilm = filmController.findFilmByTitle(title);

        if (existingFilm != null) {
            System.out.println("O filme já foi cadastrado anteriormente:");
            System.out.println(existingFilm);
        } else {
            System.out.print("Ano de lançamento: ");
            String year = scanner.nextLine();
//          Esta recebendo String
            System.out.print("Orçamento: ");
            String budget = scanner.nextLine();

            System.out.print("Sinopse: ");
            String synopsis = scanner.nextLine();

            System.out.print("Gênero: ");
            String gender = scanner.nextLine();

            System.out.print("Duração (em minutos): ");
            String duration = scanner.nextLine();

            filmController.createAndSaveFilm(title, year, budget, synopsis, gender, duration);
            System.out.println();
            System.out.println("Filme cadastrado com sucesso!");
        }
    }

    private void registerActorAux() {

        System.out.println("==== Cadastro de Ator ====");
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        Actor existingActor = actorController.findActorByName(name);

        if (existingActor != null) {
            System.out.println("O ator já foi cadastrado anteriormente:");
            System.out.println("------------------------------------------------");
            System.out.print(existingActor);
            System.out.println("------------------------------------------------");
        } else {
            LocalDate birthday = askForValidDateBR("Data de nascimento: ");

            System.out.print("Nacionalidade: ");
            String nationality = scanner.next();

            actorController.createAndSaveActor(name, birthday, nationality);
            System.out.println();
            System.out.println("Ator cadastrado com sucesso!");

        }
    }


    private void registerDirectorAux() {

        System.out.println("==== Cadastro de Diretor ====");
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        Director existingDirector = directorController.findDirectorByName(name);

        if (existingDirector != null) {
            System.out.println("O diretor já foi cadastrado anteriormente:");
            System.out.println("------------------------------------------------");
            System.out.print(existingDirector);
            System.out.println("------------------------------------------------");
        } else {
            LocalDate birthday = askForValidDateBR("Data de nascimento: ");

            System.out.print("Nacionalidade: ");
            String nationality = scanner.next();

            directorController.createAndSaveDirector(name, birthday, nationality);
            System.out.println();
            System.out.println("Diretor cadastrado com sucesso!");
        }


    }

    LocalDate askForValidDateBR(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print(message);
            String birthday = scanner.next();

            try {
                return LocalDate.parse(birthday, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! Use o padrão dd/MM/yyyy.");
            }
        }
    }

    private void associateActorsAux() {
        System.out.println("==== Associar Atores a Filme ====");
        System.out.print("Insira o nome do filme: ");
        String nameFilm = scanner.nextLine();
        Film films = filmController.findFilmByTitle(nameFilm);
        if (films == null) {
            System.out.println();
            System.out.println("Filme não encontrado.");
            return;
        }

        System.out.println("Filme encontrado:");

        System.out.println("------------------------------------------------");
        System.out.println(films);
        System.out.println("------------------------------------------------");
        System.out.print("Confirmar filme? (s/n): ");
        if (!scanner.next().equalsIgnoreCase("s")) {
            System.out.println();
            System.out.println("Associação cancelada.");
            return;
        }

        boolean addMore = true;

        while (addMore) {
            System.out.print("Insira o nome do ator: ");
            scanner.nextLine();
            String nameActor = scanner.nextLine();
            Actor actor = actorController.findActorByName(nameActor);
            if (actor == null) {
                System.out.println();
                System.out.println("Ator não encontrado.");

                List<Actor> actorList = actorController.findAllActors();

                System.out.println("Lista de atores cadastrados: ");
                System.out.println("------------------------------------------------");
                System.out.println(actorList);
                System.out.println("------------------------------------------------");

                return;
            }


            System.out.println("Ator encontrado:");
            System.out.println("------------------------------------------------");
            System.out.println(actor);
            System.out.println("------------------------------------------------");
            System.out.print("Confirmar ator? (s/n): ");
            if (!scanner.next().equalsIgnoreCase("s")) {
                System.out.println("Associação cancelada.");
                return;
            }


            boolean isSucess = filmController.associateActorToFilm(nameFilm, nameActor);
            if (isSucess) {
                System.out.println("Ator associado com sucesso!");
            }  else {
                System.out.println("Falha ao associar ator ao filme!");
            }

            System.out.print("Deseja adicionar outro ator? (s/n): ");
            //TODO veficiar se ator ja foi associado e cancelar
            if (scanner.next().equalsIgnoreCase("s")) {
                addMore = true;
            } else {
                System.out.println();
                System.out.println("Associação concluída");
                return;
            }

        }


    }


    private void associateDirectorsAux() {
        System.out.println("==== Associar Diretor a Filme ====");
        System.out.print("Insira o nome do filme: ");
        String nameFilm = scanner.nextLine();
        Film films = filmController.findFilmByTitle(nameFilm);
        if (films == null) {
            System.out.println("Filme não encontrado.");
            return;

        }

        System.out.println("Filme encontrado:");

        System.out.println("------------------------------------------------");
        System.out.println(films);
        System.out.println("------------------------------------------------");
        System.out.print("Confirmar filme? (s/n): ");
        if (!scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Associação cancelada.");
            return;
        }

        System.out.print("Insira o nome do diretor: ");
        scanner.nextLine();
        String nameDirector = scanner.nextLine();
        Director director = directorController.findDirectorByName(nameDirector);
        if (director == null) {
            System.out.println("Diretor não encontrado.");

            List<Director> directorList = directorController.findAllDirectors();

            System.out.println("Lista de atores cadastrados: ");
            System.out.println("------------------------------------------------");
            System.out.println(directorList);
            System.out.println("------------------------------------------------");

            return;
        }

        System.out.println("Diretor encontrado:");
        System.out.println("------------------------------------------------");
        System.out.println(director);
        System.out.println("------------------------------------------------");
        System.out.print("Confirmar diretor? (s/n): ");
        if (!scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Associação cancelada.");
            return;
        }

        boolean isSucess = filmController.associateDirectorToFilm(nameFilm, nameDirector);
        if (isSucess) {
            System.out.println("Diretor cadastrado com sucesso!");
        }  else {
            System.out.println("Falha ao associar diretor ao filme!");
        }

        System.out.println("Associação concluída");
    }


    private void searchFilms() {
        boolean running = true;
        while (running) {
            System.out.println("==== Pesquisar Filmes ====");
            System.out.println("Escolha uma opção: ");
            System.out.println("---------------------");
            System.out.println("(A) Listar todos os filmes");
            System.out.println("(B) Pesquisar por palavra chave");
            System.out.println("(S) Sair");
            System.out.println("---------------------");
            String option = scanner.next().toUpperCase();

            switch (option) {
                case "A" -> {
                    List<Film> films = filmController.findAllFilms();
                    if (films.isEmpty()) {
                        System.out.println();
                        System.out.println("______________________");
                        System.out.println("Nenhum filme cadastrado.");
                        System.out.println("______________________");
                        System.out.println();
                    } else {
                        for (Film film : films) {
                            System.out.println(film);
                         }
                    }
                }
                case "B" -> {
                    System.out.print("Digite uma palavra-chave: ");
                    scanner.nextLine();
                    String keyword = scanner.nextLine();
                    List<Film> films = filmController.findFilmsByKeyword(keyword);
                    if (films.isEmpty()) {
                        System.out.println();
                        System.out.println("______________________");
                        System.out.println("Nenhum filme encontrado.");
                        System.out.println("______________________");
                        System.out.println();
                    } else {
                        System.out.println(films);
                    }
                }
                case "S" -> running = false;

                default -> System.out.println("Opção inválida");

            }
        }

    }

}


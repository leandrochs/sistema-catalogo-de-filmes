package Model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String title;
    private int releaseYear;
    private Director director;  // Diretor como objeto
    private String genre;  // Gênero do filme
    private double budget;  // Orçamento do filme
    private String synopsis; // Sinopse do filme
    private int duration; // Duração do filme em minutos

    // Construtor
    public Film(String title, int releaseYear, Director director, String genre, double budget, String synopsis, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.genre = genre;
        this.budget = budget;
        this.synopsis = synopsis;
        this.duration = duration;
    }

    // Métodos Getter necessários
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Director getDirector() {
        return director;  // Retorna o objeto Diretor
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "Ano de lançamento: " + releaseYear + "\n" +
                "Diretor: " + director.getName() + "\n" +  // Exibe o nome do diretor
                "Gênero: " + genre + "\n" +
                "Orçamento: R$ " + budget + "\n" +
                "Sinopse: " + synopsis + "\n" +
                "Duração: " + duration + " minutos";
    }

    public static void main(String[] args) {
        // Criando o diretor
        Director director1 = new Director("Quentin Tarantino");
        Director director2 = new Director("Christopher Nolan");

        // Criando filmes e associando os diretores
        Film film1 = new Film("Pulp Fiction", 1994, director1, "Crime, Drama", 8_000_000, "A história de gangsters e vingança.", 154);
        Film film2 = new Film("Inception", 2010, director2, "Sci-Fi, Thriller", 160_000_000, "Viagem intergaláctica para salvar a humanidade.", 148);

        // Exibindo filmes
        System.out.println(film1);
        System.out.println("--------------------------------");
        System.out.println(film2);
    }
}

class Director {
    private String name;

    // Construtor
    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

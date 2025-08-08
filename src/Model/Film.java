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
}



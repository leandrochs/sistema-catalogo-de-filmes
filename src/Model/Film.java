package Model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private final String title;
    private final int releaseYear;
    private final String budget;
    private final String synopsis;
    private final String gender;
    private final int duration;
    private Director director;
    private List<Actor> actors = new ArrayList<>();

    public Film(String title, int releaseYear, String budget, String synopsis, String gender, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.budget = budget;
        this.synopsis = synopsis;
        this.gender = gender;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Director getDirector() {
        return director;  // Retorna o objeto Diretor
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return new ArrayList<>(actors);
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "Ano de lançamento: " + releaseYear + "\n" +
                "Gênero: " + gender + "\n" +
                "Orçamento: R$ " + budget + "\n" +
                "Sinopse: " + synopsis + "\n" +
                "Duração: " + duration + " minutos" + "\n" +
                "Diretor: " + (director == null ? "Sem diretor cadastrado" : director) + "\n" +
                "Atores: " + (actors == null ? "Sem atores cadastrados" : actors + "\n");
    }
}



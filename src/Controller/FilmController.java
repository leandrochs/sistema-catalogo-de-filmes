package Controller;

import Model.Film;
import Repository.FilmRepository;

public class FilmController {
    private static FilmRepository repository;

    public FilmController(FilmRepository repository) {
        this.repository = repository;
    }

    public Film findFilmByTitle(String title) {
        return (Film) repository.findByTitle(title);
    }

    public Film createAndSaveFilm(String title, String year, String budget, String synopsis, String gender, String time) {
        Film film = new Film(title, year, budget, synopsis, gender, time);
        repository.saveFilm(film);
        return film;
    }
}


/*
(1) cadastrar filmes
(6) pesquisar filme
*/

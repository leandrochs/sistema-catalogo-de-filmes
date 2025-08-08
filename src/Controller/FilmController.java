package Controller;

import Model.Film;
import Repository.FilmRepository;

import java.util.List;

public class FilmController {
    private final FilmRepository repository;

    public FilmController(FilmRepository repository) {
        this.repository = repository;
    }

    public List<Film> findAllFilms() {
        return repository.findAll();
    }

    public Film findFilmByTitle(String title) {
        return (Film) repository.findByTitle(title);
    }

    public void createAndSaveFilm(String title, String year, String budget, String synopsis, String gender, String duration) {
        Film film = new Film(title, year, budget, synopsis, gender, duration);
        repository.saveFilm(film);
    }

    public List<Film> findFilmsByKeyword(String keyword) {
        return repository.findByKeyword(keyword);
    }

}


/*
(1) cadastrar filmes
(6) pesquisar filme
*/

package Controller;

import Model.Actor;
import Model.Director;
import Model.Film;
import Repository.ActorRepository;
import Repository.DirectorRepository;
import Repository.FilmRepository;

import java.util.List;

public class FilmController {
    private final FilmRepository filmRepository;
    private final ActorRepository actorRepository;
    private final DirectorRepository directorRepository;

    public FilmController(FilmRepository filmRepository, ActorRepository actorRepository, DirectorRepository directorRepository) {
        this.filmRepository = filmRepository;
        this.actorRepository = actorRepository;
        this.directorRepository = directorRepository;
    }

    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    public Film findFilmByTitle(String title) {
        return (Film) filmRepository.findByTitle(title);
    }

    public void createAndSaveFilm(String title, String year, String budget, String synopsis, String gender, String duration) {
        Film film = new Film(title, year, budget, synopsis, gender, duration);
        filmRepository.saveFilm(film);
    }

    public List<Film> findFilmsByKeyword(String keyword) {
        return filmRepository.findByKeyword(keyword);
    }

    public boolean associateDirectorToFilm(String filmTitle, String directorName) {
        Film film = filmRepository.findByTitle(filmTitle);
        Director director = directorRepository.findByName(directorName);
        if (film != null && director != null) {
            film.setDirector(director);
            return true;
        }
        return false;
    }

    public boolean associateActorToFilm(String filmTitle, String actorName) {
        Film film = filmRepository.findByTitle(filmTitle);
        Actor actor = actorRepository.findByName(actorName);
        if (film != null && actor != null) {
            film.addActor(actor);
            return true;
        }
        return false;
    }

}

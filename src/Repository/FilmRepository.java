package Repository;

import Model.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmRepository {
    private List<Film> films = new ArrayList<Film>();

    public void saveFilm(Film film) {
        films.add(film);
    }

    public List<Film> readAllFilms() {
        return films;
    }

    public List<Film> readFilmByName(String filmName) {
        List<Film> filmsByName = films.stream()
                .filter(film -> film.getName().equals(filmName))
                .toList();
        return filmsByName;
    }
}

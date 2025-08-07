package Repository;

import Model.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmRepository {
    private List<Film> films = new ArrayList<Film>();

    public static void saveFilm(Film film) {
        films.add(film);
    }

    public static List<Film> readAllFilms() {
        return films;
    }

    public static List<Film> readFilmByName(String filmName) {
        List<Film> filmsByName = films.stream()
                .filter(film -> film.getName().equals(filmName))
                .toList();
        return filmsByName;
    }
}

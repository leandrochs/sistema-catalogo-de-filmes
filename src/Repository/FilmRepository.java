package Repository;

import Model.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmRepository {
    private final List<Film> films = new ArrayList<>();

    public void saveFilm(Film film) {
        films.add(film);
    }

    public List<Film> findAll() {
        return new ArrayList<>(films);
    }

    public List<Film> findByName(String name) {
        return films.stream()
                .filter(film -> film.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}

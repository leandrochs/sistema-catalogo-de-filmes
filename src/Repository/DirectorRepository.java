package Repository;

import Model.Director;
import Model.Film;

import java.util.ArrayList;
import java.util.List;

public class DirectorRepository {
   private final List<Director> directors = new ArrayList<>();

    public void saveDirector(Director director) {
        directors.add(director);
    }

    public List<Director> findAll() {
        return new ArrayList<>(directors);
    }

    public Director findByName(String name) {
        return directors.stream()
                .filter(director -> director.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Director> findByKeyword(String keyword) {
        return directors.stream()
                .filter(director -> director.getName().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

}



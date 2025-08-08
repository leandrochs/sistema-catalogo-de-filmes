package Controller;

import Model.Director;
import Repository.DirectorRepository;

import java.time.LocalDate;
import java.util.List;

public class DirectorController {
    private final DirectorRepository repository;

    public DirectorController(DirectorRepository repository) {
        this.repository = repository;
    }

    public List<Director> findAllDirectors() {
        return repository.findAll();
    }

    public Director findDirectorByName(String name) {
        return repository.findByName(name);
    }

    public void createAndSaveDirector(String name, LocalDate birthday, String nationality) {
        Director director = new Director(name, birthday, nationality);
        repository.saveDirector(director);
    }

    public List<Director> findDirectorByKeyword(String keyword) {
        return repository.findByKeyword(keyword);
    }
}

package Controller;

import Model.Actor;
import Repository.ActorRepository;
import Repository.FilmRepository;

import java.util.List;

public class ActorController {
    private final ActorRepository repository;

    public ActorController(ActorRepository repository) {
        this.repository = repository;
    }

    public List<Actor> findAllActors() {
        return repository.findAll();
    }

    public Actor findActorByName(String name) {
        return repository.findByName(name);
    }

    public void createAndSaveActor(String name, String birthday, String nationality) {
        Actor actor = new Actor(name, birthday, nationality);
        repository.saveActor(actor);
    }

    public List<Actor> findActorsByKeyword(String keyword) {
        return repository.findByKeyword(keyword);
    }
}

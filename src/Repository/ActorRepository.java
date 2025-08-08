package Repository;

import Model.Actor;

import java.util.ArrayList;
import java.util.List;

public class ActorRepository {
    private final List<Actor> actors = new ArrayList<>();

    public void saveActor(Actor actor) {
        actors.add(actor);
    }

    public List<Actor> findAll() {
        return new ArrayList<>(actors);
    }

    public Actor findByName(String name) {
        return actors.stream()
                .filter(actor -> actor.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Actor> findByKeyword(String keyword) {
        return actors.stream()
                .filter(actor -> actor.getNome().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
}

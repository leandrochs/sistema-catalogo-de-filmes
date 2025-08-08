import Controller.ActorController;
import Controller.FilmController;
import Menu.Menu;
import Repository.ActorRepository;
import Repository.FilmRepository;

public class Main {
    public static void main(String[] args) {
        FilmRepository filmRepository = new FilmRepository();
        FilmController filmController = new FilmController(filmRepository);

        ActorRepository actorRepository = new ActorRepository();
        ActorController actorController = new ActorController(actorRepository);

        Menu menu = new Menu(filmController, actorController);
        menu.start();

    }
}

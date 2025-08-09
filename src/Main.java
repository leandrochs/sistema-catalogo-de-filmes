import Controller.ActorController;
import Controller.DirectorController;
import Controller.FilmController;
import Menu.Menu;
import Repository.ActorRepository;
import Repository.DirectorRepository;
import Repository.FilmRepository;

public class Main {
    public static void main(String[] args) {
        ActorRepository actorRepository = new ActorRepository();
        ActorController actorController = new ActorController(actorRepository);

        DirectorRepository directorRepository = new DirectorRepository();
        DirectorController directorController = new DirectorController(directorRepository);

        FilmRepository filmRepository = new FilmRepository();
        FilmController filmController = new FilmController(
                filmRepository, actorRepository,directorRepository
        );

        Menu menu = new Menu(filmController, actorController, directorController);
        menu.start();

    }
}

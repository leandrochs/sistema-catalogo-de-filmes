import Controller.FilmController;
import Menu.Menu;
import Repository.FilmRepository;

public class Main {
    public static void main(String[] args) {
        FilmRepository filmRepository = new FilmRepository();
        FilmController filmController = new FilmController(filmRepository);

        Menu menu = new Menu(filmController);
        menu.start();

    }
}

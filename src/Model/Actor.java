package Model;

import java.time.LocalDate;

public class Actor {
    private final String name;
    private final LocalDate birthday;
    private final String nationality;


    public Actor(String name, LocalDate birthday, String nationality) {
        this.name = name;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "\n" +
                "Data de Nascimento: " + birthday + "\n" +
                "Nacionalidade: " + nationality + "\n";
    }
}

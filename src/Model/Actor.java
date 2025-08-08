package Model;

public class Actor {
    private final String name;
    private final String birthday;
    private final String nationality;


    public Actor(String name, String birthday, String nationality) {
        this.name = name;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nome='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

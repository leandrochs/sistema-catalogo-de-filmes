package Model;

public class Actor {
    private final String nome;
    private final String birthday;
    private final String nationality;


    public Actor(String nome, String birthday, String nationality) {
        this.nome = nome;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nome='" + nome + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

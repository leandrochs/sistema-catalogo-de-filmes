package Model;

public class Film {
    private final String title;
    private final String releaseYear;
    private final String budget;
    private final String synopsis;
    private final String gender;
    private final String duration;
    private Director director;
    private Actor actor;

    public Film(String title, String releaseYear, String budget, String synopsis, String gender, String duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.budget = budget;
        this.synopsis = synopsis;
        this.gender = gender;
        this.duration = duration;
    }

    // Métodos Getter necessários
    public String getTitle() {
        return title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public Director getDirector() {
        return director;  // Retorna o objeto Diretor
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "Ano de lançamento: " + releaseYear + "\n" +
//                "Diretor: " + director.getName() + "\n" +  // Exibe o nome do diretor
                "Gênero: " + gender + "\n" +
                "Orçamento: R$ " + budget + "\n" +
                "Sinopse: " + synopsis + "\n" +
                "Duração: " + duration + " minutos";
    }
}



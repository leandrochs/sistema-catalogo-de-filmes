package Model;

public class Film {

    private String title;
    private String director;
    private int releaseYear;
    private int durationMinutes;
    private double budget;        // Orçamento
    private String synopsis;      // Sinopse
    private String genre;         // Gênero

    // Construtor
    public Film(String title, String director, int releaseYear, int durationMinutes, double budget, String synopsis, String genre) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.durationMinutes = durationMinutes;
        this.budget = budget;
        this.synopsis = synopsis;
        this.genre = genre;
    }

    // Métodos getter e setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Método para exibir detalhes do filme
    public String toString() {
        return "Título: " + title + "\n" +
                "Diretor: " + director + "\n" +
                "Ano de lançamento: " + releaseYear + "\n" +
                "Duração: " + durationMinutes + " minutos\n" +
                "Gênero: " + genre + "\n" +
                "Orçamento: R$ " + budget + "\n" +
                "Sinopse: " + synopsis;
    }
}





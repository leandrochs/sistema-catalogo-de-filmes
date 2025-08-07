package Model;

public class Film {

    public String title;
    public String director;
    public int releaseYear;
    public int durationMinutes;
    public double budget;        // Orçamento
    public String synopsis;      // Sinopse
    public String genre;         // Gênero

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





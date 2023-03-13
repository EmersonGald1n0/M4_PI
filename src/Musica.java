public class Musica extends Midia {
    private double duration;
    //Usando a classe Artista como atributo da classe Música
    private Artista artist;
    private int notes;

    // Constructor com parâmetros para inicializar os atributos da classe Música e usar o método super() para chamar o construtor da classe pai
    public Musica (String title, int year, String gender, double duration, Artista artist, int notes) {
        super(title, year, gender);
        this.duration = duration;
        this.artist = artist;
        this.notes = notes;
    }

    // Getters e Setters
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Artista getArtist() {
        return artist;
    }

    public void setArtist(Artista artist) {
        this.artist = artist;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        //notas de 1 a 5, sendo de 1 a 2 ruim, de 3 a 4 bom e 5 excelente
        if (notes < 1 || notes > 5) {
            System.out.println("Nota inválida");
        } else if (notes >= 1 && notes <= 2) {
            System.out.println("Música ruim");
        } else if (notes >= 3 && notes <= 4) {
            System.out.println("Música boa");
        } else if (notes == 5) {
            System.out.println("Música excelente");
        }
        this.notes = notes;
    }

    // Método para imprimir o status da música
    public void getStatusMusic() {
        System.out.println("Título: " + this.getTitle() + " | Ano: " + this.getYear() + " | Gênero: " + this.getGender() + " | Duração: " + this.getDuration() + " | Artista: " + this.getArtist() + " | Notas: " + this.getNotes());
    }
}
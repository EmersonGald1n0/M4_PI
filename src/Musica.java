public class Musica extends Midia {
    private double duration;
    //Usando a classe Artista como atributo da classe Música
    private Artista artist;
    private int notes;

    public Musica (String title, int year, String gender, double duration, Artista artist, int notes) {
        super(title, year, gender);
        this.duration = duration;
        this.artist = artist;
        this.notes = notes;
    }

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

    public void getStatusMusic() {
        System.out.println("Título: " + this.getTitle() + " | Ano: " + this.getYear() + " | Gênero: " + this.getGender() + " | Duração: " + this.getDuration() + " | Artista: " + this.getArtist() + " | Notas: " + this.getNotes());
    }
}
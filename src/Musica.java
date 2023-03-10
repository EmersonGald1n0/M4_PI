public class Musica extends Midia {
    private double duration;
    private String artist;
    private int notes;

    public Musica (String title, int year, String gender, double duration, String artist, int notes) {
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }
}
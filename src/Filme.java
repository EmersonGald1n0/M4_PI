public class Filme extends Midia {
    private double duration;
    private String type;
    private String cast;
    private String director;
    private String producer;

    // Constructor com parâmetros para inicializar os atributos da classe Filme e usar o método super() para chamar o construtor da classe pai
    public Filme(String title, int year, String gender, double duration, String type, String cast, String director, String producer) {
        super(title, year, gender);
        this.duration = duration;
        this.type = type;
        this.cast = cast;
        this.director = director;
        this.producer = producer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
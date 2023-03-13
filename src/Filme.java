public class Filme extends Midia {
    private double duration;
    private String type;
    private Ator[] cast;
    private String director;
    private String producer;

    // Constructor com parâmetros para inicializar os atributos da classe Filme e usar o método super() para chamar o construtor da classe pai
    public Filme(String title, int year, String gender, double duration, String type, Ator[] cast, String director, String producer) {
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
        if (duration > 0.30) {
            this.setType("Longa metragem");
        } else {
            this.setType("Curta metragem");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ator[] getCast() {
        return cast;
    }

    public void setCast(Ator[] cast) {
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

    public void getStatusFilm() {
        System.out.println("Título: " + this.getTitle() + " | Ano: " + this.getYear() + " | Gênero: " + this.getGender() + " | Duração: " + this.getDuration() + " | Tipo: " + this.getType() + " | Elenco: " + this.getCast() + " | Diretor: " + this.getDirector() + " | Produtor: " + this.getProducer());
        for (int i = 0; i < this.getCast().length; i++) {
            System.out.println("Elenco: " + this.getCast()[i]);
        }
    }
}
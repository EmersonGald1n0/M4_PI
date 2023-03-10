public class Ator extends Artista {
    String formation;

    public Ator(String name, String birthdate, String award, String gender, String formation) {
        super(name, birthdate, award, gender);
        this.formation = formation;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
}

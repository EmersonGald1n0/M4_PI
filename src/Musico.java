public class Musico extends Artista {
    private String areaOfPerformance;

    public Musico(String name, String birthdate, String award, String gender, String areaOfPerformance) {
        super(name, birthdate, award, gender);
        this.areaOfPerformance = areaOfPerformance;
    }

    public String getAreaOfPerformance() {
        return areaOfPerformance;
    }

    public void setAreaOfPerformance(String areaOfPerformance) {
        this.areaOfPerformance = areaOfPerformance;
    }
}

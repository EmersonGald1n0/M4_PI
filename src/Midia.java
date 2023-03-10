public class Midia {
    private String title;
    private int year;
    private String gender;
    
    // Constructor com parâmetros para inicializar os atributos da classe Midia e usar o método super() para chamar o construtor da classe pai
    public Midia(String title, int year, String gender){
        this.title = title;
        this.year = year;
        this.gender = gender;
    }

    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

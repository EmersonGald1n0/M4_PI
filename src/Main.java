public class Main {
    public static void main(String[] args) {
        
        Playlist list = new Playlist();

        BibliotecaDeMidias biblioteca = new BibliotecaDeMidias("Emerson", list, list);

        biblioteca.play_playlist();
    }
}
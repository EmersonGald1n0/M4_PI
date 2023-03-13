public class Main {
    public static void main(String[] args) {
        
        Playlist list = new Playlist(); // Instanciando a classe Playlist

        BibliotecaDeMidias biblioteca = new BibliotecaDeMidias("Emerson", list, list); // Instanciando a classe BibliotecaDeMidias e passando os parâmetros para o construtor

        biblioteca.play_playlist(); // Chamando o método play_playlist() da classe BibliotecaDeMidias
    }
}
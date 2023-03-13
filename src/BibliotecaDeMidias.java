import java.util.Scanner;

public class BibliotecaDeMidias {
    private Midia media;
    private String user;
    private Playlist[] playlist;

    //Construtor
    public BibliotecaDeMidias(String user, Playlist... playlist) {
        this.playlist = playlist;
        this.user = user;
    }

    // Getters and Setters
    public Midia getMedia() {
        return media;
    }

    public void setMedia(Midia media) {
        this.media = media;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Playlist[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist[] playlist) {
        this.playlist = playlist;
    }
    
    // Método para iniciar a biblioteca
    public void play_playlist(){
        start_playlist();
    }

    //Método para iniciar a playlist Música ou Filme
    public void start_playlist(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual playlist deseja curtir hoje, Músicas ou Filmes? (1) Músicas (2) Filmes");
        int response = input.nextInt();
        if(response == 1){
            this.playlist[0].playlist(false, 0);
        } else if(response == 2){
            this.playlist[1].playlist(true, 0);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
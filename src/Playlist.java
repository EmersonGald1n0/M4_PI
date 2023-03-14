import java.util.Scanner;

public class Playlist {
    private String namePlaylist;
    private Midia[] executionOrder;
    private int currentMedia;

    public Playlist() {
        
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public Midia[] getExecutionOrder() {
        return executionOrder;
    }

    public void setExecutionOrder(Midia[] executionOrder) {
        this.executionOrder = executionOrder;
    }

    public int getCurrentMedia() {
        return currentMedia;
    }

    public void setCurrentMedia(int currentMedia) {
        this.currentMedia = currentMedia;
    }

    // Método playlist com parâmetros para verificar se a mídia é filme ou música e criar a playlist
    public void playlist(boolean verificaMidia, int i) {
        create_playlist(verificaMidia, i);
    }

    // Método para criar a playlist
    public void create_playlist(boolean verificaMidia, int i) {
        Scanner input = new Scanner(System.in);
        String question = "(1)Play \n(2)Next \n(3)Previous \n(4)Shuffle \n(5)Exit \n";
        String response = null;
        String statusActive = null;
        
        if (verificaMidia == true) {
            if(i == 0) {
                this.create_movie();
            }
            statusActive = "Assistindo filme: ";
        } else {
            if(i == 0) {
                this.create_music();
            }
            statusActive = "Ouvindo música: ";
        }

        int count = 0;
        while (count == 0) {
            System.out.println(statusActive + this.executionOrder[this.currentMedia].getTitle() + " " + 
            this.executionOrder[this.currentMedia].getYear() + " " +
            this.executionOrder[this.currentMedia].getGender());
            System.out.println("\n" + question);
            response = input.nextLine();
            if (response.equals("1")) {
                System.out.println("Tocando mídia...");
            } else if (response.equals("2")) {
                nextMedia();
            } else if (response.equals("3")) {
                previousMedia();
            } else if (response.equals("4")) {
                shuffleMedia();
                System.out.println("Misturando mídias...");
            } else if (response.equals("5")) {
                System.out.println("Saindo da playlist...");
                System.out.println("Obrigado por utilizar nosso serviço!");
                count++;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    // Método para tocar a próxima mídia da playlist
    public void nextMedia() {
        if (this.currentMedia < this.executionOrder.length - 1) {
            this.currentMedia++;
        } else {
            this.currentMedia = 0;
        }
    }

    // Método para tocar a mídia anterior da playlist
    public void previousMedia() {
        if (this.currentMedia > 0) {
            this.currentMedia--;
        } else {
            this.currentMedia = this.executionOrder.length - 1;
        }
    }

    // Método para misturar a ordem de execução das mídias da playlist
    public void shuffleMedia() {
        for (int i = 0; i < this.executionOrder.length; i++) {
            int random = (int) (Math.random() * this.executionOrder.length);
            Midia temp = this.executionOrder[i];
            this.executionOrder[i] = this.executionOrder[random];
            this.executionOrder[random] = temp;
        }
    }

    // Método para criar midia filme
    public void create_movie(){
        Ator[] cast = new Ator[7];
        cast[0] = new Ator("Maria", "18/08/1974", "Oscar 2022", "Feminino", "Artes");
        cast[1] = new Ator("Ana", "11/03/1994", "Oscar 2022", "Feminino", "Cinema");
        cast[2] = new Ator("Marcelo", "10/07/1983", "Oscar 2022", "Masculino", "Cinema");
        cast[3] = new Ator("Astrogildo", "23/02/1992", "Oscar 2022", "Masculino", "Teatro");
        cast[4] = new Ator("Beatriz", "28/01/2003", "Oscar 2022", "Feminino", "Artes, Cinema");
        cast[5] = new Ator("Joao", "06/12/2001", "Oscar 2022", "Masculino", "Cinema, Teatro");
        cast[6] = new Ator("Lucas", "02/10/1990", "Oscar 2022", "Masculino", "Teatro");

        Filme[] movies = new Filme[7];
        movies[0] = new Filme("Busca Implacável", 2018, "Ação", 1.30, "Longa metragem", cast, "Diretor 1", "Produtor 1");
        movies[1] = new Filme("Busca Implacável 2", 2009, "Ação", 1.30, "Longa metragem", cast, "Diretor 2", "Produtor 2");
        movies[2] = new Filme("Se beber não case", 2005, "Comédia", 1.30, "Longa metragem", cast, "Diretor 3", "Produtor 3");
        movies[3] = new Filme("Interestellar", 2013, "Ficção Científica", 1.30, "Longa metragem", cast, "Diretor 4", "Produtor 4");
        movies[4] = new Filme("Velozes e Furiosos", 2014, "Ação", 1.30, "Longa metragem", cast, "Diretor 5", "Produtor 5");
        movies[5] = new Filme("Duro de Matar 2", 2015, "Ação", 1.30, "Longa metragem", cast, "Diretor 6", "Produtor 6");
        movies[6] = new Filme("Shrek", 2020, "Comédia", 1.30, "Longa metragem", cast, "Diretor 7", "Produtor 7");

        this.executionOrder = movies;
    }

    // Método para criar músicas
    public void create_music(){
        Artista[] artist = new Artista[7];
        artist[0] = new Artista("Chorão", "09/04/1970", "Grammy Latino 2010 - Melhor albúm de Rock", "Masculino");
        artist[1] = new Artista("Chorão", "09/04/1970", "Grammy Latino 2010 - Melhor albúm de Rock", "Masculino");
        artist[2] = new Artista("Chorão", "09/04/1970", "Grammy Latino 2010 - Melhor albúm de Rock", "Masculino");
        artist[3] = new Artista("Frank Ocean", "28/10/1987", "Grammy Award 2013 - Melhor colaboração de rap", "Masculino");
        artist[4] = new Artista("Frank Ocean", "28/10/1987", "Grammy Award 2013 - Melhor colaboração de rap", "Masculino");
        artist[5] = new Artista("Frank Ocean", "28/10/1987", "Grammy Award 2013 - Melhor colaboração de rap", "Masculino");
        artist[6] = new Artista("Black Alien", "07/06/1972", "Multishow 2021 - Disco do ano", "Masculino");

        Musica[] music = new Musica[7];
        music[0] = new Musica("Lugar ao Sol", 2021, "Rock", 1.30, artist[0], 5);
        music[1] = new Musica("Dona do Meu Pensamento", 2021, "Rock", 1.30, artist[1], 5);
        music[2] = new Musica("Uma Criança Com Seu Olhar", 2021, "Rock", 1.30, artist[2], 5);
        music[3] = new Musica("Lost", 2021, "Rock", 1.30, artist[3], 5);
        music[4] = new Musica("Pink+White", 2021, "Rock", 1.30, artist[4], 5);
        music[5] = new Musica("Chanel", 2021, "Rock", 1.30, artist[5], 5);
        music[6] = new Musica("Fica até umas hora", 2021, "Rock", 1.30, artist[6], 5);

        this.executionOrder = music;
    }

    // Método para mostrar status da playlist
    public void show_status(Midia[] list, int i, boolean verificaMidia) {
        if(verificaMidia){
            Filme movie = (Filme) list[i];
            movie.getStatusFilm();
        } else {
            Musica music = (Musica) list[i];
            music.getStatusMusic();
        }
    }
}
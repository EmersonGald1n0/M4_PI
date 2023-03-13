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
}
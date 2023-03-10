public class Playlist {
    private String media;
    private int executionOrder;
    private int currentMedia;

    public Playlist() {
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public int getExecutionOrder() {
        return executionOrder;
    }

    public void setExecutionOrder(int executionOrder) {
        this.executionOrder = executionOrder;
    }

    public int getCurrentMedia() {
        return currentMedia;
    }

    public void setCurrentMedia(int currentMedia) {
        this.currentMedia = currentMedia;
    }
}

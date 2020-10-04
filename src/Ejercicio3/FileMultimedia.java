package Ejercicio3;

/**
 * The type File multimedia.
 */
public class FileMultimedia extends File {

    private int duration;
    private boolean isPlaying;

    /**
     * Instantiates a new File.
     *
     * @param name     the name
     * @param location the location
     * @param duration the duration
     */
    public FileMultimedia(String name, String location, int duration) {
        super(name, location);
        this.duration = duration;
        this.isPlaying = false;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Is playing boolean.
     *
     * @return the boolean
     */
    public boolean isPlaying() {
        return isPlaying;
    }

    /**
     * Sets playing.
     *
     * @param playing the playing
     */
    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    /**
     * Play.
     */
    public void play() {
        this.setPlaying(true);
    }

    /**
     * Stop.
     */
    public void stop() {
        this.setPlaying(false);
    }
}

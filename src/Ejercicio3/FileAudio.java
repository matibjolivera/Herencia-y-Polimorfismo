package Ejercicio3;

/**
 * The type File audio.
 */
public class FileAudio extends FileMultimedia {

    private String format;
    private String artist;
    private String album;

    /**
     * Instantiates a new File.
     *
     * @param name     the name
     * @param location the location
     * @param duration the duration
     * @param format   the format
     * @param artist   the artist
     * @param album    the album
     */
    public FileAudio(String name, String location, int duration, String format, String artist, String album) {
        super(name, location, duration);
        this.format = format;
        this.artist = artist;
        this.album = album;
    }

    /**
     * Gets format.
     *
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets format.
     *
     * @param format the format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Gets artist.
     *
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets artist.
     *
     * @param artist the artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Gets album.
     *
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Sets album.
     *
     * @param album the album
     */
    public void setAlbum(String album) {
        this.album = album;
    }
}

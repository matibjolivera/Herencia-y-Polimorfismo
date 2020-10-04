package Ejercicio3;

/**
 * The type File video.
 */
public class FileVideo extends FileMultimedia {

    private String format;
    private int height;
    private int width;

    /**
     * Instantiates a new File.
     *
     * @param name     the name
     * @param location the location
     * @param duration the duration
     * @param format   the format
     * @param height   the height
     * @param width    the width
     */
    public FileVideo(String name, String location, int duration, String format, int height, int width) {
        super(name, location, duration);
        this.format = format;
        this.height = height;
        this.width = width;
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
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(int width) {
        this.width = width;
    }
}

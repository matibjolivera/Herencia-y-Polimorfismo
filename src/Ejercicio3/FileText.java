package Ejercicio3;

/**
 * The type File text.
 */
public class FileText extends File {

    private String encoding;

    /**
     * Instantiates a new File.
     *
     * @param name     the name
     * @param location the location
     * @param encoding the encoding
     */
    public FileText(String name, String location, String encoding) {
        super(name, location);
        this.encoding = encoding;
    }

    /**
     * Gets encoding.
     *
     * @return the encoding
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets encoding.
     *
     * @param encoding the encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * Encode.
     */
    public void encode() {
        // Encode
    }
}

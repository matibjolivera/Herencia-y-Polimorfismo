package Ejercicio3;

import java.util.ArrayList;

/**
 * The type Computer.
 */
public class Computer {

    private ArrayList<File> files;

    /**
     * Instantiates a new Computer.
     */
    public Computer() {
        this.files = new ArrayList<>();
    }

    /**
     * Gets files.
     *
     * @return the files
     */
    public ArrayList<File> getFiles() {
        return files;
    }

    /**
     * Sets files.
     *
     * @param files the files
     */
    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    /**
     * Add file.
     *
     * @param file the file
     */
    public void addFile(File file) {
        this.getFiles().add(file);
    }
}

package Ejercicio3;

import java.util.Random;

/**
 * The type File.
 */
public class File {

    private String name;
    private float weight;
    private String location;
    private boolean isOpen;

    /**
     * Instantiates a new File.
     *
     * @param name     the name
     * @param location the location
     */
    public File(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 0;
        this.isOpen = false;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Is open boolean.
     *
     * @return the boolean
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Sets open.
     *
     * @param open the open
     */
    public void setOpen(boolean open) {
        isOpen = open;
    }

    /**
     * Open.
     */
    public void open() {
        this.setOpen(true);
    }

    /**
     * Close.
     */
    public void close() {
        this.setOpen(false);
    }

    /**
     * Move.
     *
     * @param newLocation the new location
     */
    public void move(String newLocation) {
        this.setLocation(newLocation);
    }
}

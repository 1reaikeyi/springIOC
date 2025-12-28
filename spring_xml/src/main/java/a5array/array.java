package a5array;

import java.util.Arrays;

public class array {
    private String[] array;

    public array() {
    }

    public array(String[] array) {
        this.array = array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void print() {
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

}

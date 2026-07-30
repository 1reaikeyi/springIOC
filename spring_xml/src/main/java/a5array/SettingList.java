package a5array;

import java.util.Arrays;

public class SettingList {
    private String[] array;

    public SettingList() {
    }

    public SettingList(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void print() {
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

}

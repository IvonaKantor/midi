package org.example.collections.sortMountains;

public class Mountain {
    String name;
    int height;

    Mountain(String name, int length) {
        this.name = name;
        this.height = length;
    }

    public String toString() {
        return "Mountain [name=" + name + ", length=" + height + "]";
    }
}

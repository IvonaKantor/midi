package org.example.collections.sortMountains;
import java.util.*;

public class Sort {

    LinkedList<Mountain> mtn = new LinkedList<>();

    static class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain mo1, Mountain mo2) {
            return mo1.toString().compareTo(mo2.toString());
        }
    }

    static class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain mo1, Mountain mo2) {
            return (mo2.height - mo2.height);
        }
    }

    public static void main(String[] args) {
        new Sort().go();
    }

    public void go() {
        mtn.add(new Mountain("Long Range", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("Mountains in ascending order:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("Mountains in descending order:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("Mountains in ascending order:\n" + mtn);
    }
}

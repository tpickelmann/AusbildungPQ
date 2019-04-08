package de.lingner.lessons.sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listeSortiert = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(45, 98, 9, 39, 22, 17, 78, 63, 3, 29));
        while (l.size() > 0) {
            int minpos = 0;
            int pos = 1;
            while (pos < (l.size())) {
                if (l.get(pos) < l.get(minpos)) {
                    minpos = pos;
                }
                pos++;
            }
            listeSortiert.add(l.get(minpos));
            l.remove(minpos);
        }
        System.out.println(listeSortiert.toString());
    }
}

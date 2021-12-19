package ru.rud.unsorted;

import java.util.Comparator;

public class ComparableLetter implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return count(o1) - count(o2);
    }

    public static int count(String o) {
        int count = 0;
        char[] s = o.toCharArray();
        for (int i = 0; i < o.length(); i++){
            if(s[i] == 'a'){
                count++;
            }
        }
        return count;
    }
}

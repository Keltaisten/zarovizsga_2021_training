package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.Set;
import java.util.TreeSet;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null || s.equals("")) {
            return 0;
        } else {
            return findTheDifferentDigits(s);
        }
    }

    private int findTheDifferentDigits(String s) {
        Set digits = new TreeSet();
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            }
        }
        return digits.size();
    }
}

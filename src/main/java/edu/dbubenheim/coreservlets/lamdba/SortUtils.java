package edu.dbubenheim.coreservlets.lamdba;

import java.util.Comparator;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class SortUtils {

    public static Comparator<String> sortByLowercaseE() {
        return (a, b) -> (a.charAt(0) == 'e') ? -1 : +1;
    }
}

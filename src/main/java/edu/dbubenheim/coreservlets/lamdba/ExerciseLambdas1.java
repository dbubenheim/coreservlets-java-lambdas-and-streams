package edu.dbubenheim.coreservlets.lamdba;

import java.util.Arrays;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class ExerciseLambdas1 {

    public static void main(final String... args) {

        final String[] strings = new String[] {"A1", "A2", "A3", "B1", "B2", "B3", "B12", "C123", "D1234", "e1", "e12", "E32", "E1"};
        System.out.printf("original: %s%n", strings);

        // shortest to longest
        Arrays.sort(strings, (a, b) -> a.length() - b.length());
        System.out.printf("sorted: %s%n", Arrays.asList(strings));

        // reverse
        Arrays.sort(strings, (a, b) -> b.length() - a.length());
        System.out.printf("sorted: %s%n", Arrays.asList(strings));

        // alphabetically
        Arrays.sort(strings, (a, b) -> a.charAt(0) - b.charAt(0));
        System.out.printf("sorted: %s%n", Arrays.asList(strings));

        // alphabetically
        Arrays.sort(strings, (a, b) -> (a.charAt(0) == 'e') ? -1 : +1);
        System.out.printf("sorted: %s%n", Arrays.asList(strings));

        // alphabetically
        Arrays.sort(strings, SortUtils.sortByLowercaseE());
        System.out.printf("sorted: %s%n", Arrays.asList(strings));
    }
}
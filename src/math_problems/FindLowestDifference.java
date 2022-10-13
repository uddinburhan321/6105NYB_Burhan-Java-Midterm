package math_problems;

import com.mongodb.client.DistinctIterable;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        System.out.println("\nLowest unique number between both arrays is: " + lowestUniqueNumber(array1, array2));

    }

    static int lowestUniqueNumber(int[] arr1, int[] arr2) {
        int lowestDif = Integer.MAX_VALUE;

        HashSet<Integer> hashset1 = new HashSet<>();
        HashSet<Integer> hashset2 = new HashSet<>();

        // travers the array3 array to store elements in the hashset
        for (int i = 0; i < arr1.length; i++) {
            if (!hashset1.contains(arr1[i])) {
                hashset1.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!hashset2.contains(arr2[i])) {
                hashset2.add(arr2[i]);
            }
        }

        List<Integer> list1 = new ArrayList<Integer>(hashset1);
        Collections.sort(list1);

        List<Integer> list2 = new ArrayList<Integer>(hashset2);
        Collections.sort(list2);
        list1.retainAll(list2);

        Set<Integer> containsAll = new HashSet<Integer>();
        containsAll.addAll(hashset1);
        containsAll.addAll(hashset2);

        List<Integer> uniqueValues = containsAll.stream()
                .filter(num -> hashset1.contains(num) ^ hashset2.contains(num))
                .collect(Collectors.toList());

        List<Integer> duplicateValues = containsAll.stream()
                .filter(num -> hashset1.contains(num) && hashset2.contains(num))
                .collect(Collectors.toList());

        Collections.sort(uniqueValues);
        lowestDif = uniqueValues.get(0);

        return lowestDif;
    }
}

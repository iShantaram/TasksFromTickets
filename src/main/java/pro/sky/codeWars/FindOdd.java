package pro.sky.codeWars;

import java.util.HashSet;
import java.util.Set;

public class FindOdd {
    public static void main(String[] args) {
        int[] array = {20,1,-1,2,3,5,3,3,3,5,5,1,2,4,20,4,-1};
        System.out.println(findIt(array));
    }

    /**
     * @param a an entry array of integers
     * @return a number that appears in array an odd number of times
     */
    private static int findIt(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int j : a) {
            if (set.contains(j)) set.remove(j);
            else set.add(j);
        }
        return set.iterator().next();
    }
}

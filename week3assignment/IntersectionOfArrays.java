package week3assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        
        Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};

        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

      
        list1.retainAll(list2);

        System.out.println("Intersection of the arrays: " + list1);
    }
}

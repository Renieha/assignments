package week3assignment;

import java.util.Arrays;

public class MissingElementsFinder {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 10, 6, 8};

        
        Arrays.sort(array);

        System.out.println("Missing numbers in the sequence:");
 
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            int next = array[i + 1];

            
            if (next - current > 1) {
               
                for (int j = current + 1; j < next; j++) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}

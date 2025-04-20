import java.util.*;
public class ArraySum { 
    public static void main(String[] args) { 
    int[] arr = {1, 4, 5, 3, 2}; 
    int target = 7; 
    HashSet<Integer> set = new HashSet<>(); 
    for (int num : arr) { 
        if (set.contains(target - num)) { 
                 System.out.println(num + ", " + (target - num)); 
                        return; 
    } 
    set.add(num); 
    } 
    System.out.println("No pair found"); 
    } 
    } 
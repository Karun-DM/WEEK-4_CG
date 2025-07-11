import java.util.*;


public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {6, -3, 3, 4, -2, -1, 1, 2};
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray found from " + (start + 1) + " to " + i);
                }
            }


           
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}

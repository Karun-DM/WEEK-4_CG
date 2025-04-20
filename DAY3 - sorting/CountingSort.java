import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] age={13,14,14,12,12,11,19,21,11};
        int max=age[0];
        for(int i=0;i<age.length;i++){
            if(max<age[i]){
                max=age[i];
            }
        }
        System.out.println(max);
        int count[]=new int[max+1];
        for(int i=0;i<age.length;i++){
            count[age[i]]++;

        }
        int index=0;
        for(int i=0;i<=max;i++){
         
            while(count[i]>0){
                age[index++]=i;
                count[i]--;

            }
        }
        System.out.println(Arrays.toString(age));
    }
}

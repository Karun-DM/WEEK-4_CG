import java.util.Arrays;

public class Count {

    public static void main(String[] args) {
        int[] a={2,3,2,4,1,45,34,33,2,1};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
        int[] count=new int[max+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        int index=0;
        for(int i=0;i<=max;i++){
            while(count[i]>0){
                a[index++]=i;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(a));

    }
    
}

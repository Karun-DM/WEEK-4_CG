import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] id={23,33,12,54,89,23,90,99,43};
        for(int i=1;i<id.length;i++){
            int key=id[i];
            int j=i-1;
            while(j>=0 && id[j]>key){
                id[j+1]=id[j];
                j--;
            }
            id[j+1]=key;
        }
        System.out.println(Arrays.toString(id));
    }
}

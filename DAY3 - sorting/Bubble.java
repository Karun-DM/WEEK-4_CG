import java.util.Arrays;
public class Bubble{
    public static void main(String[] args) {
        int[] marks={56,45,67,23,14,89,90,45,99};
        for(int i=0;i<marks.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swapped=true;

                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(marks));
    }
}
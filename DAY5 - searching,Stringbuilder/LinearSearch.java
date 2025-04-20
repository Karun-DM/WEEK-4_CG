public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,4,4,-9};
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                j=i;
                break;           }
        }
        if(j!=-1){
            System.out.println("negative found at the index ="+" "+j);
        }
        else{
            System.out.println("all positive numbers");
        }
    }
}

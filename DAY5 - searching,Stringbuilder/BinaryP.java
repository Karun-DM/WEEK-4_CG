public class BinaryP {
    public static void main(String[] args) {
        int[] arr={1,2,20,3,2};
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int m=(l+r)/2;
            if(arr[m]>arr[m+1]){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        System.out.println(l);
        System.out.println(arr[l]);
    }   
}

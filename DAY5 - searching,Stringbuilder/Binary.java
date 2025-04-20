public class Binary {
    public static void main(String[] args) {
        int[] arr={6,7,8,1,2,3,4};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        System.out.println(left);
        System.out.println(arr[left]);
    }
}

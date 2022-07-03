package arrays.ques;

public class max {

    public static void main(String[] args) {
        int[] arr={1,3,23,9,8};
        System.out.println(maxrange(arr,3,4));
    }
    //for max in a range
    static int maxrange(int[] arr,int start,int end){
        int maxval =arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    //for max of complete array
    static int max(int[] arr){
        int maxval=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}

package Linear_search;

public class linsear {
    public static void main(String[] args) {
        int nums[] = {12, 3, 4, 78, -1, 5, 8, 9, 3, 74, 90};
        int target = 12;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    //search the target and return true or false
    static boolean linearsearch3(int[] arr,int target) {
        if(arr.length==0){
            return false;
        }
        for(int element :arr ){
            if(element == target){
                return true;
            }
        }
        return false ;
    }




    // search the target and return the element
    static int linearsearch2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
       // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }


        }
        return -1;
    }




    //search in the array;return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is =target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will exaecute if none of the above statement is executed
        //hence target not found
        return -1;
    }

}

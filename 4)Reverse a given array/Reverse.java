// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        reverse(arr, 0, arr.length-1);
        for(int i : arr) {
            System.out.println(i+ " ");
        }
    }

    //recursively swapping starting and ending
    static void reverse(int [] arr,int start, int end) {
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr,start+1,end-1);
        }
    }
}

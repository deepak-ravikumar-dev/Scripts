import java.util.*;

class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34};

        int max = arr[0];
        int secondMax = arr[1];   

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
}
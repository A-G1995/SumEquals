
package sumequals;

import java.util.HashMap;
import java.util.Map;


public class SumEquals {

    
    public static void main(String[] args) {
            int array [] = {2,7,11,15,18,21,32};
            printSumPairs(array, 26);
    }
    public static void printSumPairs(int arr[], int k){
    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

    for(int i=0;i<arr.length;i++){

        if(pairs.containsKey(arr[i]))
            System.out.println(arr[i] +", "+ pairs.get(arr[i]));
        else{
            pairs.put(k-arr[i], arr[i]);
            
        }
    }

}
}

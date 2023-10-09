/**
 * ArraySearch
 */
public class ArraySearch {
    public static int LinearSeacrh(int []arr ,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return i;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]= {3,5,35,6,3,7};
        int x=5;
        System.out.println(LinearSeacrh(arr, x));

    }
    
}
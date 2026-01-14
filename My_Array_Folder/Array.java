import java.util.*;

public class Array {
    
     public static int[] insert_an_arr(int[] arr, int pos, int val) {
        ArrayList<Integer> orig_arr = new ArrayList<>();
        // Add elem to orig_arr  
        for (int i = 0; i < arr.length; i++) {
            orig_arr.add(arr[i]);
        }
        
        orig_arr.add(0);
        
        int[] new_arr = new int[arr.length + 1];
        for (int i = 0; i < orig_arr.size(); i++) {
            new_arr[i] = orig_arr.get(i);
        }
        
        int temp = val;
        for (int i = pos; i < new_arr.length; i++) {
            int hold_here = new_arr[i];
            new_arr[i] = temp;
            temp = hold_here;
        }

        return (new_arr);

    }

    public static int[] remove_an_arr(int[] arr, int pos) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != pos) {
                dynamicArray.add(arr[i]);
            }
        }

        int[] new_array = new int[arr.length - 1];
        
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = dynamicArray.get(i);
        }


        return new_array;
    }


    public static void main(String[] args) {
        
     
        // Dynamic Array
        int[] given_arr = new int[5];
        
        given_arr[0] =3;
        given_arr[1] = 2;
        given_arr[2] = 9;
        given_arr[3] = 20;
        given_arr[4] = 60;

        String insert_my_string = Arrays.toString(insert_an_arr(given_arr, 2, 30));
        String remove_my_string = Arrays.toString(remove_an_arr(given_arr, 2 ));
        
        System.out.println(remove_my_string);
        System.out.println(insert_my_string);

    }
    
}






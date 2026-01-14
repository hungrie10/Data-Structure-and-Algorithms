public class Create_an_Array {
    public static void main(String[] args) {
        
        int[] my_arr = new int[5];
        my_arr[0] = 1;
        my_arr[1] = 2;
        my_arr[2] = 3;
        my_arr[3] = 4;
        my_arr[4] = 5;

        // Accessing elements in an Array
        for (int i = 0; i < my_arr.length; i++) {
            System.out.println(my_arr[i]);
        }
      
    }
}
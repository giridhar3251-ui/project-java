public class Arrayrotation {
 
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }
 
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotations = 2;
        rotateLeft(array, rotations);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
    

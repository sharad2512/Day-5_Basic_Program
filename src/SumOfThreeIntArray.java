public class SumOfThreeIntArray {
    public static void main(String[] args) {
        int[] array = {1, 0, -1, 2, 4, -2};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    int triple = array[i] + array[j] + array[k];
                    if (triple == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of triplets present is array are " +count);
    }
}

package Array;
//Find duplicate using visited

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started:");

        int[] arr = {4, 4, 4, 2, 2, 1, 7, 8};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true)
                continue;

            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }
            if (isDuplicate)
                System.out.println(arr[i]);
        }
    }
}

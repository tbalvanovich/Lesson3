package by.balvanovich.lesson3.Task1;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4567,87,65,45};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println(max);
    }
}

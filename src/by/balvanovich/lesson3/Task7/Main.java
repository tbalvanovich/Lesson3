package by.balvanovich.lesson3.Task7;

public class Main {
    public static void main(String[] args) {
        int arr[] = {300, 30, 21, 15, 7, 43, 1};
        int temp = 0;
        for ( int a = 1; a < arr.length; a++)
        for (int i = 0; i < arr.length - a; i++){
            if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

            }
        }
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++)
            sum = sum + arr[i];
        System.out.println(sum);
    }
}

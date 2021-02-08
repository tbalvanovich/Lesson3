package by.balvanovich.lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        int arr [] = {-123, 34, 45665, 5884, 32, 5954, 1};
        int temp = 0;
        for (int a = 1; a < arr.length; a++)
        for (int i = 0; i < arr.length-a; i++){
            if (arr[i] < arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr [i+1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

    }
}

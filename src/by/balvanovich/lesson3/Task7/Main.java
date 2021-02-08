package by.balvanovich.lesson3.Task7;

public class Main {
    public static void main(String[] args) {
        int arr[] = {300, 30, 21, 15, 7, 43, 1};
        int temp = 0;
        int indexMin = 0, indexMax = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min){

                min = arr[i];
                indexMin = i;
            }
            }
        if (indexMin > indexMax){
            temp = indexMax;
            indexMax = indexMin;
            indexMin = temp;
        }

        int sum = 0;
        for (int i = indexMin + 1; i < indexMax; i++)
            sum = sum + arr[i];
        System.out.println(sum);
    }
}

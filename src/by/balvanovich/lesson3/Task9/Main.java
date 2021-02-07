package by.balvanovich.lesson3.Task9;

public class Main {
    public static void main(String[] args) {

        int arr[] = { 11, 44, 77, 84, 23, 99, 1 };
        int temp;

        for ( int a = 1; a < arr.length; a++)
            for (int i = 0; i < arr.length - a; i++){
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        int search = 77;
        int searchIndex = arr.length / 2;
        boolean flag = false;
        for(int i = 0; i< arr.length; i++) {
            if(search == arr[searchIndex]) {
                System.out.println("Число найдено в " + searchIndex + " индексе");
                flag = true;
                break;
            }
            if (search < arr[searchIndex])
                searchIndex = searchIndex / 2;
            else
                searchIndex = searchIndex / 2 + searchIndex;

        }
        if (!flag)
            System.out.println("Искомое число не найдено");
    }
}

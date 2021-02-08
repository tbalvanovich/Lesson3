package by.balvanovich.lesson3.Task4;

public class Main {
    public static void main(String[] args) {
        int a = 23;
        int b = 40;
        int sum = 0;
        for (int i = 0; i < b; i++){
            sum = a + sum;
        }
        System.out.println(sum);
    }
}

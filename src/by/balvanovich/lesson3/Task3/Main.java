package by.balvanovich.lesson3.Task3;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 257; i = i * 2){
            sum = i +sum;
        }
        System.out.println(sum);
    }
}

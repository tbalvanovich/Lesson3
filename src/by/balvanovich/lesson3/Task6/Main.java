package by.balvanovich.lesson3.Task6;

public class Main {
    public static void main(String[] args) {
        double s = 10;
        double sum = 0;
        for (int i = 1; i <=7; i++){
            sum = sum + s;
            s = s * 1.1;


        }
        System.out.println(sum);
    }
}

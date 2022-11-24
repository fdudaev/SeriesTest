import com.farrukhzaripov.mylibrary.Series;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("nSum is: " + Series.nSum(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("factorial is " + Series.factorial(i));
        }
        for (int i = 0; i <= 10; i++){
            System.out.println("fib is "+Series.fibonacci(i));
        }
    }
}
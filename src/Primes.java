//Нахождение простых чисел меньше 100
public class Primes {
    public static void main(String[] args) {
        int i, k;
        boolean isPrime;
        for (i=2; i<100; i++) {
            isPrime = true;

            //Проверка на делимость без остатка
            for (k=2; k<=i/k; k++)
                if ((i%k) == 0) {
                    isPrime = false;
                }

            //Если ни одно число из диапозона k<=i/k не подошло - выводим проверяемое число на экран
            if (isPrime) System.out.println(i);
        }
    }
}
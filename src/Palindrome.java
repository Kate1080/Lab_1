// Класс Palindrome2 для определения слова - палиндрома
public class Palindrome {

    // Метод main для считывания входных данных и выведения результата программы
    public static void main(String[] args) {
        for (String s : args) {
            if (isPalindrome(s)) {
                System.out.println(" - palindrome");
            } else {
                System.out.println(" - not a palindrome");
            }
        }
    }

    // Метод reverseString для перестановки букв слова в обратном порядке
    public static String reverseString(String s) {
        String s2 ="";
        for ( int i=(s.length()) - 1; i>=-1; i--) {
            s2 += s.charAt(i);
        }

        return s2;
    }

    // Метод isPalindrome для сравнения исходной строки и измененной
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}

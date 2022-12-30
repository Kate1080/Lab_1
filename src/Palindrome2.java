// Класс Palindrome2 для определения слова - палиндрома
public class Palindrome2 {

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

    // Метод isPalindrome для проверки слова: проверяет пары букв с начала и конца слова, возвращает true или false
    public static boolean isPalindrome(String s) {
        int ln = s.length();
        for (int i=0; i<ln/2; i++) {
            if (s.charAt(i) != s.charAt(ln-(i+1))) {
                return false;
            }
        }
        return true;
    }
}
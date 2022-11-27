package Homeworks.Homework_2;

/**
 * Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */
public class Task {
    public static void main(String[] args) {
        String[] lines = {"qwerewq", "q", "qwerty", "asdfghjhgfdsa"};
        for (String line : lines)
            System.out.println(isPalindrome(line));
    }

    private static boolean isPalindrome(String string) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--)
            if (string.charAt(i) != string.charAt(j)) return false;
        return true;
    }
}

package by.it_academy.tr.main;
//Задача 2. Проверка массива на палиндром
public class Task02 {

	public static void main(String[] args) {

		char[] mas = { 'm', 'n', 'o', 'n', 'm' };

		if (checkPalindrome(mas)) {
			System.out.println("Массив является палиндромом.");
		} else {
			System.out.println("Массив не является палиндромом.");
		}
	}

	public static boolean checkPalindrome(char[] mas) {
		for (int i = 0; i < mas.length / 2; i++) {
			if (mas[i] != mas[mas.length - i - 1]) {
				return false;
			}
		}

		return true;
	}

}

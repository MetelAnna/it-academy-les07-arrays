package by.it_academy.tr.main;
//Задача 7. Реверсирование подмассива
public class Task07 {

	public static void main(String[] args) {

		int[] mas = { 56, 5, 7, 45, 100, 53, 67, 78, 41, 5, 11, 23 };
		int l = 2;
		int r = 7;

		reverseSegment(mas, l, r);
		System.out.print("Массив после разворота: ");
		for (int i : mas) {
			System.out.print(i + " ");
		}
	}

	public static void reverseSegment(int[] mas, int l, int r) {
		while (l < r) {
			int temp = mas[l];
			mas[l] = mas[r];
			mas[r] = temp;
			l++;
			r--;
		}
	}
}

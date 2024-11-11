package by.it_academy.tr.main;
//Задача 4. Поиск второго максимального элемента
public class Task04 {

	public static void main(String[] args) {
		int[] mas = { 1, 89, 6, 78, 5 };

		int secondLargest = secondLargest(mas);
		System.out.println("Второй по величине элемент: " + secondLargest);
	}

	public static int secondLargest(int[] mas) {

		int largest = 0;
		int secondLargest = 0;

		for (int i : mas) {
			if (i > largest) {
				largest = i;
			}
		}

		for (int i : mas) {
			if (i > secondLargest && i < largest) {
				secondLargest = i;
			}
		}

		return secondLargest;
	}

}

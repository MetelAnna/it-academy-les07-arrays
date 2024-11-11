package by.it_academy.tr.main;
//Задача 1. Циклический сдвиг элементов массива
public class Task01 {

	public static void main(String[] args) {

		int[] mas = { 35, 67, 45, 78, 98, 13, 42 };
		int k = 8;

		printArray(mas);
		System.out.println();
		moveArray(mas, k);
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%3d]", mas[i]);
		}
	}

	public static void moveArray(int[] mas, int k) {
		int[] temp = new int[mas.length];

		
		for (int i = 0; i < mas.length; i++) {
			temp[(i + k) % mas.length] = mas[i];
		}

		for (int i = 0; i < mas.length; i++) {
			mas[i] = temp[i];
			System.out.printf("[%3d]", mas[i]);
		}

	}

}

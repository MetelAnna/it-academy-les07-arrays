package by.it_academy.tr.main;
//Задача 3. Объединение и сортировка двух массивов
import java.util.Arrays;

public class Task03 {

	public static void main(String[] args) {
		int[] a = { 17, 19, 21, 23, 25, 27 };
		int[] b = { 18, 20, 22, 24, 26, 28 };
		
		int[] c = mergedArray(a, b);
		
		System.out.println("Новый массив: " + Arrays.toString(c));
	}

	public static void printArrays (int [] a, int [] b) {
		System.out.printf("[%3d]", a);
		System.out.printf("[%3d]", b);
	}
	
	public static int[] mergedArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}

		while (i < a.length) {
			c[k++] = a[i++];
		}

		while (j < b.length) {
			c[k++] = b[j++];
		}

		return c;
	}
}

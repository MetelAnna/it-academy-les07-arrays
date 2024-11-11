package by.it_academy.tr.main;
//Задача 6. Удаление повторяющихся элементов
public class Task06 {

	public static void main(String[] args) {
		int[] mas = { 5, 6, 5, 3, 2, 1, 5, 7, 8 };

		int[] array = uniqueElements(mas);
		System.out.print("Массив уникальных элементов: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static int[] uniqueElements(int[] mas) {
		int[] temp = new int[mas.length]; 
		int count = 0;

		for (int i = 0; i <mas.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < count; j++) {
				if (mas[i] == temp[j]) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				temp[count] = mas[i];
				count++;
			}
		}

		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = temp[i];
		}

		return array;
	}

}

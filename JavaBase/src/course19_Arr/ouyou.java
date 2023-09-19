package course19_Arr;

public class ouyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75; /*1→4→2→3→0*/
		logicArray[3] = 80;
		logicArray[4] = 65;

		for (int a = 50; a <= 100; a = a + 5) {
			for (int b = 0; b < 5; b++) {
				if (a == logicArray[b]) {
					System.out.println(logicArray[b]);
					break;
				}
			}
		}
	}
}

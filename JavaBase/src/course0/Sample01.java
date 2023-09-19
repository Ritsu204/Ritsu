package course0;

public class Sample01 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 40;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 50;
		arr[4] = 30;

		//配列表示
		for (int a = 0; a < arr.length; a++) {
			System.out.println("arr[" + a + "]:" + arr[a] + " ");
		}
		System.out.println();//改行

		//配列移動↑
		int save = arr[0];
		for (int a = 0; a < arr.length; a++) {
			if (a < arr.length - 1) {
				arr[a] = arr[a + 1];
			} else {
				arr[a] = save;
			}
		}

		//配列表示(移動後)
		for (int a = 0; a < arr.length; a++) {
			System.out.println("arr[" + a + "]:" + arr[a] + " ");
		}

	}
}

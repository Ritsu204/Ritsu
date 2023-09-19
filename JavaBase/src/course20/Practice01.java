package course20;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(); //改行 ×2

		//練習問題②
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;

		for (int a = 0; a < arr2.length; a++) {
			System.out.println(arr2[a] + " ");
			if(arr2[a] > 29) {
				System.out.println(a+"番目の要素は30以上です");
			}
		}System.out.println();
		
		//練習問題③
		int[] arr3 = new int[5];
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;  //➡ int[] arr3 ={10,20,30,40,50};
		arr3[3] = 40;
		arr3[4] = 50;
		
		int s = 0;
		
		for (int b = 0; b < arr3.length; b++) {
			s = s +arr[b];
		}
		System.out.println(s);
	}

}

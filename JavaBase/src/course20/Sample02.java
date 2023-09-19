package course20;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numArray = new int[5];
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;
		
		//左に変数 , 右に配列
		for(int num : numArray) {
			System.out.println(num);
		}

	}

}

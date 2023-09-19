package course24;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		int a = 30;
		bai(a);

		//練習問題②
		String c = "引数だよー";
		moji(c);

		//練習問題③
		int e = 50;
		int ee = 40;
		niko(e, ee);

		//練習問題④
		int tensu = 100;

		calledMethod(tensu);

	}

	//練習問題①(メソッド)
	static void bai(int b) {
		System.out.println(b * 2);
	}

	//練習問題②(メソッド)
	static void moji(String d) {
		System.out.println(d);
	}

	//練習問題③(メソッド)
	static void niko(int f, int ff) {
		System.out.println(f + ff);
	}

	//練習問題④(メソッド)
	static void calledMethod(int tensu) {
		System.out.println("引数で受け取った値は" + tensu + "です。");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
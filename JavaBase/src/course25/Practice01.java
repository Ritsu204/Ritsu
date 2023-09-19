package course25;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		int a = modoriOne(134);
		System.out.println(a);
		
		//練習問題②
		String c = modoriTwo("文字！");
		System.out.println(c);
		
		//練習問題③
		String z = modoPraThree("333","555");
		System.out.println(z);
		
	}

	//練習問題①メソッド
	static int modoriOne(int b) {
		int num = b + 100;
		return num;
	}

	//練習問題②メソッド
	static String modoriTwo(String d) {
		String moji = d + "を受け取りました";
		return moji;
	}
	
	//練習問題③メソッド
	static String modoPraThree(String x,String y) {
		String s = x + y;
		return s;
	}
	
	
	
}

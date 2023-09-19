package course41;

public class Test03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//模擬テスト⑪
		mogi();
		System.out.println();//改行

		//模擬テスト⑫
		calc(10, 11);
		System.out.println();//改行

		//模擬テスト⑬
		String x = mojicon("今のところ全問正解でしょ？");
		System.out.println(x);
		System.out.println();//改行
		
	}

	//⑪
	static void mogi() {
		System.out.println("メソッド問題");
	}

	//⑫
	static void calc(int a, int b) {
		System.out.println(a + b);
	}

	//⑬
	static String mojicon(String moji) {
		String concated = moji + "を受け取りました";
		return concated;
	}

}

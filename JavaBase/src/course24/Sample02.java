package course24;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 10;
		int b = 20;
		
		//int型変数 「a」「b」をメソッドに渡して呼び出す。
		plus(a,b);
		
		System.out.println("呼び出し終わったよ");
		
	}

	//呼び出される側
	//int「a」の値が int「x」に、
	//int「b」の値が int「y」に格納されてるよ。
	static void plus(int x ,int y) {
		System.out.println(x + y);
	}
}

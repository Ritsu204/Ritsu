package course40;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//メソッド問題①
		printHello();
		
		//メソッド問題②
		multply(2,3);
		
		//メソッド問題③
		int x = multiplymodori(4,5);
		System.out.println(x);
		
		//メソッド問題④
		boolean tf = isEven(5);
		System.out.println(tf);
		
		//メソッド問題⑤
		String moji = getGreeting("こんにちは");
		System.out.println(moji);
		
	}

	//①
	static void printHello(){
		System.out.println("Hello,World!");
	}
	
	//②
	static void multply(int a,int b) {
		System.out.println(a*b);
	}
	
	
	//③
	static int multiplymodori(int a,int b) {
		return a*b;
	}
	
	//④
	static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	//⑤
	static String getGreeting(String name) {
		name = "こんにちは,"+name;
		return name;
	}
	
	
	
}

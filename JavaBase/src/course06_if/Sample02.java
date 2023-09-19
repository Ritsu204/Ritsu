package course06_if;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	String a = "あいうえお";
	
	String b = "かきくけこ";
	
//例1　変数aとbが等しいか？
	if (a.equals(b)) {
		System.out.println("文字は一緒です。");		
	}else {
		System.out.println("違う文字です！");
	}
	
//例2　変数aと「さしすせそ」がひとしいか？
	if (a.equals("さしすせそ")) {
		System.out.println("文字は一緒です");
	}else{
		System.out.println("違うよ！");
		
	}
	

	
	}

}

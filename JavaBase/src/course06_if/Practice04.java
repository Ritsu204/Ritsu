package course06_if;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("文字を入力してね");
	String moji = stdIn.next();
	
//文字列が「国際理工」かどうか判定するif文
if(moji.equals("国際理工")) {
	System.out.println
	("あなたが打ったのは「国際理工」だ！");
}else {
	System.out.println("国際理工じゃないなんて…");
	
}
	}

}

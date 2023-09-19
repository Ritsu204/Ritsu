package course08_if;

import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	Scanner stdIn = new Scanner(System.in);
		
	String like = stdIn.next();
	
	//switch文鉄板構文
	switch(like){
	case"魚":
		System.out.println("魚が好きです。");
	//以降の判定を全スキップ
		break;
	case"肉":
		System.out.println("肉が好きです。");
		break;
	
	//どれにも該当しない
	default :
		System.out.println("野菜派です。"); }
		
	
	
	
	
	}

}

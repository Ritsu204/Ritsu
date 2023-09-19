package course10;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	Scanner stdIn = new Scanner(System.in);	
	System.out.println("予約する日を入力　例）日曜日→日");
		
	String a = stdIn.next();
	
	switch(a){
	case"日" , "火" , "金":
		System.out.println("予約できません");
		break;
	case"月", "水" , "木曜" , "土":
		System.out.println("予約できます");
		break;
	
	default :
		System.out.println("エラー"); }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

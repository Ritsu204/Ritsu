package course09_switch;

import java.util.Scanner;

public class Uranai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

System.out.println("誕生日を入力してね");
Scanner stdIn =new Scanner(System.in);
int month = stdIn.nextInt();

switch(month) {
case 1 , 2 , 3 :
	System.out.println("大吉");
break;
case 4 , 5 , 6 :
	System.out.println("中吉");
break;
case 7 , 8 , 9 :
	System.out.println("小吉");
break;
case 10 , 11 , 12 :
	System.out.println("大凶");
break;
default :
	System.out.println("？？？");
}
		
		
	}

}

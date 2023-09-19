package course08_if;

import java.util.Scanner;

public class RTA {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("何月？");
	int a = stdIn.nextInt();
	
	switch(a){
	case 1 :
		System.out.println("1月は31日まであります。");
		break;
	case 2 :
		System.out.println("2月は28日まであります。");
		break;
	case 3 :
		System.out.println("3月は31日まであります。");
		break;	
	case 4 :
		System.out.println("4月は30日まであります。");
		break;
	case 5 :
		System.out.println("5月は31日まであります。");
		break;
	case 6 :
		System.out.println("6月は30日まであります。");
		break;
	case 7 :
		System.out.println("7月は31日まであります。");
		break;	
	case 8 :
		System.out.println("8月は31日まであります。");
		break;
	case 9 :
		System.out.println("9月は30日まであります。");
		break;
	case 10 :
		System.out.println("10月は31日まであります。");
		break;
	case 11 :
		System.out.println("11月は30日まであります。");
		break;
	case 12 :
		System.out.println("12月は31日まであります。");
	default :
		System.out.println("月がないです。");	
	}
	
	
	
	
	}

}

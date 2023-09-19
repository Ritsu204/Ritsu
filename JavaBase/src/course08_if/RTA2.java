package course08_if;

import java.util.Scanner;

public class RTA2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("何月？");
	int a = stdIn.nextInt();
	
	switch(a){
	case 1 , 3 , 5 , 7 , 8 , 10 :
		System.out.println(a +"月は31日まであります。");
	break;
	case 2 :
		System.out.println("2月は28日まであります。");
		break;	
	case 4 , 6 , 9 , 11 :
		System.out.println(a +"月は30日まであります。");
		break;
	default :
		System.out.println("月がないです。");	
	}
	
		
		
		
	}

}

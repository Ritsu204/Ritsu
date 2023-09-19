package course11_while;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Scanner stdIn = new Scanner(System.in);
System.out.println("iを入力");
int i = stdIn.nextInt();
		while(i <= 10) {
			System.out.println("現在のカウントは" + i + "です");
			i++;
		}
		
		
	}

}

package course01;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド

		Scanner stdIn = new Scanner(System.in);
		
	System.out.println("はい 1  いいえ 2  どちらでもない  3");
	
	System.out.println("男性ですか？");

	int a = stdIn.nextInt();
	
	if(a == 1) {
		System.out.println("エンジニアですか？");
		
	int b = stdIn.nextInt();
	
	if(b==1) 
	{System.out.println("Bさん");}
	
	else 
	{System.out.println("肉が好き？");
			int c = stdIn.nextInt();
	if(c==1)
	{System.out.println("Cさん");}
	
	else if(c == 3)
	{System.out.println("Aさん"); }    
	
	else if(c==2) 
	{System.out.println("誰ですか？");}
		}
	
	}else {
		
	System.out.println("営業職ですか？");
		
	int d = stdIn.nextInt(); 
		
	if(d==1) 
	{System.out.println("Fさん");}
	
	else 
	{System.out.println("犬派ですか？");
	
		int e = stdIn.nextInt();
		
	if(e ==1) 
	{System.out.println("Dさん");}
	
	else 
	{System.out.println("Eさん");}
	
	}
	}
	
	}

}

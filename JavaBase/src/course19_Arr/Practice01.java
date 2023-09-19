package course19_Arr;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	//慣れよう問題①	
		String[] mygroup = new String[3];
		mygroup[0] = "しまだ";
		mygroup[1] = "みぞぐち";
		mygroup[2] = "空席";
		
		for(int a = 0; a < 3; a++) {
			System.out.println(mygroup[a]);
		}System.out.println(); //改行
		
	//慣れよう問題②
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 11;
		mygroupnum[1] = 25;
		mygroupnum[2] = 999;
		
		for(int a = 0; a < 3; a++) {
			System.out.println(mygroupnum[a]);
		}System.out.println(); //改行
		
	//慣れよう問題③	
		int[] myNum = new int[3];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];
		
		for(int a = 0; a < 3; a++) {
			System.out.println(a + "個目…" +myNum[a]);
		}System.out.println(); //改行
		
	//慣れよう問題④
		Scanner stdIn = new Scanner(System.in);

		System.out.println("[1]の数値を入力");

		int[] myNumScan = new int[3];
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];

		for (int a = 0; a < 3; a++) {
			System.out.println(a + "個目…" + myNumScan[a]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

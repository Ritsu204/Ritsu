package course54;

public class BookControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//要素数5個の・・・
		int[] arr = { 10, 11, 12, 13, 14 };

		System.out.println(arr[3]);

		/**別解/////////////////////////////
		 int[] arr = new int[5]
		 
		 arr[0] = 10;
		 arr[1] = 11;
		 arr[2] = 12;
		 arr[3] = 13;
		 arr[4] = 14;
		 
		 System.out.println(arr[3])
		 
		 *//////////////////////////////////

		System.out.println();//改行

		//インスタンス作成

		Book book1 = new Book("明解Java", 1500);

		//book1 price 表示
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println();//改行
		
		Book book2 = new Book("ITパスポート", 2500);
		Book book3 = new Book("30時間でマスター", 1200);
		Book book4 = new Book("確かな力", 2800);

		Book[] hondana = new Book[4];
		hondana[0] = book1;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

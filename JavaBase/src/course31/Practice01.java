package course31;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Books books = new Books("初期ネーム",100,"初期太郎");
		books.display();
		
		books.name = "ITワールド";
		books.page = 500000;
		books.author ="サーティファイ";
		
		books.display();
		
	}

}

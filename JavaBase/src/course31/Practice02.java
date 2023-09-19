package course31;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Books[] arr = new Books[3];
		
		Books book1 = new Books("ITワールド",100,"サーティファイ");
		
		arr[0] = book1; 
		
		System.out.println(arr[0].name);
		
		
		Books book2 = new Books("明解Java",400,"柴田望洋");
		
		arr[1] =book2;
		
		//配列にしまったインスタンスの呼び出し
		System.out.println(arr[1].name);
		
	}

}

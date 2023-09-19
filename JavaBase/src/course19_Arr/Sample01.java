package course19_Arr;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String a = "嶌田";
		String b = "清水";
		String c = "立川";
		String d = "溝口";

		String e = "長縄";
		String f = "藤倉";
		String g = "大関";
		String h = "杉本";

		//配列の鉄板構文
		//[]のことを要素と呼ぶ、要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "しまだ";
		nameList[1] = "しみず";
		nameList[2] = "みぞぐち";

		for (int i = 0; i < 3; i++) {
			System.out.println("俺の友達の名前は " + nameList[i] + " だ。");
		}

	}
}

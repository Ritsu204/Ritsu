package course11_while;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//while 鉄板文
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			i++;
		}
		System.out.println("抜けたよ");

	}

}

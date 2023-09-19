package course11_while;

public class EX {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

int a = 0;
while(a <= 100) {
	int b = a%10;
	
	if (b ==0) {
		System.out.println("10の倍数です");
	}
	System.out.println("現在のカウントは"+ a + "です");
		a++;
	}
	}
}

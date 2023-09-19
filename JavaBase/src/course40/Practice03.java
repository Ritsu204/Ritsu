package course40;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列問題①
		int[] numbers = {10,20,30,40,50};
		
		for(int a = 0; a<numbers.length;a++) {
			System.out.print(numbers[a]+" ");
		}
		System.out.println();//改行
		
		//配列問題②
		String[] cities = {"東京","大阪","千葉","神奈川","埼玉笑"};
		
		for(int a = 0; a<cities.length;a++) {
			System.out.print(cities[a]+" ");
		}
		System.out.println();//改行
		
		//配列問題③
		
		int sum = 0;
		for(int a = 0; a<numbers.length;a++) {
			sum = sum + numbers[a];
		}
		System.out.println(sum);
		System.out.println();//改行
		
		//配列問題④
		int max = 0;
		for(int a = 0; a<numbers.length;a++) {
			if(max<numbers[a]) {
				max = numbers[a];
			}
		}
		System.out.println("一番大きいのは"+max);
		System.out.println();//改行
		
		//配列問題⑤
		int[] numbers2 = {11,20,31,40,51};
		System.out.println("奇数だよ↓");
		
		for(int a =0; a<numbers2.length;a++) {
			if(numbers2[a]%2==1) {
				System.out.print(numbers2[a]+" ");
			}
		}
		
		
		
	}

}

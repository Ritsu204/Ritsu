package course10;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約する日を入力");
		System.out.println("例）日曜→日");

		String a = stdIn.next();

		switch (a) {
		case "日":
			System.out.println("予約できません");
			break;
		case "月", "木":
			System.out.println("予約できます");
			break;

		case "火": {
			System.out.println("時間を入力");
			System.out.println("例）午前→前　午後→後　夜間→夜");
			String b = stdIn.next();
			switch (b) {
			case "前":
				System.out.println("予約できません");
				break;
			case "後", "夜":
				System.out.println("予約できます");
				break;
			default:
				System.out.println("エラー");
			}
		}
			break;
		case "水": {
			System.out.println("時間を入力");
			System.out.println("例）午前→前　午後→後　夜間→夜");
			String b = stdIn.next();
			switch (b) {
			case "夜":
				System.out.println("予約できません");
				break;
			case "後", "前":
				System.out.println("予約できます");
				break;
			default:
				System.out.println("エラー");
			}
		}
			break;
		case "金": {
			System.out.println("時間を入力");
			System.out.println("例）午前→前　午後→後　夜間→夜");
			String b = stdIn.next();
			switch (b) {
			case "前":
				System.out.println("予約できません");
				break;
			case "後", "夜":
				System.out.println("予約できます");
				break;
			default:
				System.out.println("エラー");
			}
		}

			break;
		case "土": {
			System.out.println("時間を入力");
			System.out.println("例）午前→前　午後→後　夜間→夜");
			String b = stdIn.next();
			switch (b) {
			case "後", "夜":
				System.out.println("予約できません");
				break;
			case "前":
				System.out.println("予約できます");
				break;
			default:
				System.out.println("エラー");
			}
		}

			break;

		default:
			System.out.println("エラー");
		}
	}

}

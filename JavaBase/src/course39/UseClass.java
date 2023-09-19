package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student st1 = new Student();
		
		st1.name = "立川";
		st1.no =16;
		
		Student st2 = new Student();
		
		st2.name = "杉本";
		st2.no =13;
		
		Student[] myfriend = new Student[2];
		myfriend[0] = st1;
		myfriend[1] = st2;
		
		for(int a =0; a < myfriend.length; a++) {
			System.out.println(myfriend[a].name);
		}
		
	}

}

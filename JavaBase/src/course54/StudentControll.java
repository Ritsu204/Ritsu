package course54;

public class StudentControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student tonari = new Student(22, "藤倉一樹");
		Student me = new Student(16, "立川竜ノ介");

		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;
		
		mymen[0].setName("杉本");;
		
		System.out.println(mymen[0].getName());
		
		
	}

}

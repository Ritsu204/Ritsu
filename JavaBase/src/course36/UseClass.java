package course36;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();
		System.out.println();//改行
		
		Kaden kd = new Kaden();
		kd.setName("冷蔵庫");
		kd.setPrice(10000);
		
		Kaden kd2 = new Kaden();
		kd2.setName("洗濯機");
		kd.setPrice(20000);
		
		kd.display();
		kd2.display();
		
	}

}

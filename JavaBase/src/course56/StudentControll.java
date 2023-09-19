package course56;

public class StudentControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student stu1 = new Student();
		stu1.setName("立川竜ノ介");
		stu1.setSyussekibango(16);

		System.out.println(stu1.getName());
		System.out.println(stu1.getSyussekibango());
		System.out.println();//改行

		stu1.study();
		System.out.println();//改行

		PoPocke po = new PoPocke();
		po.setName("ピカチュウ");
		po.setZukanNo(25);
		po.setType("電気");
		po.setKotaichi(6);
		po.setNickname("ピカピカ");

		System.out.println("名前：" + po.getName());
		System.out.println("図鑑番号：" + po.getZukanNo());
		System.out.println("タイプ：" + po.getType());
		System.out.println("個体値：" + po.getKotaichi());
		System.out.println("ニックネーム：" + po.getNickname());

	}

}

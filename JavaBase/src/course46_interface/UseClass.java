package course46_interface;

public class UseClass {
	public static void main(String[] args) {

		Cat tama = new Cat();

		tama.setName("たま");
		tama.setShurui("三毛猫");
		tama.setSize("30cmぐらい");

		tama.eat("猫缶");
		System.out.println(/*改行*/);
		
		tama.run();
		System.out.println(/*改行*/);
		
		tama.display();
		System.out.println(/*改行*/);
		
		Dentaku dentaku = new Dentaku();
		dentaku.calc(10, 20);
		
	}
}

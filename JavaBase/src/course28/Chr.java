package course28;

public class Chr {

	static String school;
	
	int attack;
	int def;
	int spd;
	int love;
	int MP;
	int HP;

	static void naguru(int naguruattack, int naguraredef) {
		System.out.println((naguruattack - naguraredef) + "のダメージを与えた");
	}

	void mamoru() {
		System.out.println("守りを固めて防御が" + (def * 2) + "になった");
	}

}

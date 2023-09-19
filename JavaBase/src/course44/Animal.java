package course44;

public class Animal extends Creatures {

	private String name;
	private String kari;
	
	void display() {
		System.out.println(this.name);
		System.out.println(this.kari);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKari() {
		return kari;
	}

	public void setKari(String kari) {
		this.kari = kari;
	}
	
}

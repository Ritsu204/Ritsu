package course55;

public class Typhoon {
	
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	
	//デフォルトコンストラクタ
	public Typhoon() {
		
	}
	
	//引数有りコンストラクタ
	public Typhoon(int no, String day,String as) {
		this.typhoonbango = no;
		this.hasseibi = day;
		this.asiaName = as;
		
	}

	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
	
	//getter,setter
}

package course55;

public class Typhoon3 {
	
	private int typhoonbango;
	private int hasseibi;
	private String asiaName;
	
	//デフォルトコンストラクタ
	public Typhoon3() {
		
	}
	
	//引数有りコンストラクタ
	public Typhoon3(int no, int day,String as) {
		this.typhoonbango = no;
		this.hasseibi = day;
		this.asiaName = as;
		
	}

	
	//getter,setter/////////////////////////
	
	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public int getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(int hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
	

}

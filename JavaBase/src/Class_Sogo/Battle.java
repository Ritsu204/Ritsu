package Class_Sogo;

public class Battle {

	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		String a = poke1.type;
		String b = poke2.type;
		int ap = poke1.power;
		int bp = poke2.power;

		//1が有利
		if (a.equals("炎") && b.equals("草")) {
			ap = ap*2;
		}

		if (a.equals("草") && b.equals("地面")) {
			ap = ap*2;
		}
		
		if (a.equals("地面") && b.equals("水")) {
			ap = ap*2;
		}
		
		if (a.equals("水") && b.equals("炎")) {
			ap = ap*2;
		}

		/////////////////////////////////////////////

		//2が有利
		if (b.equals("炎") && a.equals("草")) {
			bp = bp *2;
		}

		if (b.equals("草") && a.equals("地面")) {
			bp = bp *2;
		}
		
		if (b.equals("地面") && a.equals("水")) {
			bp = bp *2;
		}
		
		if (b.equals("水") && a.equals("炎")) {
			bp = bp *2;
		}

		//勝敗判定
		if(ap>bp) {
			winner = poke1.name;
			return winner;
		}else if (bp >ap) {
			winner = poke2.name;
			return winner;
		}else {
			winner ="なし";
			return winner;
		}
		
	}
	
	
}

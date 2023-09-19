package course29;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	Character me = new Character();	
	me.name = me.charname("一人目");
	me.hp = me.status(me.name,"HP");
	me.str = me.status(me.name,"str");
	me.dex = me.status(me.name,"dex");
	me.agi = me.status(me.name,"agi");
	me.def = me.status(me.name,"def");
	
	me.viewStatus();
	
	System.out.println(); //改行
	
	Character tonari = new Character();
	tonari.name =tonari.charname("二人目"); 
	tonari.hp = tonari.status(tonari.name,"HP");
	tonari.str = tonari.status(tonari.name,"str");
	tonari.dex = tonari.status(tonari.name,"dex");
	tonari.agi = tonari.status(tonari.name,"agi");
	tonari.def = tonari.status(tonari.name,"def");
		
	tonari.viewStatus();
		
	
	System.out.println(); //改行
	me.battle(me,tonari); 
	
	
	
	
	
	
	
	}


}

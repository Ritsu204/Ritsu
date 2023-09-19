package Class_Sogo_2;

public class Pocketon {

	String name;
	String type;
	int HP;
	int MP;
	int power;
	int defence;
	int speed;
	int runaway;
	int getted;
	
	Pocketon(String n,String t,int h ,int m,int p,int d,int s,int r){
		name = n;
		type = t;
		HP = h;
		MP = m;
		power = p;
		defence = d;
		speed = s;
		runaway = r;
		getted = 0;
	}

	void display() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(HP);
		System.out.println(MP);
		System.out.println(power);
		System.out.println(defence);
		System.out.println(speed);
		System.out.println(runaway);
		System.out.println(getted);
	}
	
	
	
	
}

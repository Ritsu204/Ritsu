package course46_interface;

public class Dentaku implements Keisanki{

	private int sum;
	
	public void calc(int num1,int num2){
		System.out.println(num1 + "+" + num2 +"=" + (num1+num2));
		
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}

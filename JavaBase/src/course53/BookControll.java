package course53;

public class BookControll {

	public static void main(String[] args) {

		Book book1 = new Book();
		System.out.println();//改行
		
		Book book2 = new Book("ITワールド");
		System.out.println();//改行
		
		Book book3 = new Book("新明解Java",2970);
		System.out.println();//改行
		
		System.out.println(book3.getTitle());
		System.out.println(book3.getPrice());
	}
	
}

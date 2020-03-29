package syntaxclass19;

//Write program as a Book class   that will have 2 Constructors. 
//While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed

public class Task2Book {
    String bookName;
    String bookTitle;
    int bookPrice;
    
    
    
    public Task2Book (int bookPrice){
		this.bookPrice=bookPrice;
	}
	public Task2Book(String bookName, String bookTitle){
		this(24);
		this.bookName=bookName;
		this.bookTitle=bookTitle;
		
	}
    
	public void display() {
		System.out.println("Book name is "+bookName+" title is "+bookTitle+" price is "+bookPrice);
	}
	
	
	
	public static void main(String[] args) {

		Task2Book obj= new Task2Book("Dan Brown","The Da Vinci Code");
		obj.display();
	}

}

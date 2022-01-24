package library;

public class Book {
	String name;

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

	public Book(String name) {
		this.name = name;
	}

}

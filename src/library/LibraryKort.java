package library;

import java.util.Scanner;

public interface LibraryKort {
	public boolean borrowBook();

}

class Library implements LibraryKort {
	Book book;

	public Library(Book book) {
		this.book = book;
	}

	@Override
	public boolean borrowBook() {
		System.out.printf("you can borrow %s.%n", this.book.name);
		return true;
	}

}

class LibraryProxy implements LibraryKort {
	String[] books = { "java", "Design", "analyses" };
	Library l;

	@Override
	public boolean borrowBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("enter Book's name:");
		String bookName = input.next();
		boolean isFound = false;
		input.close();
		for (int i = 0; i < books.length; i++) {
			if (bookName.equals((books[i]))) {
				isFound = true;
			}
		}
		if (isFound) {
			l = new Library(new Book(bookName)); // AWESOME
			l.borrowBook();
			return true;
		} else {
			System.out.printf("sorry we don't have %s.%n", bookName);
			return false;
		}

	}

}

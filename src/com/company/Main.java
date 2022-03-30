package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook(1, "codeBook", 1, "Kien", "Java", "NodeJS");
        books[1] = new ProgrammingBook(2, "codeBook", 2, "Kien", "JavaScript", "Angular");
        books[2] = new ProgrammingBook(3, "codeBook", 3, "Kien", "Java", "NodeJS");
        books[3] = new ProgrammingBook(4, "codeBook", 4, "Kien", "PHP", "NodeJS");
        books[4] = new ProgrammingBook(5, "codeBook", 5, "Kien", "Java", "Spring MVC");
        books[5] = new FictionBook(6, "codeBook", 6, "Kien", "Study");
        books[6] = new FictionBook(7, "codeBook", 7, "Kien", "Study");
        books[7] = new FictionBook(8, "codeBook", 8, "Kien", "Study");
        books[8] = new FictionBook(9, "codeBook", 9, "Kien", "Study");
        books[9] = new FictionBook(10, "codeBook", 10, "Kien", "Study");

        double priceBook = 0;
        for (Book book: books) {
            priceBook = priceBook + book.getPrice();
        }
        System.out.println(priceBook);

        double totalProgrammingBook = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book's language: ");
        String language = scanner.next();
        for (Book book: books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals(language)) {
                    totalProgrammingBook++;
                }
            }
        }
        System.out.println(totalProgrammingBook);
    }
}

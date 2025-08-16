package com.sonu.zgenInterv;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sap {

    public static void main(String[] args) throws IOException {
        List<LibBook> list=new ArrayList<>();
        list.add(new LibBook());

        String bookname="ABC";
        list.stream().filter(e->e.getName().equalsIgnoreCase(bookname)).forEach(System.out::println);
        // Load JSON
       /* ObjectMapper mapper = new ObjectMapper();
        List<LibBook> books = mapper.readValue(new File("books.json"), new TypeReference<List<LibBook>>() {});

        // Print all books
        System.out.println("📚 Library Book List:");
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, books.get(i).toString());
        }

        // Simulate checking out a book
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of the book you want to check out: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= books.size()) {
            LibBook selected = books.get(choice - 1);
            System.out.println("\n📖 Book Checked Out: " + selected.toString());

            // Show return date
            String returnTime = selected.getReturnTime(); // e.g. "14 days"
            int days = Integer.parseInt(returnTime.split(" ")[0]);
            LocalDate returnDate = LocalDate.now().plusDays(days);
            System.out.println("📅 Return by: " + returnDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();*/

    }

  /*  Read a list of books from JSON file to load the library class
    List of library books available with the following properties
                    Name
                    Author
                    Copies available
                    Rating
                    Genre
                    Return time ( max time this book can be held)
    When they checkout a book , show them the details of the book and the date of return

            [
    {
        "Name": "Pride and Prejudice",
            "Author": "Jane Austen",
            "CopiesAvailable": 3,
            "Rating": 4.6,
            "Genre": "Classic",
            "ReturnTime": "14 days"
    },
    {
        "Name": "Dune",
            "Author": "Frank Herbert",
            "CopiesAvailable": 5,
            "Rating": 4.8,
            "Genre": "Sci-Fi",
            "ReturnTime": "21 days"
    },
    {
        "Name": "Dracula",
            "Author": "Bram Stoker",
            "CopiesAvailable": 2,
            "Rating": 4.5,
            "Genre": "Horror",
            "ReturnTime": "14 days"
    },
    {
        "Name": "Frankenstein",
            "Author": "Mary Shelley",
            "CopiesAvailable": 4,
            "Rating": 4.7,
            "Genre": "Classic",
            "ReturnTime": "30 days"
    }
]*/
}

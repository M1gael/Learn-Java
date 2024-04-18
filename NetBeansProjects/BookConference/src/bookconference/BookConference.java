package oop.ct2.bookconference; 

import java.util.ArrayList;

public class BookConference {

    public static void main(String[] args) {
        
        
       
        ArrayList<Author> authors = new ArrayList<>();
       

        String targetAuthor = "John Doe"; 
        int targetAge = findTargetAgeOfAuthor(authors, targetAuthor);
        if (targetAge != -1) {
            System.out.println("Target age for " + targetAuthor + " books: " + targetAge);
        } else {
            System.out.println("Author not found.");
        }

        String mostPublishedAuthor = findMostPublishedAuthor(authors);
        System.out.println("Author with most books: " + mostPublishedAuthor);
    }

    public static int findTargetAgeOfAuthor(ArrayList<Author> authors, String authorName) {
        
        for (Author author : authors) {
            if (author.getName().equals(authorName)) {
                return author.getTargetAge();
            }
        }
        return -1;
    }

    public static String findMostPublishedAuthor(ArrayList<Author> authors) {

        Author mostPublished = null;
        int maxBooks = 0;
        for (Author author : authors) {
            int numBooks = author.getNumBooks(); 
            if (numBooks > maxBooks) {
                maxBooks = numBooks;
                mostPublished = author;
            }
        }
        if (mostPublished != null) {
            return mostPublished.getName();
        } else {
            return "No authors found"; 
        }
    }
}

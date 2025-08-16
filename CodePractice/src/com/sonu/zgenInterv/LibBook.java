package com.sonu.zgenInterv;

public class LibBook {
    String name;
    String Author;
    int CopiesAvailable;

    int Rating;
    String Genre;
    String ReturnTime;

    public LibBook() {
    }

    public LibBook(String name, String author, int copiesAvailable, int rating, String genre, String returnTime) {
        this.name = name;
        Author = author;
        CopiesAvailable = copiesAvailable;
        Rating = rating;
        Genre = genre;
        ReturnTime = returnTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getCopiesAvailable() {
        return CopiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        CopiesAvailable = copiesAvailable;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getReturnTime() {
        return ReturnTime;
    }

    public void setReturnTime(String returnTime) {
        ReturnTime = returnTime;
    }

    @Override
    public String toString() {
        return "LibBook{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", CopiesAvailable=" + CopiesAvailable +
                ", Rating=" + Rating +
                ", Genre='" + Genre + '\'' +
                ", ReturnTime='" + ReturnTime + '\'' +
                '}';
    }
}

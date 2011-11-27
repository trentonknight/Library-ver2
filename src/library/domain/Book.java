/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library.domain;

import java.io.Serializable;


/**
 *
 * @author trentonknight
 */
public class Book implements Serializable {
private String title;
private String isbn;
private String author;

public Book(){
    title = "";
    isbn = "";
    author = "";
}
public void setTitle(String title){
    this.title = title;
}
public void setIsbn(String isbn){
    this.isbn = isbn;
}
public void setAuthor(String author){
    this.author = author;
}
public String getTitle(){
    return title;
}
public String getIsbn(){
    return isbn;
}
public String getAuthor(){
    return author;
}
public String getBook() {
    return "Author: " + author + "\n Title: " + title + "\n ISBN: " + isbn;
  }

@Override
  public String toString() {
    return "["+getBook()+"]";
  }

 //**boolean test objects**//
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book bk = (Book) obj;
        if(!(this.title.equals(bk.title)))
        {
            return false;
        }
        if(!(this.isbn.equals(bk.isbn)))
        {
            return false;
        }
        if(!(this.author.equals(bk.author)))
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 97 * hash + (this.isbn != null ? this.isbn.hashCode() : 0);
        hash = 97 * hash + (this.author != null ? this.author.hashCode() : 0);
        return hash;
    }
}

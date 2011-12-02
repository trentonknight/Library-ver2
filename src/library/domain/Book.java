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
private int id;

public Book(){
    title = "";
    isbn = "";
    id = 0x0;
}
public void setTitle(String title){
    this.title = title;
}
public void setIsbn(String isbn){
    this.isbn = isbn;
}
public void setID(int id){
    this.id = id;
}
public String getTitle(){
    return title;
}
public String getIsbn(){
    return isbn;
}
public int getID(){
    return id;
}
public String getBook() {
    return id + "," + isbn + "," + title;
  }

@Override
  public String toString() {
    return ""+getBook()+"";
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
      
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 97 * hash + (this.isbn != null ? this.isbn.hashCode() : 0);
        hash = 97 * hash + this.id;
        return hash;
    }

   

    
   
}

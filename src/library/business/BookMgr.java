/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library.business;
import java.util.ArrayList;
import java.util.List;
import library.domain.Book;

/**
 *
 * @author trentonknight
 */
public class BookMgr {
 
 List<Object> newbook = new ArrayList<Object>();

    public void addBook(Book book){
        boolean add = newbook.add(book);
    }

}

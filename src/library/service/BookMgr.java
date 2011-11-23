/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import library.domain.*;

/**
 *
 * @author trentonknight
 */
public class BookMgr {public Book createBook(Book book){
    Factory factory = new Factory();
    IBookSvc bookSvc = factory.getBookSvc();
    return bookSvc.create(book);
}
    
    
}

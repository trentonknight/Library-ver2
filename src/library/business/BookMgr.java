/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.business;
import library.domain.*;
import library.service.Factory;
import library.service.IBookSvc;

/**
 *
 * @author trentonknight
 */
public class BookMgr {
    public Book createBook(Book book)
    {
    Factory factory = new Factory();
    IBookSvc bookSvc = factory.getBookSvc();
    return bookSvc.create(book);
    }
    public Book retBook(Book book)
    {
    Factory factory = new Factory();
    IBookSvc bookSvc = factory.getBookSvc();
    return bookSvc.retrieve(book);
    }
    
}

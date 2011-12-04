/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;

import library.domain.Book;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trentonknight
 */
public class IBookSvcJDBCImplTest {
    
    public IBookSvcJDBCImplTest() {
    }

   
    @Test
    public void testAdd() {
        System.out.println("add");
        Book book = null;
        IBookSvcJDBCImpl instance = new IBookSvcJDBCImpl();
        Book expResult = null;
        Book result = instance.add(book);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieve method, of class IBookSvcJDBCImpl.
     */
    @Test
    public void testRetrieve() {
        System.out.println("retrieve");
        Book book = null;
        IBookSvcJDBCImpl instance = new IBookSvcJDBCImpl();
        Book expResult = null;
        Book result = instance.retrieve(book);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class IBookSvcJDBCImpl.
     */
  
}

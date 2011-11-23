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
public class IBookSvcSerializedImplTest {
    
    public IBookSvcSerializedImplTest() {
    }

    

    /**
     * Test of create method, of class IBookSvcSerializedImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Book book = null;
        IBookSvcSerializedImpl instance = new IBookSvcSerializedImpl();
        Book expResult = null;
        Book result = instance.create(book);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieve method, of class IBookSvcSerializedImpl.
     */
    @Test
    public void testRetrieve() {
        System.out.println("retrieve");
        Book book = null;
        IBookSvcSerializedImpl instance = new IBookSvcSerializedImpl();
        Book expResult = null;
        Book result = instance.retrieve(book);
        assertEquals(expResult, result);
        
    }

   
}

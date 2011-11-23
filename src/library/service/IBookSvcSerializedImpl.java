/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import library.domain.*;

/**
 *
 * @author trentonknight
 */
public class IBookSvcSerializedImpl implements IBookSvc {
//*serializing
    public Book create(Book book) {
        try{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("output.txt"));
        output.writeObject(book);
        output.flush();
        output.close();
        }catch(Exception e){
            
        }
        return book;
    }
//*deserializing
    public Book retrieve(Book book) {
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("output.txt"));
            book = (Book)input.readObject();
            input.close();
        }catch(Exception e){
            
        }
        return book;

    }

    
}

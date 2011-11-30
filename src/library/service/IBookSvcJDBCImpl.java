/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;
import library.domain.Book;

/**
 *
 * @author trentonknight
 */
public class IBookSvcJDBCImpl implements IBookSvc {
    
    
   private String url = "jdbc:mysql://localhost/library?" + "user=root&password=admin";
    
   private Connection getConnection() throws Exception { 
      return DriverManager.getConnection(url); 
   }


    public Book add(Book book) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
	    String sql = "INSERT INTO library(id,isbn,title)VALUES('23','12345','C++ is great')";
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            Logger.getLogger(IBookSvcJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return book;
    }

    public Book retrieve(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

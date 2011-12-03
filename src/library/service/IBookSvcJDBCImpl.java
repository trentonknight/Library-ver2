/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.domain.Book;

/**
 *
 * @author trentonknight
 */
public class IBookSvcJDBCImpl implements IBookSvc {

    private String url = "jdbc:mysql://localhost/library?user=root&password=admin";

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(url);
    }

    public Book add(Book book) {
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO book"
                    + " (isbn, title, author) VALUES (?, ?, ?)");
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(IBookSvcJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return book;
    }

    public Book retrieve(Book book) {
        try {
            Connection conn = null;
            conn = getConnection();
            Statement stmt = null;
            String query = "select isbn, title, author from " + url + ".book";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                book.setIsbn(rs.getString("isbn"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
            }


        } catch (Exception ex) {
            Logger.getLogger(IBookSvcJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }
}

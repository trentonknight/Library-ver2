/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;

/**
 *
 * @author trentonknight
 */
public class Factory {
    public IBookSvc getBookSvc(){
        return new IBookSvcSerializedImpl();
    }
   public IAuthSvc getAuthSvc(){
        return (IAuthSvc) new IAuthSvcSerializedImpl();
    }  
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.document;

import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import nl.amnesty.crm.entity.Document;
import nl.amnesty.crm.entity.URL;

/**
 *
 * @author ed
 * 
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class DocumentCRUD {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public long create(
            @WebParam(name = "URL") URL url,
            @WebParam(name = "Title") String title,
            @WebParam(name = "Description") String description) {
        //TODO write your implementation code here:
        long documentid = 123456789;
        return documentid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "read")
    public Document read(long documentid) {
        //TODO write your implementation code here:
        Document document = new Document();
        URL url = new URL();
        document.setUrl(url);
        document.setTitle("Title");
        document.setDescription("Description");
        return document;
    }
    */ 

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(@WebParam(name = "Documentid") long documentid,
            @WebParam(name = "URL") URL url,
            @WebParam(name = "Title") String title,
            @WebParam(name = "Description") String description) {
        //TODO write your implementation code here:
        return documentid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(@WebParam(name = "Documentid") long documentid) {
        //TODO write your implementation code here:
        return documentid;
    }
    */
}

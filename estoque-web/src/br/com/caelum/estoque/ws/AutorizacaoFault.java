
package br.com.caelum.estoque.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-11-15T12:13:39.638-02:00
 * Generated source version: 3.1.12
 */

@WebFault(name = "AutorizacaoFault", targetNamespace = "http://ws.estoque.caelum.com.br/")
public class AutorizacaoFault extends Exception {
    
    private java.lang.String autorizacaoFault;

    public AutorizacaoFault() {
        super();
    }
    
    public AutorizacaoFault(String message) {
        super(message);
    }
    
    public AutorizacaoFault(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizacaoFault(String message, java.lang.String autorizacaoFault) {
        super(message);
        this.autorizacaoFault = autorizacaoFault;
    }

    public AutorizacaoFault(String message, java.lang.String autorizacaoFault, Throwable cause) {
        super(message, cause);
        this.autorizacaoFault = autorizacaoFault;
    }

    public java.lang.String getFaultInfo() {
        return this.autorizacaoFault;
    }
}

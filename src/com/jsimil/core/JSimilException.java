/*
 * JSimil. 2007-2010 Luis Quesada Torres.
 */

package com.jsimil.core;

import java.io.Serializable;

/**
 * Excepci�n lanzada por JSimil.
 * @author elezeta
 */
final public class JSimilException extends Exception implements Serializable {
    
    /**
     * Serializable
     */
    private static final long serialVersionUID = JSimil.serialVersionUID;
    
    /**
     * Tipo de excepci�n.
     */
    private ExceptionType tipo;
    
    /**
     * Constructor con cadena y tipo.
     * Lanza una excepci�n con el mensaje indicado y con el tipo indicado.
     * @param tipo Tipo de excepci�n.
     * @param mensaje Cadena de excepci�n.
     * @.post Objeto inicializado.
     */
    protected JSimilException(ExceptionType tipo,String mensaje) {
        super(mensaje);
        this.tipo = tipo;
    }
    
    /**
     * Devuelve el tipo de excepci�n.
     * @return Tipo de excepci�n.
     */
    public ExceptionType getTipo() {
        return tipo;
    }
    
}

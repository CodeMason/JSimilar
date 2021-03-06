/*
 * JSimil. 2007-2010 Luis Quesada.
 */

package com.jsimil.languages;

/**
 * Excepci�n de idioma inexistente.
 * @author elezeta
 */
public class NoSuchLanguageException extends Exception {

    /**
     * Serializable
     */
    private static final long serialVersionUID = 0;

    /**
     * Constructor con cadena.
     * Lanza una excepci�n con el mensaje indicado.
     * @param mensaje Cadena de excepci�n.
     */
    NoSuchLanguageException(String mensaje) {
        super(mensaje);
    }
    
}

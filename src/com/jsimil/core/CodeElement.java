/*
 * JSimil. 2007-2010 Luis Quesada Torres.
 */

package com.jsimil.core;

import java.io.Serializable;


/**
 * Elemento localizable en un fichero o porci�n del mismo.
 * @author elezeta
 */
public abstract class CodeElement extends MatchableElement
        implements Serializable {
    
    /**
     * Serializable
     */
    private static final long serialVersionUID = JSimil.serialVersionUID;
    
    /**
     * Descriptor del lugar en el que est� el c�digo original.
     */
    private Location lugarCodigoOriginal;
    
    /**
     * Descriptor del lugar en el que est� el c�digo desensamblado.
     */
    private Location lugarCodigoDesensamblado;
    
    /**
     * Programa al que pertenece este elemento.
     */
    private Program programa;
    
    /**
     * Porcentaje que representa del elemento padre.
     */
    private double porcentajePadre;
    
    /**
     * Porcentaje que representa del programa.
     */
    double porcentajePrograma;
    
    /**
     * Constructor.
     * @param programa Programa que contiene al elemento.
     * @param codigoOriginal Lugar del c�digo original (null si no disponible).
     * @param codigoDesensamblado Lugar del c�digo desensamblado.
     * @param nombre Nombre del elemento.
     * @param id Id del elemento.
     * @.post Objeto elemento inicializado.
     */
    CodeElement(Program programa,Location codigoOriginal,
                               Location codigoDesensamblado,String nombre,
                               int id) {
        super(nombre,id);    

        this.programa = programa;
        lugarCodigoOriginal = codigoOriginal;
        lugarCodigoDesensamblado = codigoDesensamblado;
    }
       
    /**
     * Devuelve el programa que contiene a este elemento.
     * @return Programa que contiene al elemento.
     */
    Program getPrograma() {
        return programa;
    }
        
    /**
     * Cambia el porcentaje que representa del elemento padre.
     * @param porcentaje Nuevo porcentaje.
     * @.post Queda asignado el nuevo porcentaje.
     */
    void setPorcentajePadre(double porcentaje) {
        this.porcentajePadre = porcentaje;
    }
    
    /**
     * Cambia el porcentaje que representa del programa.
     * @param porcentaje Nuevo porcentaje.
     * @.post Queda asignado el nuevo porcentaje.
     */
    void setPorcentajePrograma(double porcentaje) {
        this.porcentajePrograma = porcentaje;
    }
    
    /**
     * Devuelve el porcentaje que representa del padre.
     * @return Porcentaje que representa del padre.
     */
    public double getPorcentajePadre() {
        return porcentajePadre;
    }
    
    /**
     * Devuelve la localizaci�n del c�digo original.
     * @return Localizaci�n del c�digo original.
     */
    public Location getLugarCodigoOriginal() {
        return lugarCodigoOriginal;
    }
    
    /**
     * Devuelve la localizaci�n del c�digo desensamblado.
     * @return Localizaci�n del c�digo desensamblado.
     */
    public Location getLugarCodigoDesensamblado() {
        return lugarCodigoDesensamblado;
    }
    
    /**
     * Devuelve el porcentaje que representa del programa.
     * @return Porcentaje que representa del programa.
     */
    public double getPorcentajePrograma() {
        return porcentajePrograma;
    }

}

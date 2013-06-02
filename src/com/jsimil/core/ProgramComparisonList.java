/*
 * JSimil. 2007-2010 Luis Quesada.
 */

package com.jsimil.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Conjunto de las comparaciones entre programas obtenidas.
 * @author elezeta
 */
final public class ProgramComparisonList implements Serializable {
    
    /**
     * Serializable
     */
    private static final long serialVersionUID = JSimil.serialVersionUID;
        
    /**
     * Lista de resultados de comparar programas entre s�.
     */
    List<ProgramComparison> resultados;
    
    /**
     * Lista con los nombres de los programas comparados.
     */
    private List<String> nombres;
    
    /**
     * Constructor de resultados.
     * @.post Objeto resultados inicializado.
     */
    protected ProgramComparisonList() {
        resultados = new ArrayList<ProgramComparison>();
        nombres = new ArrayList<String>();
    }
    
    /**
     * Devuelve la comparaci�n de dos programas.
     * @param nombre1 Nombre del primer programa.
     * @param nombre2 Nombre del segundo programa.
     * @return Comparaci�n entre ambos programas.
     * @exception JSimilException No se puede comparar un programa consigo mismo.
     * @exception JSimilException No existe la comparaci�n indicada.
     */
    public ProgramComparison getResultado(String nombre1,String nombre2)
            throws JSimilException {
        int i;
        ProgramComparison res;
        for (i = 0;i < resultados.size();++i) {
            res = resultados.get(i);
            if (((res.getNombre1().equals(nombre1) &&
                res.getNombre2().equals(nombre2))) ||
                ((res.getNombre1().equals(nombre2) &&
                res.getNombre2().equals(nombre1)))) {
                return res;
            }
        }
        throw new JSimilException(ExceptionType.NO_EXISTE_COMPARACION_INDICADA,
                    "No existe la comparaci�n indicada");
    }
    
    /**
     * Devuelve la lista completa de comparaciones.
     * @return Comparaci�n entre todos los programas.
     */
    public List<ProgramComparison> getResultados() {
        return Collections.unmodifiableList(resultados);
    }
    
    /**
     * Devuelve la lista de nombres de programas comparados.
     * @return Nombres de todos los programas.
     */
    public List<String> getNombres() {
        return nombres;
    }
    
}

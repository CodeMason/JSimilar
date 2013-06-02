/*
 * JSimil. 2007-2010 Luis Quesada.
 */

package com.jsimil.profileeditor;

import java.io.File;

/**
 * Filtrador de ficheros por extensi�n.
 * @author elezeta
 */
public final class ExtensionFileFilter
        extends javax.swing.filechooser.FileFilter {

    /**
     * Descripci�n del filtro.
     */
    private String desc;
    
    /**
     * Extensi�n del filtro.
     */
    private String ext;
    
    /**
     * Constructor.
     * @param desc Descripci�n.
     * @param ext Extensi�n.
     */
    public ExtensionFileFilter(String desc,String ext) {
        this.desc = desc;
        this.ext = ext.toLowerCase();
    }
            
    /**
     * Se acepta si la extensi�n coincide.
     * @param pathname Ruta del fichero a comparar.
     * @return true si coincide, false si no.
     */
    public boolean accept(File pathname) {
        return pathname.getAbsolutePath().toLowerCase().endsWith(ext) ||
                pathname.isDirectory();
    }

    /**
     * Devuelve la descripci�n del filtro.
     * @return descripci�n del filtro.
     */
    @Override
    public String getDescription() {
        return desc+" (*"+ext+")";
    }
    

}

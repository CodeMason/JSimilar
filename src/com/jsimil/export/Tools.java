/*
 * JSimil. 2007-2010 Luis Quesada Torres.
 */

package com.jsimil.export;

import java.util.StringTokenizer;

/**
 * Clase auxiliar de m�todos est�ticos.
 * @author elezeta
 */
abstract class Tools {

    /**
     * Codifica caracteres extra�os a xml.
     * @param re Cadena a codificar.
     * @return Cadena codificada.
     */
    static String codifica2(String re) {
        re = re.replace("&","&amp;");
        re = re.replace("<","&lt;");
        re = re.replace(">","&gt;");
        re = re.replace("\"","&quot;");
        re = re.replace("'","&#039;");
        re = re.replace("(","&#040;");
        re = re.replace(")","&#041;");
        re = re.replace("/","&#047;");
        re = re.replace("\\","&#092;");   
        return re;
    }
    
    /**
     * Codifica caracteres extra�os a html.
     * @param re Cadena a codificar.
     * @return Cadena codificada.
     */
    static String codifica(String re) {
        re = re.replace("&","&amp;");
        re = re.replace(" ","&nbsp;");
        re = re.replace("�","&aacute;");
        re = re.replace("�","&eacute;");
        re = re.replace("�","&iacute;");
        re = re.replace("�","&oacute;");
        re = re.replace("�","&uacute;");
        re = re.replace("�","&Aacute;");
        re = re.replace("�","&Eacute;");
        re = re.replace("�","&Iacute;");
        re = re.replace("�","&Oacute;");
        re = re.replace("�","&Uacute;");
        re = re.replace("�","&ntilde;");
        re = re.replace("�","&Ntilde;");
        re = re.replace("<","&lt;");
        re = re.replace(">","&gt;");
        re = re.replace("\"","&quot;");
        re = re.replace("'","&#039;");
        re = re.replace("(","&#040;");
        re = re.replace(")","&#041;");
        re = re.replace("/","&#047;");
        re = re.replace("\\","&#092;");   
        return re;
    }

    /**
     * Codifica caracteres extra�os a html y mete wordwrap.
     * @param re Cadena a codificar.
     * @return Cadena codificada.
     */
    static String codificacod(String re) {
        int codl = 62;
        String rea = "";
        rea = rea.replace("\t","    ");
        while (!re.equals("")) {
            if (re.length()>codl) {
                rea+=re.substring(0,codl)+" _\n_ ";
                re = re.substring(codl);
                codl = 60;
            }
            else {
                rea+=re;
                re = "";
            }
        } 
        rea = rea.replace("&","&amp;");
        rea = rea.replace(" ","&nbsp;");
        rea = rea.replace("�","&aacute;");
        rea = rea.replace("�","&eacute;");
        rea = rea.replace("�","&iacute;");
        rea = rea.replace("�","&oacute;");
        rea = rea.replace("�","&uacute;");
        rea = rea.replace("�","&Aacute;");
        rea = rea.replace("�","&Eacute;");
        rea = rea.replace("�","&Iacute;");
        rea = rea.replace("�","&Oacute;");
        rea = rea.replace("�","&Uacute;");
        rea = rea.replace("�","&ntilde;");
        rea = rea.replace("�","&Ntilde;");
        rea = rea.replace("<","&lt;");
        rea = rea.replace(">","&gt;");
        rea = rea.replace("\"","&quot;");
        rea = rea.replace("'","&#039;");
        rea = rea.replace("(","&#040;");
        rea = rea.replace(")","&#041;");
        rea = rea.replace("/","&#047;");
        rea = rea.replace("\\","&#092;");   
        rea = rea.replace("\n","<br/>");   
        return rea;
    }

    /**
     * Devuelve una cadena recortada con espacios cada 40 caracteres.
     * @param re Cadena a recortar.
     * @return Cadena recortada con espacios.
     */
    static String recorta(String re) {
        re = re.replace(";","; ");
        re = re.replace(".",". ");
        re = re.replace(":",": ");
        re = re.replace("/","/ ");
        re = codifica(re).replace("&nbsp;"," ");
        StringTokenizer st = new StringTokenizer(re);
        String output = "";
        String t;
        while (st.hasMoreTokens()) {
           t = st.nextToken();  
           while (!t.equals("")) {
               if (t.length()>40) {
                   output+=" "+t.substring(0,40);
                   t = t.substring(40);
               }
               else {
                   output+=" "+t;
                   t = "";
               }
           }
        }           
        return output;
    }
    
}

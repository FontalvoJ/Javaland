
package Controlador;


public class cls_equipos {
    
    private String str_codigo;
    private String str_nombre;
    private int int_numero;
    private String str_especificaciones;
    private String str_conf_red;
    private String str_fecha;

    public cls_equipos(String str_codigo, String str_nombre, int int_numero, String str_especificaciones, String str_conf_red, String str_fecha) {
        this.str_codigo = str_codigo;
        this.str_nombre = str_nombre;
        this.int_numero = int_numero;
        this.str_especificaciones = str_especificaciones;
        this.str_conf_red = str_conf_red;
        this.str_fecha = str_fecha;
    }

    public String getStr_codigo() {
        return str_codigo;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public int getInt_numero() {
        return int_numero;
    }

    public void setInt_numero(int int_numero) {
        this.int_numero = int_numero;
    }

    public String getStr_especificaciones() {
        return str_especificaciones;
    }

    public void setStr_especificaciones(String str_especificaciones) {
        this.str_especificaciones = str_especificaciones;
    }

    public String getStr_conf_red() {
        return str_conf_red;
    }

    public void setStr_conf_red(String str_conf_red) {
        this.str_conf_red = str_conf_red;
    }

    public String getStr_fecha() {
        return str_fecha;
    }

    public void setStr_fecha(String str_fecha) {
        this.str_fecha = str_fecha;
    }
    
    
      
}

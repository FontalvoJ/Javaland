public class cls_platos {

    private String str_codigo;
    private String str_nombre;
    private float flt_precio;

    public cls_platos(String codigo, String nombre, float precio) {
        this.str_codigo = codigo;
        this.str_nombre = nombre;
        this.flt_precio = precio;
    }

    public String getCodigoPlato() { return str_codigo; }
    public String getNombre() { return str_nombre; }
    public float getPrecio() { return flt_precio; }


    public void setNombre(String nombre) { this.str_nombre = nombre; }
    public void setPrecio(float precio) { this.flt_precio = precio; }
}
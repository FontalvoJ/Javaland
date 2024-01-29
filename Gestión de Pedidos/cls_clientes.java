public class cls_clientes {

    private String str_codigo;
    private String str_nombre;
    private String str_contacto;
    private String str_direccion;

    public cls_clientes(String codigo, String nombre, String contacto, String direccion) {
        this.str_codigo = codigo;
        this.str_nombre = nombre;
        this.str_contacto = contacto;
        this.str_direccion = direccion;
    }

    public String getCodigoCliente() { return str_codigo;}

    public String getNombre() { return str_nombre;}

    public String getContacto() { return str_contacto;}

    public String getDireccion() { return str_direccion;}

    public void setCodigo(String codigo) { this.str_codigo = codigo; }

    public void setNombre(String nombre) { this.str_nombre = nombre; }

    public void setContacto(String contacto) { this.str_contacto = contacto; }

    public void setDireccion(String direccion) { this.str_direccion = direccion; }
}

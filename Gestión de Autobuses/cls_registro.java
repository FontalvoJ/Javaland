 public class cls_registro{

    private String str_nombres;
    private String str_apellidos;
    private String str_contacto;
    private String str_correo;
    private String str_placa_vehiculo;
    private String str_descripcion_vehiculo;

    public cls_registro(String nombres, String apellidos, String contacto, String correo, String placa_vehiculo, String descripcion_vehiculo) {
        this.str_nombres = nombres;
        this.str_apellidos = apellidos;
        this.str_contacto = contacto;
        this.str_correo = correo;
        this.str_placa_vehiculo = placa_vehiculo;
        this.str_descripcion_vehiculo = descripcion_vehiculo;
    }

    public String getNombres() {return str_nombres;}
    public String getApellidos() {return str_apellidos;}
    public String getContacto () {return str_contacto;}
    public String getCorreo() {return str_correo;}
    public String getPlaca() {return str_placa_vehiculo;}
    public String getDescripcion () {return str_descripcion_vehiculo;}


    public void setNombres(String nombres) { this.str_nombres = nombres; }
    public void setApellidos(String apellidos) { this.str_apellidos = apellidos; }
    public void setContacto(String contacto) { this.str_contacto = contacto; }
    public void setCorreo(String correo) { this.str_correo = correo; }
    public void setPlaca(String placa_vehiculo) { this.str_placa_vehiculo = placa_vehiculo; }
    public void setDescripcion(String descripcion_vehiculo) { this.str_descripcion_vehiculo = descripcion_vehiculo; }
}



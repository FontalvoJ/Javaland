public class cls_tiquete {
    
    private String str_id;
    private String str_nombre;
    private String str_contacto;
    private String str_correo;
    private String str_direccion;
    private int int_tipotiquete;
    private int int_cantidad;
    private float flt_totaltiquete;

    public cls_tiquete() {
        this.str_id= "";
        this.str_nombre = "";
        this.str_contacto = "";
        this.str_correo = "";
        this.str_direccion = "";
        this.int_tipotiquete = 0;
        this.int_cantidad = 0;
        this.flt_totaltiquete = 0;
    }
    
    public float fnt_CalcularTotal() {
        
        float flt_precioBase = 0;
        float flt_descuento = 0;

        switch (int_tipotiquete) {
            
             // Económico
            case 0 -> {
                flt_precioBase = 350000;
                if (int_cantidad >= 2) {
                    flt_descuento = (float)(flt_precioBase * 0.15);
                }
            }
            
            // Turista
            case 1 -> {
                
                flt_precioBase = 450000;
                if (int_cantidad >= 3) {
                    flt_descuento = (float) (flt_precioBase * 0.10);
                }
            }
            
            // Ejecutivo
            case 2 -> {
                
                flt_precioBase = 600000;
                if (int_cantidad >= 2) {
                    flt_descuento = (float) (flt_precioBase * 0.20);
                }
            }
        }

        flt_totaltiquete = (flt_precioBase * int_cantidad) - flt_descuento;
        return flt_totaltiquete;
    }

    public float getTotaltiquete() {
        return flt_totaltiquete;
    }
    
        public void setId(String id) {
        this.str_id= id;
    }

    public void setNombre(String nombre) {
        this.str_nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.str_contacto = contacto;
    }

    public void setCorreo(String correo) {
        this.str_correo = correo;
    }

    public void setDireccion(String direccion) {
        this.str_direccion = direccion;
    }

    public void setTipoTiquete(int tipoTiquete) {
        this.int_tipotiquete = tipoTiquete;
    }

    public void setCantidad(int cantidad) {
        this.int_cantidad = cantidad;
    }
    
}

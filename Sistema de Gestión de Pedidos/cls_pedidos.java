public class cls_pedidos {

    private String str_cod_plato;
    private String str_cod_cliente;
    private String str_fecha;
    private float flt_total;
    private int int_cantidad;

    public cls_pedidos(String plato, String cliente, float precio, String fecha, int cantidad) {
        this.str_cod_plato = plato;
        this.str_cod_cliente = cliente;
        this.str_fecha = fecha;
        this.int_cantidad = cantidad;
        this.flt_total = precio * cantidad;
    }

    public String getCodigoPlato() {return str_cod_plato; }

    public String getCodigoCliente() { return str_cod_cliente; }

    public float getTotal() { return flt_total; }

    public String getFecha() { return str_fecha; }

    public int getCantidad() { return int_cantidad; }
}

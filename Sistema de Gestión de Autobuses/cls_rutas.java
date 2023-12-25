public class cls_rutas {

    private String str_fecha;
    private String str_descripcion_ruta;
    private String str_placa_vehiculo;

    public cls_rutas(String fecha, String descripcion_ruta, String placa_vehiculo) {
        this.str_fecha = fecha;
        this.str_descripcion_ruta = descripcion_ruta;
        this.str_placa_vehiculo = placa_vehiculo;
    }

    public String getFecha() { return str_fecha; }
    public String getDescripcionRuta() { return str_descripcion_ruta; }
    public String getPlacaVehiculo() { return str_placa_vehiculo; }

    public void setFecha(String fecha) { this.str_fecha = fecha; }
    public void setDescripcionRuta(String descripcion_ruta) { this.str_descripcion_ruta = descripcion_ruta; }
    public void setPlacaVehiculo(String placa_vehiculo) { this.str_placa_vehiculo = placa_vehiculo; }
}

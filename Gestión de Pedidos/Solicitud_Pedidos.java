import javax.swing.JOptionPane;

public class Solicitud_Pedidos {


    static cls_clientes[] clientes = new cls_clientes[20];
    static cls_platos[] platos = new cls_platos[20];
    static cls_pedidos[] pedidos = new cls_pedidos[20];
    static int clientePosicion = 0;
    static int platoPosicion = 0;
    static int pedidoPosicion = 0;

    public static void main(String[] args) {
        fnt_menu();
    }

    private static void fnt_selector(String opcion) {
        switch (opcion) {
            case "1":
                fnt_registrarClientes();
                break;
            case "2":
                fnt_registrarPlatos();
                break;
             case "3":
                fnt_registrarPedidos();
                break;
            case "4":
                fnt_mostrarReporte();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     private static void fnt_menu() {
        while (true) {
            String menu = JOptionPane.showInputDialog(null, "-/-/-/- MENU PRINCIPAL -/-/-/-\n" +
                    "1. Registrar Clientes\n" +
                    "2. Registrar Platos\n" +
                    "3. Registrar Pedidos\n" +
                    "4. Mostrar Reporte\n" +
                    "5. Salir del programa\n");
            fnt_selector(menu);
        }
    }

    private static void fnt_registrarClientes() {
        String codigo = JOptionPane.showInputDialog(null, "Id Cliente");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente");
        String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto del cliente");
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion del cliente");
       
        cls_clientes cliente = new cls_clientes(codigo, nombre, contacto, direccion);
        clientes[clientePosicion] = cliente;
        clientePosicion++;
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fnt_registrarPlatos() {
        String codigo = JOptionPane.showInputDialog(null, "Id Plato");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del plato");
        float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio del plato"));
       
        cls_platos plato = new cls_platos(codigo, nombre, precio);
        platos[platoPosicion] = plato;
        platoPosicion++;
        JOptionPane.showMessageDialog(null, "Plato registrado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
    }

    private static float obtenerPrecioPlato(String codigoPlato) {
        for (int i = 0; i < platoPosicion; i++) {
            if (platos[i].getCodigoPlato().equals(codigoPlato)) {
                return platos[i].getPrecio();
            }
        }
        return 0.0f;
    }

    private static void fnt_registrarPedidos() {
        String codigoPlato = JOptionPane.showInputDialog(null, "Ingrese el código del plato");
        String codigoCliente = JOptionPane.showInputDialog(null, "Ingrese el código del cliente");
        
        boolean platoValido = false;
        boolean clienteValido = false;
        
        for (int i = 0; i < platoPosicion; i++) {
            if (platos[i].getCodigoPlato().equals(codigoPlato)) {
                platoValido = true;
                break;
            }
        }
        
        for (int i = 0; i < clientePosicion; i++) {
            if (clientes[i].getCodigoCliente().equals(codigoCliente)) {
                clienteValido = true;
                break;
            }
        }
        
        if (platoValido && clienteValido) {
            float precioPlato = obtenerPrecioPlato(codigoPlato); 
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
            String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha del pedido");
        
            
            cls_pedidos pedido = new cls_pedidos(codigoPlato, codigoCliente, precioPlato, fecha, cantidad);
            pedidos[pedidoPosicion] = pedido;
            pedidoPosicion++;
            JOptionPane.showMessageDialog(null, "Pedido registrado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Código de plato o cliente no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static void fnt_mostrarReporte() {
        if (pedidoPosicion == 0) {
            JOptionPane.showMessageDialog(null, "No hay pedidos registrados.", "Reporte", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder reporte = new StringBuilder("-/-/-/- REPORTE DE PEDIDOS -/-/-/-\n");
            
            for (int i = 0; i < pedidoPosicion; i++) {
                cls_pedidos pedido = pedidos[i];
                
                reporte.append("Pedido ").append(i + 1).append(":\n");
                reporte.append("Cliente: ").append(pedido.getCodigoCliente()).append("\n");
                reporte.append("Plato: ").append(pedido.getCodigoPlato()).append("\n");
                reporte.append("Cantidad: ").append(pedido.getCantidad()).append("\n");
                reporte.append("Total: ").append(pedido.getTotal()).append("\n\n");
            }
            
            JOptionPane.showMessageDialog(null, reporte.toString(), "Reporte", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
}

import javax.swing.JOptionPane;

public class SistemaRegistroAutobus {

    static cls_registro[] conductores = new cls_registro[15];
    static cls_rutas[] rutas = new cls_rutas[15];
    static int conductorPosicion = 0;
    static int rutaPosicion = 0;

    public static void main(String[] args) {
        fnt_menu();
    }

    private static void fnt_selector(String opcion) {
        switch (opcion) {
            case "1":
                fnt_registrarConductor();
                break;
            case "2":
                fnt_registrarRuta();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void fnt_menu() {
        while (true) {
            String menu = JOptionPane.showInputDialog(null, "-/-/-/- MENU PRINCIPAL -/-/-/-\n" +
                    "1. Registrar Conductor\n" +
                    "2. Registrar Ruta\n" +
                    "3. Salir del programa\n");
            fnt_selector(menu);
        }
    }

    private static void fnt_registrarConductor() {
        String nombres = JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor");
        String apellidos = JOptionPane.showInputDialog(null, "Ingrese los apellidos del conductor");
        String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto del conductor");
        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del conductor");
        String placa_vehiculo = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo");
        String descripcion_vehiculo = JOptionPane.showInputDialog(null, "Ingrese la descripción del vehículo");

        cls_registro conductor = new cls_registro(nombres, apellidos, contacto, correo, placa_vehiculo, descripcion_vehiculo);
        conductores[conductorPosicion] = conductor;
        conductorPosicion++;
        JOptionPane.showMessageDialog(null, "Conductor registrado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fnt_registrarRuta() {
        String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de la ruta");
        String descripcion_ruta = JOptionPane.showInputDialog(null, "Ingrese la descripción de la ruta");
        String placa_vehiculo = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo asociado a la ruta");

        cls_rutas ruta = new cls_rutas(fecha, descripcion_ruta, placa_vehiculo);
        rutas[rutaPosicion] = ruta;
        rutaPosicion++;
        JOptionPane.showMessageDialog(null, "Ruta registrada con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}

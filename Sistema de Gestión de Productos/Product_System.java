import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Product_System {

    static cls_products[] listgroups = new cls_products[1000];
    static int groupPosicion = 0;

    static cls_groupstock[] groupStockList = new cls_groupstock[1000];
    static int groupStockPosition = 0;

    public static void main(String[] args) {
        fnt_menu();
    }

    private static void fnt_selector(String opcion) {
        switch (opcion) {
            case "1":
                fnt_addProducts();
                break;
            case "2":
                fnt_showProducts();
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
            String menu = JOptionPane.showInputDialog(null,
                    "╔════════ MENU PRINCIPAL ═════════╗\n" +
                            "║   1. Agregar Producto                            ║\n" +
                            "║   2. Ver Reporte de Inventario              ║\n" +
                            "║   3. Salir del programa                           ║\n" +
                            "╚═══════════════════════════════════╝\n" +
                            "Ingrese su opción:",
                    "Menú Principal", JOptionPane.PLAIN_MESSAGE);
            fnt_selector(menu);
        }
    }

    private static void fnt_addProducts() {
        String product = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto");
        int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
        String group = JOptionPane.showInputDialog(null, "Ingrese el grupo");

        
        boolean productExists = false;
        for (int i = 0; i < groupPosicion; i++) {
            cls_products existingProduct = listgroups[i];
            if (existingProduct.getProduct().equals(product)) {
                int currentStock = existingProduct.getStock();  
                currentStock += stock;
                existingProduct.setStock(currentStock);
                productExists = true;
                break;
            }
        }

        
        if (!productExists) {
            cls_products groups = new cls_products(product, stock, group);
            listgroups[groupPosicion] = groups;
            groupPosicion++;
        }

        
        boolean groupExists = false;
        for (int i = 0; i < groupStockPosition; i++) {
            cls_groupstock existingGroup = groupStockList[i];
            if (existingGroup.getGroupName().equals(group)) {
                int currentStock = existingGroup.getStock(); 
                currentStock += stock;
                existingGroup.setStock(currentStock);
                groupExists = true;
                break;
            }
        }

        if (!groupExists) {
            cls_groupstock groupStock = new cls_groupstock(group, stock);
            groupStockList[groupStockPosition] = groupStock;
            groupStockPosition++;
        }

        JOptionPane.showMessageDialog(null, "Producto registrado con éxito", "Registro",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fnt_showProducts() {
        String group = JOptionPane.showInputDialog(null, "Ingrese el grupo que desea visualizar:");

        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Producto");
        model.addColumn("Stock");

        boolean found = false;

    
        for (int i = 0; i < groupPosicion; i++) {
            cls_products product = listgroups[i];
            if (product.getGroup().equals(group)) {
                found = true;
                model.addRow(new Object[] { product.getProduct(), product.getStock() });
            }
        }

        
        if (!found) {
            JOptionPane.showMessageDialog(null, "No se encontraron productos en el grupo " + group, "Reporte",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JTable table = new JTable(model);
            JOptionPane.showMessageDialog(null, new JScrollPane(table), "Productos en el Grupo " + group,
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

}

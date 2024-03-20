public class cls_products {
    private String str_product;
    private int int_stock;
    private String str_group;
   

    public cls_products (String product, int stock, String group) {
        this.str_product = product;
        this.int_stock = stock;
        this.str_group = group;
    }
    
    public String getProduct() { return str_product; }
    
    public void setProduct(String product) { this.str_product = product; }
    
    public int getStock() { return int_stock; }
    
    public void setStock(int stock) { this.int_stock = stock; }
    
    public String getGroup() { return str_group; }
    
    public void setGroup(String group) { this.str_group = group; }
    

}
public class cls_groupstock {
    private String str_groupName;
    private int int_stock;

    public cls_groupstock(String groupName, int stock) {
        this.str_groupName = groupName;
        this.int_stock = stock;
    }

    public String getGroupName() {
        return str_groupName;
    }

    public int getStock() {
        return int_stock;
    }

    public void setStock(int stock) {
        this.int_stock = stock;
    }
}

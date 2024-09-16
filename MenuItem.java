public class MenuItem {
    private int menuId;
    private String name;
    private double rating;
    private double price;
    public MenuItem(int menuId, String name, double rating, double price) {
        this.menuId = menuId;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }
    public MenuItem(String name, double rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }
    public int getMenuId() {
        return menuId;
    }
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "MenuItem [menuId=" + menuId + ", name=" + name + ", rating=" + rating + ", price=" + price + "]";
    }
    

    

}

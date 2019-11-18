package restaraunt;

public class MenuItem {
    private Double price;
    private String description;
    public String category;
    public Boolean newItem = false;

    public MenuItem(String category, String description, Double price) {
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public MenuItem(String category, String description, Double price, Boolean newItem) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
    }

    public MenuItem() {

    }

//    public void printMenuItem(MenuItem input) {
//        System.out.println(input.description + " $" + input.price);
//    };

    @Override
    public String toString() {
        return description + " $" + price;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

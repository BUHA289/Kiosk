package Kiosk;

public class MenuItem {
    private String name;        // 햄버거 이름
    private double price;       // 가격
    private String description; // 설명

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

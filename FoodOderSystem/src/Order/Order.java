/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Order;

/**
 *
 * @author ACER
 */
public class Order {

    private String name;
    private String address;
    private double totalBill;

    public Order(String name, String address, double totalBill) {
        this.name = name;
        this.address = address;
        this.totalBill = totalBill;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getTotalBill() {
        return totalBill;
    }
}

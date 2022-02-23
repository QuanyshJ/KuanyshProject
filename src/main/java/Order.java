/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Order {
    private String name;
    private String sname;
    private String order;
    private int phone;

        public String getName(){return name;}
    public String getSname(){return sname;}
    public String getOrder(){return order;}
    public int getPhone(){return phone;}
    public void setName(String name){this.name=name;}
    public void setSname(String sname){this.sname=sname;}
    public void setOrder(String order){this.order=order;}
    public void setPhone(int phone){this.phone=phone;}
    public Order(String name, String sname, String order, int phone){
        setName(name);
        setSname(sname);
        setOrder(order);
        setPhone(phone);
    }
}

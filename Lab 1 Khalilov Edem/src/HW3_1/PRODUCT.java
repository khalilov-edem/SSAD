package HW3_1;

public class PRODUCT {
// ИД ПРОДУКТА
public int id;
// НАЗВАНИЕ ПРОДУКТА
public String name;
// ШТРИХ-КОД
public String upc;
public String manufactor;
public double price;
// СРОК ХРАНЕНИЯ
public int bbd;
public int inventory;

public PRODUCT (int id, String name, String upc, String manufactor, double price, int bbd, int inventory){
        this.id=id;
        this.name=name;
        this.upc=upc;
        this.manufactor=manufactor;
        this.price=price;
        this.bbd=bbd;
        this.inventory=inventory;
        }

//getters
public int getId(){
        return id;
        }
public String getName(){
        return name;
        }
public String getUpc(){
        return upc;
        }
public String getManufactor(){
        return manufactor;
        }
public double getPrice(){
        return price;
        }
public int getBbd(){
        return bbd;
        }
public int getInventory(){
        return inventory;
        }

//setters
public void setId(int id){
        this.id=id;
        }
public void setName(String name){
        this.name=name;
        }
public void setUpc(String upc){
        this.upc=upc;
        }
public void setManufactor(String manufactor){
        this.manufactor=manufactor;
        }
public void setPrice(double price){
        this.price=price;
        }
public void setBbd(int bbd){
        this.bbd=bbd;
        }
public void setInventory(int inventory){
        this.inventory=inventory;
        }

public void show() {
    System.out.println("Id: " + getId());
    System.out.println("Name:  " + getName());
    System.out.println("UPC: " + getUpc());
    System.out.println("Manufactor: " + getManufactor());
    System.out.println("Price: " + getPrice());
    System.out.println("BBD: " + getBbd());
    System.out.println("Inventory: " + getInventory());
}
}

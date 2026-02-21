package Constructor;

class Plant {
    int id;
    String name;
    String type;
    double price;
    int stock;

    Plant(int id,String name,String type,double price,int stock){
        this.id=id;
        this.name=name;
        this.type=type;
        this.price=price;
        this.stock=stock;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Price: "+price);
        System.out.println("Stock: "+stock);
        System.out.println();
    }

    void sell(int qty){
        if(qty>stock){
            System.out.println("Sale cannot be processed for "+name);
        }else{
            stock-=qty;
            System.out.println(qty+" sold for "+name);
        }
    }

    void restock(int qty){
        stock+=qty;
        System.out.println(qty+" added to "+name);
    }
}

public class UrbanGarden {
    public static void main(String[] args) {

        Plant p1 = new Plant(1,"MoneyPlant","Indoor",250,20);
        Plant p2 = new Plant(2,"Rose","Outdoor",150,10);
        Plant p3 = new Plant(3,"AloeVera","Indoor",200,5);

        p1.display();
        p2.display();
        p3.display();

        p1.sell(3);
        p3.sell(8);
        p2.restock(15);

        p1.display();
        p2.display();
        p3.display();
    }
}


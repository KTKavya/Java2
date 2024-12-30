class car
{
    String name="Mahindra";
    String color="Grey";
    String fueltype="petrol";
    int price=1200000;
}
class bike
{
    String name="Dominar";
    String color="Black";
    String fueltype="petrol";
    int price=200000;
}
class mobile
{
    String name="Oneplus";
    String color="Blue";
    String process="os 12";
    String RAM="8GB";
    String Rom="128GB";
    int price=25000;
}

public class clsandobj {
    public static void main(String[] args) {
        car obc1=new car();
        bike obc2=new bike();
        mobile obc3=new mobile();{
            System.out.println(obc1.name);
            System.out.println(obc1.color);
            System.out.println(obc1.fueltype);
            System.out.println(obc1.price);
            System.out.println(obc2.name);
            System.out.println(obc2.color);
            System.out.println(obc2.fueltype);
            System.out.println(obc2.price);
            System.out.println(obc3.name);
            System.out.println(obc3.color);
            System.out.println(obc3.process);
            System.out.println(obc3.RAM);
            System.out.println(obc3.Rom);
            System.out.println(obc3.price);
        }
    }
}

class lorry{
    lorry(String color,int price,int tyresize)
    {
        System.out.println(color+" "+price+" "+tyresize);
    }
    lorry(String fueltype,float capacity)
    {
        System.out.println(fueltype+" "+capacity);
    }
    public void car(String name,String color,int price){
        System.out.println(name+" "+color+" "+price);
    }
    public void bike(String name,String color){
        System.out.println(name+" "+color);
    }
}

public class const2 {
    public static void main(String[] args) {
        lorry obj1=new lorry("blue",200000,30);
        lorry obj2=new lorry("diesel",55);
        obj1.car("mahindra","grey",120000);
        obj2.bike("RE","black");

    }
}

interface D{
    void add(int a,int b);
}

public class lambda {
    public static void main(String[] args)
    {
        D obj=(int a,int b) ->System.out.println(a+b);
        obj.add(5,2);
    }
}

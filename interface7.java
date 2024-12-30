//anonumous using interface
interface j{
    void add(int a,int b);
}

public interface interface7 {
    public static void main(String[] args) {
        j oj=new j(){
            public void add(int a,int b){
                System.out.println(a+b);
            }
        };
        oj.add(2,3);
    }

}

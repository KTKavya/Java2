interface a2 {
    public void add();
    public void sub();
}

class b2 implements a2 {
    public void add() {
        System.out.println("add");
    }

    public void sub() {
        System.out.println("sub");
    }
}

class c2 implements a2 {
    public void add() {
        System.out.println("add");
    }

    public void sub() {
        System.out.println("sub");
    }
}

public class hierarchinterface {
    public static void main(String[] args) {
        c2 obj = new c2();
        b2 obj1 = new b2();

        obj.sub();
        obj1.add();
    }
}

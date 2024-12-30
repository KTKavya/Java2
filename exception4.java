class k {
    int a;
    public void add() {
        System.out.println("addition");
    }

    class t { // Inner class
        public void sub() {
            System.out.println("subtraction");
        }
    }
}

public class exception4 {
    public static void main(String[] args) {
        k pj = new k();
        k.t oj = pj.new t(); // Correct way to create an inner class object
        pj.add();
        oj.sub();
    }
}


class P1 {
    public void person(String name, int age) {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    class P2 { // Make P2 an inner class
        public void emp(int id, String name, int salary) {
            System.out.println("id: " + id);
            System.out.println("name: " + name);
            System.out.println("Salary: " + salary);
        }

        public void dep(int id, String name) {
            System.out.println("id: " + id);
            System.out.println("name: " + name);
        }

        public void HR(String name, String location) {
            System.out.println("name: " + name);
            System.out.println("location: " + location);
        }
    }
}

public class exception5 {
    public static void main(String[] args) {
        P1 obj = new P1();
        P1.P2 obj1 = obj.new P2(); // Correct instantiation of inner class

        obj.person("kkk", 22);
        obj1.dep(11, "jjj"); // Corrected argument order
    }
}

package mygit;

public class C {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println("master updated C");
        A a = new A();
        B b = new B();
        System.out.println(a.who());
        System.out.println(b.add(1, 2));
        System.out.println("Alice says hi");

    }
}

public class TestComposition {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getValue());
        a.inc();
        System.out.println(a.getValue());

        B b = new B();
        System.out.println(b.getValue());
        b.inc();
        System.out.println(b.getValue());

        System.out.println(b.isEven());

    }
}

class A{

    private int cpt = 0;

    public int getValue() {
        return cpt;
    }

    public void inc() {
        cpt++;
    }
}

class B {

    private A mySuper = new A();

    public boolean isEven() {
        return getValue() %2 == 0;
    }

    public int getValue() {
        return mySuper.getValue();
    }

    public void inc() {
        mySuper.inc();
    }
    
}
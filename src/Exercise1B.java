class Super {

    int x;

    public Super(){}
    Super(int x) {
        this.x = x;
    }

    void print() {
        System.out.println(this.x);
    }
}

class Sub extends Super {

    Sub(int x) {

        super.x = x;
    }
}

public class Exercise1B {

    public static void main(String[] args) {
        Sub s = new Sub(10);
        s.print();
    }
}

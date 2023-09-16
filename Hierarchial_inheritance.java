class a {
    public void printa() {
        System.out.println("print a");
    }
}

class b extends a {
    public void printb() {
        System.out.println("print b");
    }
}

class c extends a {
    public void printc() {
        System.out.println("print c");
    }
}

public class Hierarchial_inheritance {
    public static void main(String[] args) {
        b obj_B = new b();
        obj_B.printa();
        obj_B.printb();

        c obj_C = new c();
        obj_C.printc();

    }
}
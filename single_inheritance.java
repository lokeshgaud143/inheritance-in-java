

class one{
    int a = 23;
    int b = 30;
    


    public void name() {
        System.out.println("the sum is : "+ (a + b));
    }
}

class two extends one{
    public void age(){
        System.out.println("the sub is : "+ (b - a));
    }
}


class single_inheritance{
    public static void main(String[] args) {
        two t = new two();
        t.name();
        t.age();
    
    }
}

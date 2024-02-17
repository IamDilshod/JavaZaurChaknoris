package anonymous_inner_class;

public class Main {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return 0;
            }
        };

        Ff ff = new Ff(){

        };
    }
}

interface Math{
    int doOperation(int a, int b);
}

class Ff{

}
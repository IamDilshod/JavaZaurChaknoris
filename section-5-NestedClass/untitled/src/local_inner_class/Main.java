package local_inner_class;

public class Main {
    public static void main(String[] args) {

    }
}

class Math{
    public void getReult(){
        int a=9;
        class Delenie{
            private int delimoe;

            public int getDelimoe() {
//                a=90;
                System.out.println(a);
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }
        }
    }
}

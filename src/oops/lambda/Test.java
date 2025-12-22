package oops.lambda;

public class Test {
    public static void main(String[] args) {
        MyLambda ld = (x,y) -> {
                System.out.println(x+y);

            };

        ld.add(4,5);

    }

}

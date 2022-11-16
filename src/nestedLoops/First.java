package nestedLoops;
public class First {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;
        for (i = 10; i < 20; i++) {
            isprime = true;

            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0)
                    isprime = false;
            if (isprime)
                System.out.println(i + "-простое число");
        }
    }
}


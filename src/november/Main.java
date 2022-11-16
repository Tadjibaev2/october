package november;

public class Main {
    public static void main(String[] args) {
        Dogs bobik = new Dogs("Bobik","Овчарка","black", 2.5,30.1,41.5);
        System.out.println(bobik.getBreed());
        bobik.setBreed("Алабай");
        System.out.println(bobik.getBreed());
    }
}

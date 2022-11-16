package november.two;

public class Main {
    public static void main(String[] args) {

        Krug krug = new Krug(16, "Blue", "Not");
        System.out.println(krug.getRad() + " Радиус");
        System.out.println(krug.getRad() * krug.p + " Периметр");
        System.out.println(krug.getRad() * krug.p * krug.p + " Площадь");
        krug.setRad(25);
        System.out.println(krug.getRad() + " Радиус После ");
        System.out.println(krug.getRad() * krug.p + " Периметр после ");
        System.out.println(krug.getRad() * krug.p * krug.p + " Площадь После ");


    }

}


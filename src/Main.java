import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Volkswagen volkswagen = Volkswagen.TIGUAN;
        System.out.println(volkswagen);
        System.out.println(volkswagen.name());
        System.out.println(volkswagen.getColors());
        System.out.println(volkswagen.getProdYear());
        volkswagen.setColors("sraczkowaty");
        System.out.println(volkswagen.getColors());
        System.out.println(volkswagen.ordinal());

        switch (volkswagen) {
            case GOLF:
            case UP:
                System.out.println("Golf albo Up");
                break;
            case ARTEON:
            case PASSAT:
                System.out.println("średniaki");
                break;
            case TIGUAN:
            case TOURAN:
                System.out.println("duże");
        }

        Volkswagen[] values = Volkswagen.values();
        System.out.println(Arrays.toString(values));
        for (Volkswagen value : values) {
            System.out.println(value);
        }

        Volkswagen.GOLF.doSomething();

        Volkswagen V1 = null;

        System.out.println(V1 == Volkswagen.TIGUAN);
  //      System.out.println(V1.equals(Volkswagen.TIGUAN)); lepiej pierwsze bo drugie moze miec expetion

        System.out.println(Volkswagen.ofColor("white"));
        System.out.println(Arrays.asList(Volkswagen.values()));

        System.out.println(Volkswagen.UP.getIfMissing()); //METODA NA pzypisanie innego enuma jak braknie oryginalu
        System.out.println(Volkswagen.ofColor("pink"));



    }
}

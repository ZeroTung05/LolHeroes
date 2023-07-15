import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ezreal ezreal = new Ezreal("ZeroTung",500,25);
        Kaisa kaisa = new Kaisa("BadHard", 600,20);
        ezreal.attack(kaisa);
        kaisa.attack(ezreal);
        System.out.println(kaisa.getHp());
        System.out.println(ezreal.getHp());
    }

}

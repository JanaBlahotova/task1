import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                + "zkratkou <Ctrl>+</> - použij lomítko "
                + "na numerické klávesnici.");
//        ukol1();
        {
            System.out.println("Hello world!");
        }
//        ukol2();
        {
            String uzivatel = "Karel";
            System.out.println(uzivatel);
        }
//        ukol3();
        {
            String pocetLekci = "10";
            System.out.println(pocetLekci);
        }
//        ukol4();
        {
            double cena = 10.0;
            System.out.println(cena);
        }
//        ukol5();
        {
            BigDecimal cena = BigDecimal.ZERO;

            for (int i = 0; i < 10; i++) {
                cena = cena.add(BigDecimal.valueOf(0.1));
            }
            {   System.out.println(cena);

        }}
//        ukol6();
        {
            BigDecimal cena = BigDecimal.ZERO;
            cena = cena.add(BigDecimal.valueOf(0.1));
            System.out.println(cena);
        }
//        ukol7();
        {
            int vykonMotoru = 120;
            System.out.println("Výkon Motoru je:" +vykonMotoru+ " kW.");
        }
//        ukol8();
        {
            int velikostKosile = 37;
            System.out.println("Velikost košile je:" +velikostKosile+ ".");
        }
//        ukol9();
        {
        System.out.println("Metoda *skoro* bez chybičky!");
    }
    }
}
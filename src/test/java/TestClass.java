import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestClass {

    @Test
    void testAddition(){
        Komplex z1 = new Komplex(1,2);
        z1.addiere(new Komplex(1,2) );
        z1.print();

    }
    @Test
    void testAufgaben(){
        Komplex z = new Komplex(0,0); // z := 0
        System.out.println("z = " + z);
        z = new Komplex(1,0); // z := 1
        System.out.println("z = " + z);
        z = new Komplex(0,1); // z := i
        System.out.println("z = " + z);
        z = new Komplex(-4,0); // z := -4
        System.out.println("z = " + z);
        Komplex[] wurzeln = z.getWurzel(); // => 2i und -2i
        System.out.println("sqrt(z) = " + Arrays.toString(wurzeln));
        z = new Komplex(1,1); // z := 1+i
        System.out.println("z = " + z);
        double betrag = z.getBetrag();
        System.out.println("|z| = " + betrag); // => sqrt(2) = 1.41...
        Komplex z2 = new Komplex(2,1); // z2 := 2+i
        System.out.println("z2 = " + z2);
        z.addiere(z2); // z := z+z2 = 3.0 + 2.0i
        System.out.println("z nach Addition von z2 = " + z);
        z.multipliziere(z2); // z := z*z2 = 4.0 + 7.0i
        System.out.println("z nach Multiplikation von z2 = " + z);
        z2 = z.getProdukt(new Komplex(-1,0)); // z2 := -z = -4.0 - 7.0i
        System.out.println("z2 = " + z2);
        Komplex summe = z.getSumme(z2); // summe := z + z2 = 0
        System.out.println("summe = " + summe);

        /*
        z = 0.0
z = 1.0
z = 0.0 + i
z = -4.0
sqrt(z) = [1.2246467991473532E-16 + 2.0i, -1.2246467991473532E-16 - 2.0i]
z = 1.0 + i
|z| = 1.4142135623730951
z2 = 2.0 + i
z nach Addition von z2 = 3.0 + 2.0i
z nach Multiplikation von z2 = 4.0 + 7.0i
z2 = -4.0 - 7.0i
summe = 0.0

         */
    }

}

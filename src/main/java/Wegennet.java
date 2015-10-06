import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by J on 5-10-2015.
 */
public class Wegennet implements StatischeGegevens {
    private static Wegennet wn = null;
    private ArrayList<VerbindingsStuk> wegen;
    private ArrayList<Locatie> plaatsen;

    private Wegennet() {
        init();
    }

    public static Wegennet getInstance() {
        if (wn == null) {
            return wn = new Wegennet();
        } else {
            return wn;
        }
    }

    public VerbindingsStuk getInstanceOfVerbindingsStuk(String verbindingsStuk) {
        for (VerbindingsStuk x : wegen) {
            if (x.getNaam() == verbindingsStuk) {
                return x;
            }
        }
        return null;
    }

    public Locatie getInstanceOfLocatie(String locatie) {
        for (Locatie x : plaatsen) {
            if (x.getNaam() == locatie) {
                return x;
            }
        }
        return null;
    }


    public void init() {
        wegen = new ArrayList<VerbindingsStuk>(20);
        plaatsen = new ArrayList<Locatie>(10);
        Locatie Arnhem = new Plaats(51.9833333, 5.9166667, "Arnhem");
        plaatsen.add(Arnhem);
        Locatie Nijmegen = new Plaats(51.8428670, 5.8546220, "Nijmegen");
        plaatsen.add(Nijmegen);
        Locatie alfa = new Knooppunt(51.8428670, 5.854622, "alfa");
        plaatsen.add(alfa);
        Locatie bravo = new Knooppunt(51.8428670, 5.854622, "bravo");
        plaatsen.add(bravo);
        Locatie charlie = new Knooppunt(51.8428670, 5.854622, "charlie");
        plaatsen.add(charlie);
        Locatie delta = new Knooppunt(51.8428670, 5.854622, "delta");
        plaatsen.add(delta);
        Locatie echo = new Knooppunt(51.8428670, 5.854622, "echo");
        plaatsen.add(echo);
        Locatie foxtrot = new Knooppunt(51.8428670, 5.854622, "foxtrot");
        plaatsen.add(foxtrot);

        VerbindingsStuk eins = new VerbindingsStuk(Arnhem, alfa, 2, 60, "eins");
        wegen.add(eins);
        VerbindingsStuk zwei = new VerbindingsStuk(alfa, bravo, 5, 100, "zwei");
        wegen.add(zwei);
        VerbindingsStuk drei = new VerbindingsStuk(bravo, charlie, 3, 100, "drei");
        wegen.add(drei);
        VerbindingsStuk vier = new VerbindingsStuk(charlie, Nijmegen, 4, 50, "vier");
        wegen.add(vier);
        VerbindingsStuk funf = new VerbindingsStuk(alfa, delta, 4, 100, "funf");
        wegen.add(funf);
        VerbindingsStuk sechs = new VerbindingsStuk(delta, echo, 3, 100, "sechs");
        wegen.add(sechs);
        VerbindingsStuk sieben = new VerbindingsStuk(echo, Nijmegen, 6, 50, "sieben");
        wegen.add(sieben);
        VerbindingsStuk acht = new VerbindingsStuk(Arnhem, foxtrot, 12, 120, "acht");
        wegen.add(acht);
        VerbindingsStuk neun = new VerbindingsStuk(foxtrot, Nijmegen, 10, 99, "neun");
        wegen.add(neun);


        VerbindingsStuk nine = new VerbindingsStuk(Nijmegen, foxtrot, 10, 99, "nine");
        wegen.add(nine);
        VerbindingsStuk eight = new VerbindingsStuk(foxtrot, Arnhem, 12, 120, "eight");
        wegen.add(eight);
        VerbindingsStuk seven = new VerbindingsStuk(Nijmegen, echo, 6, 50, "seven");
        wegen.add(seven);
        VerbindingsStuk six = new VerbindingsStuk(echo, delta, 3, 100, "six");
        wegen.add(six);
        VerbindingsStuk five = new VerbindingsStuk(delta, alfa, 4, 100, "five");
        wegen.add(five);
        VerbindingsStuk four = new VerbindingsStuk(Nijmegen, charlie, 4, 50, "four");
        wegen.add(four);
        VerbindingsStuk three = new VerbindingsStuk(charlie, bravo, 3, 100, "three");
        wegen.add(three);
        VerbindingsStuk two = new VerbindingsStuk(bravo, alfa, 5, 100, "two");
        wegen.add(two);
        VerbindingsStuk one = new VerbindingsStuk(alfa, Arnhem, 2, 60, "one");
        wegen.add(one);

        Belemmering belemmering = new Wegwerkzaamheden();
        belemmering.vertraging = 10;
        eins.addVerkeersinfo(belemmering);
        belemmering = new File();
        belemmering.vertraging = 13;
        sechs.addVerkeersinfo(belemmering);
        SnelheidsControle controle = new Flitspaal();
        five.addVerkeersinfo(controle);
        funf.addVerkeersinfo(controle);
        controle = new Radarcontrole();
        one.addVerkeersinfo(controle);


        long vanaf = 1445127000000L;
        long tot = 1445227000000L;
        Ontoegankelijk geenToegang = new Ontoegankelijk(new Date(vanaf), new Date(tot));
        neun.addVerkeersinfo(geenToegang);
        geenToegang = new Ontoegankelijk(new Date(vanaf), new Date(tot));
        nine.addVerkeersinfo(geenToegang);
    }


}

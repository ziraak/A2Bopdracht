import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class Wegennet implements StatischeGegevens {
    private ArrayList<VerbindingsStuk> wegen;
    private ArrayList<Locatie> plaatsen;

    public Wegennet() {
        init();
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
        Locatie Arnhem = new Locatie(51.9833333, 5.9166667, "Arnhem");
        plaatsen.add(Arnhem);
        Locatie Nijmegen = new Locatie(51.8428670, 5.8546220, "Nijmegen");
        plaatsen.add(Nijmegen);
        Locatie alfa = new Locatie(51.8428670, 5.854622, "alfa");
        plaatsen.add(alfa);
        Locatie bravo = new Locatie(51.8428670, 5.854622, "bravo");
        plaatsen.add(bravo);
        Locatie charlie = new Locatie(51.8428670, 5.854622, "charlie");
        plaatsen.add(charlie);
        Locatie delta = new Locatie(51.8428670, 5.854622, "delta");
        plaatsen.add(delta);
        Locatie echo = new Locatie(51.8428670, 5.854622, "echo");
        plaatsen.add(echo);
        Locatie foxtrot = new Locatie(51.8428670, 5.854622, "foxtrot");
        plaatsen.add(foxtrot);

        VerbindingsStuk eins = new VerbindingsStuk(Arnhem, alfa, 2, "eins");
        wegen.add(eins);
        VerbindingsStuk zwei = new VerbindingsStuk(alfa, bravo, 5, "zwei");
        wegen.add(zwei);
        VerbindingsStuk drei = new VerbindingsStuk(bravo, charlie, 3, "drei");
        wegen.add(drei);
        VerbindingsStuk vier = new VerbindingsStuk(charlie, Nijmegen, 4, "vier");
        wegen.add(vier);
        VerbindingsStuk funf = new VerbindingsStuk(alfa, delta, 4, "funf");
        wegen.add(funf);
        VerbindingsStuk sechs = new VerbindingsStuk(delta, echo, 3, "sechs");
        wegen.add(sechs);
        VerbindingsStuk sieben = new VerbindingsStuk(echo, Nijmegen, 6, "sieben");
        wegen.add(sieben);
        VerbindingsStuk acht = new VerbindingsStuk(Arnhem, foxtrot, 12, "acht");
        wegen.add(acht);
        VerbindingsStuk neun = new VerbindingsStuk(foxtrot, Nijmegen, 10, "neun");
        wegen.add(neun);


        //TODO DONE omdraaien wegen
        VerbindingsStuk nine = new VerbindingsStuk(Nijmegen, foxtrot, 10, "nine");
        wegen.add(nine);
        VerbindingsStuk eight = new VerbindingsStuk(foxtrot, Arnhem, 12, "eight");
        wegen.add(eight);
        VerbindingsStuk seven = new VerbindingsStuk(Nijmegen, echo, 6, "seven");
        wegen.add(seven);
        VerbindingsStuk six = new VerbindingsStuk(echo, delta, 3, "six");
        wegen.add(six);
        VerbindingsStuk five = new VerbindingsStuk(delta, alfa, 4, "five");
        wegen.add(five);
        VerbindingsStuk four = new VerbindingsStuk(Nijmegen, charlie, 4, "four");
        wegen.add(four);
        VerbindingsStuk three = new VerbindingsStuk(charlie, bravo, 3, "three");
        wegen.add(three);
        VerbindingsStuk two = new VerbindingsStuk(bravo, alfa, 5, "two");
        wegen.add(two);
        VerbindingsStuk one = new VerbindingsStuk(alfa, Arnhem, 2, "one");
        wegen.add(one);

        Belemmering belemmering = new Wegwerkzaamheden();
        belemmering.vertraging = 10;
        eins.addVerkeersinfo(belemmering);
        belemmering = new File();
        belemmering.vertraging = 13;
        sechs.addVerkeersinfo(belemmering);
        SnelheidsControle controle = new Flitspaal(five);
        controle.maxSpeed = 80;
        five.addVerkeersinfo(controle);
        controle = new Radarcontrole(one);
        controle.maxSpeed = 120;
        one.addVerkeersinfo(controle);

    }


}

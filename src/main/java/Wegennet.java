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
        wegen = new ArrayList<VerbindingsStuk>(10);
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
        Belemmering belemmering = new Wegwerkzaamheden();
        belemmering.vertraging = 10;
        eins.addVerkeersinfo(belemmering);
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

        belemmering = new File();
        belemmering.vertraging = 13;
        sechs.addVerkeersinfo(belemmering);
        wegen.add(sechs);
        VerbindingsStuk sieben = new VerbindingsStuk(echo, Nijmegen, 6, "sieben");
        wegen.add(sieben);
        VerbindingsStuk acht = new VerbindingsStuk(Arnhem, foxtrot, 12, "acht");
        wegen.add(acht);
        VerbindingsStuk neun = new VerbindingsStuk(foxtrot, Nijmegen, 10, "neun");
        wegen.add(neun);

    }


}

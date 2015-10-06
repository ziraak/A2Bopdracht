import java.util.Date;

/**
 * Created by J on 5-10-2015.
 */
public class Ontoegankelijk extends VerkeersInfo implements DynamischeGegevens {

    private Date vanaf, tot;

    public Ontoegankelijk(Date vanaf, Date tot) {
        this.vanaf = vanaf;
        this.tot = tot;
    }

    public void printSluitTijden() {
        System.out.println(this.verbinding.getNaam() + " is niet toegankelijk vanaf " + vanaf.toString() + " tot " + tot.toString());
    }
}

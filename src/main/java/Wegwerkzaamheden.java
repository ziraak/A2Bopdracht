/**
 * Created by J on 5-10-2015.
 */
public class Wegwerkzaamheden extends Belemmering {

    @Override
    public int getVertraging() {
        System.out.println("wegwerkzaamheden met " + vertraging + " minuten vertraging");

        return super.getVertraging();
    }
}

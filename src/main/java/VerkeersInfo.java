import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public abstract class VerkeersInfo {

    protected VerbindingsStuk verbinding;
    protected String start, eind;

    public void addTo(VerbindingsStuk verbinding) {
        this.verbinding = verbinding;
    }
}

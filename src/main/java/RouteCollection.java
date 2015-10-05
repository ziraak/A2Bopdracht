import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class RouteCollection {

    private ArrayList<Route> routes;
    private Wegennet wegennet;

    public RouteCollection(Wegennet wegennet) {
        wegennet = wegennet;
        init();
    }


    private void init() {
        Route one = new Route("Arnhem", "Nijmegen",
                new VerbindingsStuk[]{wegennet.getInstanceOfVerbindingsStuk("eins"),
                        wegennet.getInstanceOfVerbindingsStuk("zwei"),
                        wegennet.getInstanceOfVerbindingsStuk("drei"),
                        wegennet.getInstanceOfVerbindingsStuk("vier")});
        Route two = new Route("Arnhem", "Nijmegen",
                new VerbindingsStuk[]{wegennet.getInstanceOfVerbindingsStuk("eins"),
                        wegennet.getInstanceOfVerbindingsStuk("funf"),
                        wegennet.getInstanceOfVerbindingsStuk("sechs"),
                        wegennet.getInstanceOfVerbindingsStuk("sieben")});
        Route three = new Route("Arnhem", "Nijmegen",
                new VerbindingsStuk[]{wegennet.getInstanceOfVerbindingsStuk("acht"),
                        wegennet.getInstanceOfVerbindingsStuk("neun")});
        routes.add(one);
        routes.add(two);
        routes.add(three);
    }

    public ArrayList<Route> getRoutes(String beginpunt, String eindpunt) {
        ArrayList<Route> newList = new ArrayList<Route>(4);
        for (Route r : routes) {
            if (r.beginpunt == beginpunt && r.eindpunt == eindpunt) {
                newList.add(r);
            }
        }
        return newList;
    }

}

import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class RouteCollection {

    private ArrayList<Route> routes;
    private Wegennet wegennet;

    public RouteCollection(Wegennet wegennet) {
        routes = new ArrayList<Route>(5);
        init(wegennet);
    }


    private void init(Wegennet wn) {
        ArrayList<VerbindingsStuk> lijst = new ArrayList<VerbindingsStuk>(5);
        lijst.add(wn.getInstanceOfVerbindingsStuk("eins"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("zwei"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("drei"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("vier"));
        Route one = new Route("Arnhem", "Nijmegen", lijst);


        lijst = new ArrayList<VerbindingsStuk>(5);
        lijst.add(wn.getInstanceOfVerbindingsStuk("eins"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("funf"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("sechs"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("sieben"));
        Route two = new Route("Arnhem", "Nijmegen", lijst);


        lijst = new ArrayList<VerbindingsStuk>(3);
        lijst.add(wn.getInstanceOfVerbindingsStuk("neun"));
        lijst.add(wn.getInstanceOfVerbindingsStuk("acht"));
        Route three = new Route("Arnhem", "Nijmegen", lijst);


        routes.add(one);
        routes.add(two);
        routes.add(three);
    }

    public ArrayList<Route> getRoutes(String beginpunt, String eindpunt) {
//        ArrayList<Route> newList = new ArrayList<Route>(4);
//        for (Route r : routes) {
//            if (r.beginpunt == beginpunt && r.eindpunt == eindpunt) {
//                newList.add(r);
//            }
//        }
//        return newList;
        return routes;
    }

}

import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class RouteCollection {

    private ArrayList<Route> routes;
    private Wegennet wegennet;

    public RouteCollection() {
        routes = new ArrayList<Route>(5);
        init();
    }


    private void init() {
        Wegennet wn = Wegennet.getInstance();
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

        ArrayList<VerbindingsStuk> lijstBack = new ArrayList<VerbindingsStuk>(5);
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("one"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("two"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("three"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("four"));
        Route oneReverse = new Route("Nijmegen", "Arnhem", lijstBack);

        lijstBack = new ArrayList<VerbindingsStuk>(5);
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("one"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("five"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("six"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("seven"));
        Route twoReverse = new Route("Nijmegen", "Arnhem", lijstBack);

        lijstBack = new ArrayList<VerbindingsStuk>(3);
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("nine"));
        lijstBack.add(wn.getInstanceOfVerbindingsStuk("eight"));
        Route threeReverse = new Route("Nijmegen", "Arnhem", lijstBack);


        routes.add(one);
        routes.add(two);
        routes.add(three);
        routes.add(oneReverse);
        routes.add(twoReverse);
        routes.add(threeReverse);
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

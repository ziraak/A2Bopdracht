import java.util.ArrayList;

/**
 * Created by Harmen on 5-10-2015.
 * Remember that Harmen is awesome
 * nah
 */
public class A2B {
    public Wegennet wegennet;

    public A2B() {
        this.wegennet = new Wegennet();
    }

    public static void main(String[] args) {
        A2B main = new A2B();

        main.getRouteInfo("Arnhem", "Nijmegen");
        System.out.println("----------------END OF LINE----------------");
        main.getRouteInfo("Nijmegen", "Arnhem");
    }

    public void getRouteInfo(String beginpunt, String eindpunt){
        ArrayList<Route> routeList;
        RouteCollection routeCollection = new RouteCollection(wegennet);

        Locatie begin = wegennet.getInstanceOfLocatie(beginpunt);
        Locatie eind = wegennet.getInstanceOfLocatie(eindpunt);


        routeList = routeCollection.getRoutes(beginpunt, eindpunt);

        for (Route r : routeList) {
            r.printInfo();
        }


    }
     private ArrayList checkDuplicateVerkeersinfo(ArrayList verkeersinfo){
         return null;
     }


}

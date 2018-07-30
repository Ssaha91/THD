package intermidiateJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PureCollectionExample {
    public static void main(String[] args) {

        //Hashset prints randomly
        Set<String> cities = new HashSet<String>();
        cities.add("NY");
        cities.add("GA");
        cities.add("CA");
        cities.add("VA");



        //TreSet print alphabetically
        Set<String> city1 = new TreeSet<String>();
        city1.add("NY");
        city1.add("PA");
        city1.add("MI");
        city1.add("VA");


        Set<String> intersectionSet = new HashSet<>(cities);
        intersectionSet.retainAll(city1);
        System.out.println("IntersectionSet : " +intersectionSet);


    }
}

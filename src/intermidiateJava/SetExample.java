package intermidiateJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        //LinkedListSet print orderly

        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.add("Gadhi");
        students.add("Arjun");
        students.add("Ishan");
        for (String printStudents: students) {
            System.out.println("Students :" + printStudents);

        }

        //Hashset prints randomly
        Set<String> cities = new HashSet<String>();
        cities.add("NY");
        cities.add("GA");
        cities.add("CA");
        cities.add("VA");

        for (String cityName:cities
             ) {
            System.out.println(cityName);

        }

        System.out.println("TreSet Printing ****************************");

        //TreSet print alphabetically
        Set<String> city1 = new TreeSet<String>();
        city1.add("NY");
        city1.add("PA");
        city1.add("MI");
        city1.add("VA");

        for (String cityName:city1
                ) {
            System.out.println(cityName);

        }

        System.out.println("LinkedHashSet Printing ****************************");
        //LinkedHasSet Print line by line the way you put Data
        Set<String> city2 = new LinkedHashSet<>();
        city2.add("NY");
        city2.add("PA");
        city2.add("MI");
        city2.add("VA");

        for (String cityName:city2
                ) {
            System.out.println(cityName);

        }

    }
}

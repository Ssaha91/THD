import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] sscStudents = {"Sompa", "Mou", "Gdahi"};

        List<String> list1 = new ArrayList<String>();

        for (String x :sscStudents
                )
            list1.add(x);

        String[] hscStudents = { "Mou"};

        List<String> list2 = new ArrayList<String>();

        for (String y:hscStudents
             )

        list2.add(y);

        for (int i=0; i<list1.size(); i++){
            System.out.printf(" %s ", list1.get(i));
        }
        edidtList(list1, list2);
        System.out.println();

        for (int i=0; i<list1.size(); i++){
            System.out.printf(" %s", list1.get(i));
        }


    }

    private static void edidtList(Collection<String> l1, Collection<String>l2){
        Iterator<String> it = l1.iterator();
        while (it.hasNext()){
            if (l2.contains(it.next())){
                it.remove();
            }
        }
    }
}

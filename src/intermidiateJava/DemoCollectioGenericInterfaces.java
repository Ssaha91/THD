package intermidiateJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class DemoCollectioGenericInterfaces {
    public static void main(String[] args) {
        //Array: data is fixed & u can't increase of the size of data
        int age[]  = new int[5];
        age[0]= 21;
        age[1]= 21;
        age[2]= 21;
        age[3]= 21;
        age[4]= 21;
        //same also here
        Object name[]  = new Object[5];

        //collection is not fixed size of data
        //u can increase the data size
        //adding  data is difficult if in the middle of the position
        Collection values = new ArrayList();
        values.add(6);
        values.add("Gadhi");
        values.add(true);


        //Generic: Type of data is mention in <> is called generic
        Collection<Integer> id = new ArrayList<Integer>();
        id.add(7);
        id.add(8);



       for (int i = 0; i<values.size(); i++){
           System.out.println(((ArrayList) values).get(i));
       }
       //enhanch for loop to print
        for (Object i : values){
            System.out.println(i);
        }

    }
}

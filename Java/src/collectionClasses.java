// array list dynamically resizes

import  java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class collectionClasses {
    public static void main(String[] args){

        ArrayList arraylist = new ArrayList();

        // only string arraylist
        ArrayList<String> names = new ArrayList<String>();
        names.add("usman");
        names.add("ali");

        names.add(1, "ahmed");

        for(int i=0 ; i<names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        Iterator i = names.iterator();

        while (i.hasNext())
        {
            System.out.println(i);
            System.out.println(i.next());

        }

        String a1 = "abcd";
        String a2 = "efgh";

        System.out.println(a2.compareTo(a1));

        // string builders - doesn't recreate string again again good if too operations with a string
        StringBuilder s = new StringBuilder("ll l jjj ");
    }
}

package iterator;

import java.util.Iterator;

/**
 * Created by User on 03.10.2017.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("====Array Element Using");
        ArrayElement arrayElement = new ArrayElement();
        System.out.println("==== Part1");

        // test add
        MyList con = new MyListImpl();
        con.add("A");
        con.add("B");
        con.add(1);
        con.add(7);
        System.out.println(con); // [A, B, 1, 7]

        // test clear
        con.clear();
        System.out.println(con); // []
        con.add("A");
        con.add("B");
        con.add(7);
        System.out.println(con); // [A, B, 7]

        // test remove
        con.remove("B");
        con.remove("C");
        System.out.println(con); // [A, 7]

        // test size
        System.out.println(con.size()); // 2

        // test contains
        System.out.println(con.contains("B")); // false
        System.out.println(con.contains(7)); // true

        // test toArray
        for (Object el : con.toArray()) {
            System.out.print(el + " "); // A 7
        }
        System.out.println();

        // test containsAll
        MyList anotherList = new MyListImpl();
        anotherList.add("A");
        anotherList.add(9);
        System.out.println(con.containsAll(anotherList)); // false
        con.add(9);
        System.out.println(con.containsAll(anotherList)); // true

        System.out.println("==== Part2");

        MyList con2 = new MyListImpl();
        con2.add("A");
        con2.add(7);
        con2.add(9);
        for (Object el : con) {
            System.out.print(el + " "); // A 7 9
        }
        System.out.println();

        Iterator<Object> it = con.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // A 7 9
        }
        System.out.println();

        it = con.iterator();
        it.next();
        it.next();
        it.remove();
        System.out.println(con); // [A, 9]
        System.out.println(it.hasNext()); // true
        System.out.println(it.next()); // 9
        System.out.println(it.hasNext()); // false
    }
}

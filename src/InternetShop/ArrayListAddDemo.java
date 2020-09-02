package InternetShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAddDemo {
    public static void main( String[] args ) {
//        List<String> arrayList = new ArrayList<>();
//
//        System.out.println("Начальный размер arrayList: "
//                + arrayList.size());
//
//        arrayList.add("C");
//        arrayList.add("A");
//        arrayList.add("E");
//        arrayList.add("B");
//        arrayList.add("D");
//        arrayList.add("F");
//        arrayList.add("F");
//        arrayList.add(1, "A2");
//        arrayList.set(0, "C2");
//
//        System.out.println("Размер arrayList после добавления: "
//                + arrayList.size());
//        System.out.println("Содержимое arrayList: " + arrayList);
//        System.out.println(arrayList.get(0));
//    }
//}

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        String toMoveUp = "3";
        while (list.indexOf(toMoveUp) != 0) {
            int i = list.indexOf(toMoveUp);
            Collections.swap(list, i, i - 1);
        }

        System.out.println(list);
    }
}
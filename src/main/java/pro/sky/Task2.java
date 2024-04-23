package pro.sky;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static List<String> task() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("abcdefgh");
        stringList.add("baaa");
        stringList.add("yefgh");
        stringList.add("tdef");
        stringList.add("aaabcdef");
        stringList.add("rcdef");
//        List<String> newStringList = new ArrayList<String>();
//        for (String s:stringList) {
//            newStringList.add(s.substring(1));
//        }
//        return newStringList.stream().sorted().toList();

        return deleteFirstSymbolsAndSorted(stringList);
    }

    static List<String> deleteFirstSymbolsAndSorted(List<String> names) {
        return names.stream().map((s) -> s.substring(1)).sorted().toList();
    }
}

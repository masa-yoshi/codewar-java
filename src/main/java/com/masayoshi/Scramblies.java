package com.masayoshi;

import java.util.List;
import java.util.stream.Collectors;

/* Best practice, but it is O(n^2).
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str1 = str1.replaceFirst(s,"");
        }

        return true;
    }
}
*/

/* O(n) solution.
import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str1.length() < str2.length()) return false;
        Map<Character, Integer> requirements = new HashMap<>();
        for (char reqChar : str2.toCharArray()) {
            Integer count = requirements.get(reqChar);
            if (count == null) count = 0;
            requirements.put(reqChar, count + 1);
        }

        for (char foundChar : str1.toCharArray()) {
            Integer count = requirements.remove(foundChar);
            if (count == null) continue;
            if (count > 1) requirements.put(foundChar, count - 1);
        }
        return requirements.isEmpty();
    }
}
*/

//my solution. It is O(n^2). for + .contains(). not necessary to use List.
public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        // your code
        List<Character> str1List = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        List<Character> str2List = str2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        if (str1List.size() < str2List.size()) {
            return false;
        }

        boolean b = false;

        for (int i = 0; i < str2List.size(); i++) {

            if (str1List.contains(str2List.get(i))) {
                str1List.remove(str1List.indexOf(str2List.get(i)));
                b = true;
            } else {
                b = false;
                break;
            }
        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println(scramble("tes", "test"));
        System.out.println(scramble("test", "tes"));
        System.out.println(scramble("test", "test"));

//        String test = "test";
//        List<Character> testList = test.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.toList());
//        testList.indexOf('t');
//        System.out.println(testList.indexOf('t'));
//        System.out.println(testList.indexOf('e'));
//        System.out.println(testList.contains('t'));
    }
}

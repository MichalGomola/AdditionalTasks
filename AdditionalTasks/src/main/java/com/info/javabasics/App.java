package com.info.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me some string to count letters in it: ");
        String strToCount = scan.nextLine();
        strToCount = strToCount.toLowerCase().replaceAll(" ","");

        List<String> lettersToCount = new ArrayList<>();
        Collections.addAll(lettersToCount, strToCount.split(""));

        Set<String> keySet = new HashSet<>(lettersToCount);
        printSortedMap(keySet, lettersToCount);

        scan.close();
    }

    public static void printSortedMap(Set<String> letterSet, List<String> lettersToCount) {

        Map<String, Long> mapToSort = new HashMap<>();
        long keyValue;

        for (String s : letterSet) {
            keyValue = lettersToCount.stream()
                    .filter(ch -> ch.equals(s))
                    .count();
            mapToSort.put(s, keyValue);
        }
        List<Entry<String, Long>> sortedList = new ArrayList<>(mapToSort.entrySet());
        sortedList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        sortedList.forEach(System.out::println);
    }


}

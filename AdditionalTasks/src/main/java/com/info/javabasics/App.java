package com.info.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me some string to count letters in it: ");
        String startingString = scan.nextLine();
        startingString = startingString.replaceAll(" ","");

        List<String> lettersToCount = new ArrayList<>();
        Collections.addAll(lettersToCount, startingString.toLowerCase().split(""));
        Set<String> keySet = new HashSet<>(lettersToCount);
        System.out.println(keySet);

        Map<String, Long> mapToSort = new HashMap<>();
        long keyValue;

        for (String s : keySet) {
            keyValue = lettersToCount.stream().filter(ch -> ch.equals(s)).count();
            mapToSort.put(s, keyValue);
        }
        List<Map.Entry<String, Long>> sortedList = new ArrayList<>(mapToSort.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        sortedList.forEach(System.out::println);
    }
}

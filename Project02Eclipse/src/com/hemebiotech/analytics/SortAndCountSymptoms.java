package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Read the List created from the parsed txt file, sort alphabetically and counts the symptoms.
 */


public class SortAndCountSymptoms {

    private List<String> parsedSymptoms;

    public SortAndCountSymptoms() {
    }


    /**
     * @param parsedSymptoms a list of symptoms extracted from a symptoms file that needs to be sorted and counted.
     */

    public Map<String, Integer> SortAndCount(List<String> parsedSymptoms) {
        this.parsedSymptoms = parsedSymptoms;

        Map<String, Integer> sortedSymptoms = new TreeMap<>();

//  Parsing the list to count the symptoms and adding them to an alphabetically sorted Map
        if (!parsedSymptoms.isEmpty()) {
            for (String valueRed : parsedSymptoms) {
                if (sortedSymptoms.containsKey(valueRed)) {
                    int oldCount = sortedSymptoms.get(valueRed);
                    sortedSymptoms.put(valueRed, ++oldCount);
                } else {
                    sortedSymptoms.put(valueRed, 1);
                }
            }
        } else {
            System.out.println("The list is empty");
        }

        return sortedSymptoms;
    }

}

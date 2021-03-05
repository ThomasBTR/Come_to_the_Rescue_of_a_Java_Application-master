package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

    private final ISymptomWriter writer;
    private final ISymptomReader reader;
    private List<String> symptomsList;
    private TreeMap<String, Integer> sortedSymptoms;


    /**
     * @param writer initialising writer
     * @param reader initialising reader
     */
    public AnalyticsCounter(ISymptomWriter writer, ISymptomReader reader) {
        this.writer = writer;
        this.reader = reader;
        this.symptomsList = null;
        this.sortedSymptoms = null;
    }

    /**
     * Load symptoms from file
     */
    public void loadSymptoms() {
        this.symptomsList = this.reader.GetSymptoms();
    }

    /**
     * Read the list of symptoms and sorts the alphabetically with a counter per symptom
     */
    public void sortAndCount() {
        if (!this.symptomsList.isEmpty()) {

            this.sortedSymptoms = new TreeMap<>();
            for (String valueRed : symptomsList) {
                if (sortedSymptoms.containsKey(valueRed)) {
                    int oldCount = sortedSymptoms.get(valueRed);
                    sortedSymptoms.put(valueRed, ++oldCount);
                } else {
                    sortedSymptoms.put(valueRed, 1);
                }
            }
        } else {
            System.out.println("The list is not loaded. Please load the list.");
        }
    }

    public void saveSymptoms() {
        this.writer.write(this.sortedSymptoms);
    }
}

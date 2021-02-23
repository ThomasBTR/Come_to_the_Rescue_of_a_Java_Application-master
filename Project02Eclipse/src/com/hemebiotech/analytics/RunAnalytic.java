package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class RunAnalytic {

    private static final String INPUT_FILEPATH = "Project02Eclipse/symptoms.txt";
    private static final String EXIT_FILEPATH = "Project02Eclipse/result.txt";


    public static void main(String... args) {

        //Extracting data from the symptoms file
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(INPUT_FILEPATH);
        List<String> symptoms = readSymptomDataFromFile.GetSymptoms();

        //Sort alphabetically and counting the symptoms
        AnalyticsCounter sortAndCountSymptoms = new AnalyticsCounter();
        Map<String, Integer> sortedSymptoms = sortAndCountSymptoms.SortAndCount(symptoms);

        //Writing the results into an File
        new WriteResultInFile(EXIT_FILEPATH, sortedSymptoms);
    }
}

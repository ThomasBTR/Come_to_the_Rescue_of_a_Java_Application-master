package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    /**
     * Read the list of symptoms and sorts the alphabetically with a counter per symptom
     *
     * @param parsedSymptoms a list of symptoms extracted from a symptoms file that needs to be sorted and counted.
     */
    public Map<String, Integer> SortAndCount(List<String> parsedSymptoms) {

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


//        public void read(String inputFilepath){
//
//        };
//
//        public void sort();
//
//        public void write();


//// first getinput
//		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
//		String line = reader.readLine();
//		int i = 0;	// set i to 0
//		int headCount = 0;	// counts headaches
//		while (line != null) {
//			i++;	// increment i
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headCount++;
//				System.out.println("number of headaches: " + headCount);
//			}
//			else if (line.equals("rush")) {
//				rashCount++;
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//			}
//
//			line = reader.readLine();	// get another symptom
//		}
//
//		// next generate output
//		FileWriter writer = new FileWriter ("result.out");
//		writer.write("headache: " + headacheCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();

}

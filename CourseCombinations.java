// Author: Ceasar Muscatella
// Course: CS2
// Semester: Spring 2025

import java.util.*;
import java.io.*;

public class CourseCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Set<String>> studentCourses = new HashMap<>();

        try {
            // Read the number of students
            System.out.println("Enter the number of students:");
            int numStudents = Integer.parseInt(scan.nextLine());

            // Read each student's courses
            for (int i = 0; i < numStudents; i++) {
                if (scan.hasNextLine()) {
                    // Split the line into student name and courses
                    String[] parts = scan.nextLine().trim().split("\\s+");

                    // Extract and store courses in a HashSet
                    Set<String> courses = new HashSet<>();
                    for (int j = 1; j < parts.length; j++) {
                        courses.add(parts[j]);
                    }

                    // Map the student to their courses
                    studentCourses.put(parts[0], courses);
                }
            }

            // Calculate and output the total pairs
            int pairs = uniquePairs(studentCourses);
            System.out.println("\n" + pairs);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer for the number of students.");
        } finally {
            scan.close();
        }
    }

    // Debugging: Print the student-course map to verify data
    public static void printHash(Map<String, Set<String>> studentCourses) {
        for (Map.Entry<String, Set<String>> entry : studentCourses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Determines amount of Unique classes
    public static int uniquePairs(Map<String, Set<String>> studentCourses) {
        int pairs = 0;
        List<String> names = new ArrayList<>(studentCourses.keySet());

        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                // Find common courses between two students
                Set<String> coursesInCommon = new HashSet<>(studentCourses.get(names.get(i)));
                coursesInCommon.retainAll(studentCourses.get(names.get(j)));

                if (!coursesInCommon.isEmpty()) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}


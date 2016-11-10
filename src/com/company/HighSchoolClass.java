package com.company;

/**
 * Created by df377 on 11/10/16.
 */
public class HighSchoolClass {

    private Student[] students;

    public Student getValidictorian() {
        double i;
        double highest;

        for (Student varName: students) {
            i = students[varName].getGPA();
            highest = students[0].getGPA();

            if (i > highest) {
                highest = i;
            }
        }
            return highest;
    }

    public double getHonorsPercentage() {
        int sum = 0;
        for (Student varName: students) {
            if (students[varName].isHonors().equals(true)) {
                sum = sum + 1;
            }
        }
        double percentage = sum/students.length;
        return percentage;
    }

    public double getGPA() {

    }

    public boolean isHonors() {

    }
}

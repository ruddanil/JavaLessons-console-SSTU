package ru.rud.unsorted;

import java.util.ArrayList;
import java.util.List;

public class StudentComp implements ComparableStudent<StudentComp>, Comparable<StudentComp> {
    private String name;
    private List<Integer> grades = new ArrayList<Integer>();

    public StudentComp(String name) {
        this.name = name;
    }

    public StudentComp(String name, int... grades) {
        this.name = name;
        createNewGrades(grades);
    }

    public void createNewGrades(int... grades) {
        for (int g : grades) {
            if (g < 6 && g > 0) this.grades.add(g);
        }
    }

    public void setGrades(int pos, int grade) {
        this.grades.set(pos, grade);
    }

    public int[] getGrades() {
        int[] gradesCopy = new int[grades.size()];
        for (int i = 0; i < grades.size(); i++)
            gradesCopy[i] = grades.get(i);
        return gradesCopy;
    }

    public double getAverageGrades() {
        double output = 0;
        if (grades.size() != 0) {
            for (int g : grades) output += g;
            return output / grades.size();
        }
        return output;
    }

    public boolean isExcellentStudent() {
        if (grades.size() != 0) {
            for (int i = 0; i < grades.size(); i++) {
                if (grades.get(i) != 5) return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String sGrades = "";
        for (Integer g : grades) sGrades += g + " ";
        return name + ": [ " + sGrades + "]";
    }

    public Integer compare(StudentComp student) {
        if (this.getAverageGrades() > student.getAverageGrades())
            return 1;
        else if (this.getAverageGrades() > student.getAverageGrades())
            return -1;
        else return 0;
    }

    public int compareTo(StudentComp student) {
        if (this.getAverageGrades() > student.getAverageGrades())
            return 1;
        else if (this.getAverageGrades() > student.getAverageGrades())
            return -1;
        else return 0;
    }

}

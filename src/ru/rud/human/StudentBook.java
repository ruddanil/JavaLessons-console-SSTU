package ru.rud.human;

import java.util.ArrayList;
import java.util.List;

public class StudentBook {
    private int bookID;
    private String studentName;
    private List<Exams> exams = new ArrayList<Exams>();

    public static class Exams {
        private String subName;
        private String teacherName;
        private int grade;

        public Exams(String subName, String teacherName, int grade) {
            this.subName = subName;
            this.teacherName = teacherName;
            this.grade = correctGrade(grade);
        }

        public int correctGrade(int grade) {
            if (grade > 5) return 5;
            if (grade < 1) return 1;
            return grade;
        }

        @Override
        public String toString() {
            return subName + ", " + teacherName + ", " + grade;
        }
    }

    public StudentBook(int bookID, String studentName) {
        this.bookID = bookID;
        this.studentName = studentName;
    }

    public StudentBook(int bookID, String studentName, Exams... exam) {
        this.bookID = bookID;
        this.studentName = studentName;
        addExams(exam);
    }

    private void addExams(Exams... exams) {
        for (Exams e : exams)
            this.exams.add(e);
    }

    public void setExams(int pos, Exams exams) {
        this.exams.set(pos, exams);
    }

    public Exams[] getExams() {
        Exams[] examsCopy = new Exams[exams.size()];
        for (int i = 0; i < exams.size(); i++) {
            examsCopy[i] = exams.get(i);
        }
        return examsCopy;
    }

    @Override
    public String toString() {
        String fullExams = "";
        for (Exams e : exams)
            fullExams += "      " + e.toString() + "\n";
        return studentName + ", " + bookID + ": \n" + fullExams;
    }
}

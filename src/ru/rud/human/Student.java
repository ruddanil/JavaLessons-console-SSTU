package ru.rud.human;

import ru.rud.unsorted.Guardian;
import ru.rud.unsorted.Save;

import java.util.*;
import java.util.function.Predicate;

public class Student {
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private Predicate<Integer> prd;
    private Deque<savedMethods> methods = new ArrayDeque<>();
    private List<Guardian> guard = new ArrayList<>();

    public Student(String name) {
        setName(name);
    }

    public Student(String name, Predicate<Integer> prd, int... grades) {
        setName(name);
        this.prd = prd;
        addGrades(grades);
    }

    public void setName(String name) {
        String tmp = this.name;
        this.name = name;
        methods.push(() -> this.name = tmp);
    }

    public void addGrades(int... grades) {
        for (int g : grades) {
            if (prd != null && !prd.test(g)) throw new IllegalArgumentException();
            this.grades.add(g);
            guard.stream().forEach(x->x.alert(this, g));
            methods.push(() -> this.grades.remove(this.grades.size() - 1));
        }
    }

    public void setGrade(int index, int grade) {
        int tmp = this.grades.get(index);
        this.grades.set(index, grade);
        methods.push(() -> this.grades.set(index, tmp));
    }

    public void delGrade() {
        int tmp = this.grades.get(this.grades.size() - 1);
        grades.remove(this.grades.size() - 1);
        methods.push(() -> grades.add(tmp));
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double getAverageGrades() {
        double output = 0;
        if (grades.size() != 0) {
            for (int g : grades) output += g;
            return output / grades.size();
        }
        return output;
    }

    public void undo() {
        methods.pop().action();
    }

    public Save<Student> saveStudent() {
        return new StudentSave(this.name, this.prd, this.grades);
    }

    public void loadStudent(Save<Student> studentSave) {
        StudentSave s1 = (StudentSave) studentSave;
        this.name = s1.name;
        this.prd = s1.prd;
        this.grades = new ArrayList<>(s1.grades);
    }

    private static class StudentSave implements Save<Student> {
        private final String name;
        private Predicate<Integer> prd;
        private final List<Integer> grades;

        private StudentSave(String name, Predicate<Integer> prd, List<Integer> grades) {
            this.name = name;
            this.prd = prd;
            this.grades = new ArrayList<>(grades);
        }
    }

    public void startWatch(Guardian g) {
        guard.add(g);
    }

    interface savedMethods {
        void action();
    }

    @Override
    public String toString() {
        String sGrades = "";
        for (Integer g : grades) sGrades += g + ",";
        return name + ": [" + sGrades + "\b]";
    }
}

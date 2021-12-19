package ru.rud.unsorted;

import ru.rud.human.Student;

import java.util.function.Predicate;

public class Guardian {
    private String name;
    private Predicate<Integer> prd;
    private String msg;

    public Guardian(String name, Predicate<Integer> prd, String msg) {
        this.name = name;
        this.prd = prd;
        this.msg = msg;
    }

    public void alert(Student student, int grade) {
        if(prd.test(grade))
            System.out.println(this.name + ": " + this.msg);
    }

    public void observe(Student student) {
        student.startWatch(this);
    }
}

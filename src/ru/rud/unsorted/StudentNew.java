package ru.rud.unsorted;

public class StudentNew extends Person {
    public String name;
    public boolean visit(Security s){
        return s.check(this);
    }
}

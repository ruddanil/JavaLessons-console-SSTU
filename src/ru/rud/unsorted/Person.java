package ru.rud.unsorted;

public class Person {
    public boolean visit(Security s){
        return s.check(this);
    }
}

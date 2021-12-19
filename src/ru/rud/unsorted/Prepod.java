package ru.rud.unsorted;

public class Prepod extends Person{
    public boolean visit(Security s){
        return s.check(this);
    }
}

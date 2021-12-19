package ru.rud.unsorted;

public class Security {
//    Boolean check(Person p) {
//        if (p.getClass() == Person.class) return false;
//        if (p.getClass() == StudentNew.class && p.name != null) return true;
//        if (p.getClass() == Prepod.class) return true;
//        else return false;
//    }
    Boolean check(Person p) {
        return false;
    }
    Boolean check(StudentNew s){
        return s.name != null;
    }
    Boolean check(Prepod p){
        return true;
    }

}

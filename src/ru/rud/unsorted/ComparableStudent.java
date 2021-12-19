package ru.rud.unsorted;

public interface ComparableStudent<T> extends Comparable<T> {
    public Integer compare(T obj);
}

package ru.rud.db;

public interface Conditionaly<T, P> {
    public P apply(T o);
}


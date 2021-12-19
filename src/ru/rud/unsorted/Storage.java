package ru.rud.unsorted;

import java.util.List;

public class Storage<T> {
    private final T obj;
    private final static Storage nullLst = new Storage(null);

    public Storage(T obj) {
        this.obj = obj;
    }

    public static <T> Storage<T> createStorage(T obj) {
        if(obj == null)
            return nullLst;
        return new Storage<T>(obj);

    }

    public T getObj(T def) {
        if (obj == null) return def;
        return obj;
    }

    public T getObj() {
        return obj;
    }



}

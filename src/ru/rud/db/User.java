package ru.rud.db;

import java.util.Iterator;
import java.util.Optional;

public class User implements Connection, Iterator<String> {

    private static int count = 0;

    private boolean isClosed = false;

    private User() {
    }

    public static Optional<Connection> create(String name) {
        if (count <= 5) {
            count++;
            return Optional.of(new User());
        }
        return Optional.empty();
    }

    public String next() {
        if (isClosed) throw new RuntimeException();
        return "Hello word";
    }

    public String type() {
        return null;
    }

    public void close() {
        count--;
        isClosed = true;
    }

    public boolean hasNext() {
        return true;
    }
}
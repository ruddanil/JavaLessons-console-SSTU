package ru.rud.db;

import java.util.Iterator;
import java.util.Optional;

public class UserXml extends User implements Connection, Iterator<String> {

    private static int count = 0;

    private boolean isClosed = false;

    UserXml() {
    }

    public Optional<Connection> create() {
        if (count <= 5) {
            count++;
            return Optional.of(new UserXml());
        }
        return Optional.empty();
    }

    public String next() {
        if (isClosed) throw new RuntimeException();
        return "Hello xml";
    }

    public void close() {
        count--;
        isClosed = true;
    }

    public boolean hasNext() {
        return true;
    }
}

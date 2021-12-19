package ru.rud.db;

import java.util.*;
import java.util.function.Supplier;

public interface Connection extends AutoCloseable {
    String next();

    Map<String, Supplier<Optional<Connection>>> map = new HashMap<>();


    class ListWrapper implements Connection {
        List my;
        Boolean isOpened = true;
        int
    }

    static Connection of(String name) {
        return map.get(name.split(".").length - 1).get().get();
    }

//    static Connection to(String name) {
//        if (name.endsWith("db")) return User.create(name).get();
//        else if (name.endsWith("xml")) return UserXml.create(name).get();
//        return null;
//    }
//
//    Connection.map.put("db", -> DBConnection.create());
//    Connection.map.put("db", -> XMLConnection.create());


}


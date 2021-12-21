package ru.rud.db;

import java.util.*;
import java.util.function.Supplier;

public interface Connection extends AutoCloseable {
    String next();
    Map<String, Supplier<Optional<Connection>>> map = new HashMap<>();

    class ListWrapper implements Connection {
        public List my;
        public Boolean isOpened = true;
        public int count = 0;
        public ListWrapper (List l) {
            this.my = l;
        }

        public String next() {
            if(count == my.size()-1) count = 0;
            if(isOpened) return null;
            return my.get(count++).toString();
        }

        @Override
        public void close() throws Exception {

        }
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


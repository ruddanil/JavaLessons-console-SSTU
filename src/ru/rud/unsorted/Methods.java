package ru.rud.unsorted;

//import ru.rud.geometry.Line;
import ru.rud.geometry.Point;
import ru.rud.geometry.PointWithZ;
import ru.rud.human.Student;

import java.util.*;

import java.util.function.*;

public class Methods {
//    //5.2.1
//    public static Line<?> shiftLine(Line<?> line) {
//        Point startPoint = line.getStartPoint();
//        int x1 = startPoint.getX();
//        if (x1 > 0) x1 += 10;
//        else x1 -= 10;
//        return Line.createLine(new Point(x1, startPoint.getY()), line.getEndPoint());
//    }
//
//    //5.2.2
//    public static Double findMaxStorage(Storage<Double>... storage) {
//        double max = 0;
//        for (int i = 0; i < storage.length; i++) {
//            if (storage[i].getObj(0.0).doubleValue() > max)
//                max = storage[i].getObj(0.0).doubleValue();
//        }
//        return max;
//    }
//
//    //5.2.3
//    public static void startCountDown(Box<? super PointWithZ> box) {
//        box.setObj(new PointWithZ(1, 2, 3));
//    }

    //5.2.4
//    public static void fillingList(Number... numbers) {
//        for(int i = 0; i < numbers.length; i++)
//            numbers.set(i,i);
//    }

    //5.3.1
//    public static <T, P> List<P> func(List<T> list, Function<T, P> fun) {
//        List<P> newList = new ArrayList<>();
//        for (T l : list) {
//            newList.add(fun.apply(l));
//        }
//        return newList;
//    }
//
//    //5.3.2
//    public static <T> List<T> filter(List<T> list, Predicate<T> pred) {
//        List<T> newList = new ArrayList<>();
//        for (T l : list) {
//            if (pred.test(l)) newList.add(l);
//        }
//        return newList;
//    }
//
//    //5.3.3
//    public static <T> T reduce(List<T> list, Reductor<T> red) {
//        T res = list.get(0);
//        for (int i = 0; i < list.size(); i++) {
//            res = red.reduce(list.get(i), res);
//        }
//        return res;
//    }
//
//    public interface Reductor<T> {
//        T reduce(T obj, T res);
//    }

    //5.3.4
    public static <T, P> P collect(List<T> list, Creator<P> crt, Consumer<T, P> cns) {
        P res = crt.create();
        for (T i : list) {
            cns.push(res, i);
        }
        return res;
    }

    public interface Creator<P> {
        P create();
    }

    public interface Consumer<T, P> {
        void push(P lst, T t);
    }
}


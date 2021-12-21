package ru.rud.main;

import ru.rud.trafficlight.TrafficLights;

import ru.rud.unsorted.NewName;

public class Main {
    public static void main(String[] args) {
//        List<String> str = new ArrayList<>();
//        str.add("aaa");
//        str.add("ab");
//        str.add("a");
//        System.out.println(str);
//        str.sort(new ComparableLetter());
//        System.out.println(str);
//
//
//        ------------5.1.1------------
//        Box<Integer> box = new Box<>();
//        box.setObj(3);
//        System.out.println(box.getObj());
//        System.out.println(box.boxIsFull());
//
//        ------------5.1.2------------
//        Storage<String> st = new Storage<>(null);
//        System.out.println(st.getObj());
//
//        ------------5.1.4------------
//        StudentComp st1 = new StudentComp("Вася",5,5,5);
//        StudentComp st2 = new StudentComp("Женя",4,4,4);
//        System.out.println(st1.compare(st2));
//
//        ------------5.1.5------------
//        Line<Point> ln = Line.createLine(new Point(-7,2), new Point(1,4));
//        Line<PointWithZ> ln3d = Line.create3DLine(1,2,3,4,5,6);
//        System.out.println(ln.getLength());
//        System.out.println(ln3d.getLength());
//
//        ------------5.2.1------------
//        Line ln2 = shiftLine(ln);
//
//        ------------5.2.2------------
//        Storage<Integer> st1 = new Storage<>(null);
//        Storage<Integer> st2 = new Storage<>(null);
//        Storage<Integer> st3 = new Storage<>(null);
//        System.out.println(st1.getObj(0));
//        System.out.println(findMaxStorage(st1,st2,st3));
//
//        -----------5.2.3------------
//        Box<PointWithZ> box = new Box<>();
//        startCountDown(box);
//        System.out.println(box.getObj());
//
//        -----------5.2.4------------
//        List<Number> list = new List<>;
//        fillingList(1,2,3);

//        -----------5.3.1------------
//        List<String> l1 = Arrays.asList("qwerty", "asdfg", "zx");
//        Function<String, Integer> count = String::length;
//        System.out.println(func(l1, count));
//
//        List<Integer> l2 = Arrays.asList(1, -3, 7);
//        Function<Integer, Integer> filter = x -> (x > 0) ? x : -x;
//        System.out.println(func(l2, filter));
//
//        List<Integer[]> l3 = new ArrayList<>();
//        l3.add(new Integer[]{1,2,3});
//        l3.add(new Integer[]{4,5,6,12});
//        l3.add(new Integer[]{-5,98,1,12});
//        l3.add(new Integer[]{-100,98,1,12});
//        Function<Integer[], Integer> maxInMas = x -> {
//            int temp = x[0];
//            for(int i = 1; i < x.length; i++){
//                if(x[i]>temp) temp = x[i];
//            }
//            return temp;
//        };
//        System.out.println(func(l3, maxInMas));

//        -----------5.3.2------------
//        List<String> l1 = Arrays.asList("qwerty", "asdfg", "zx");
//        Predicate<String> charMin = x -> x.length() > 3;
//        System.out.println(filter(l1, charMin));
//
//        List<Integer> l2 = Arrays.asList(1, -3, 7);
//        Predicate<Integer> intABS = x -> x > 0;
//        System.out.println(filter(l2, intABS));
//
//        List<Integer[]> l3 = new ArrayList<>();
//        l3.add(new Integer[]{1, 2, 3});
//        l3.add(new Integer[]{-1, -2});
//        l3.add(new Integer[]{-5, -98, -1, -12});
//        l3.add(new Integer[]{-100, 98, 1, 12});
//
//        Predicate<Integer[]> notABSMas = x -> {
//            for (Integer i : x){
//                if(i > 0) return false;
//            }
//            return true;
//        };
//        System.out.println(filter(l3, notABSMas));

//        -----------5.3.3------------
//        List<String> l1 = Arrays.asList("qwerty", "asdfg", "zx");
//        System.out.println(reduce(l1,(x,y)->x+y));
//
//        List<Integer> l2 = Arrays.asList(1, -3, 7);
//        System.out.println(reduce(l2,(x,y)->x+y));
//
//        List<Integer[]> l3 = new ArrayList<>();
//        l3.add(new Integer[]{1, 2, 3});
//        l3.add(new Integer[]{-1, -2});
//        l3.add(new Integer[]{-5, -98, -1, -12});
//        l3.add(new Integer[]{-100, 98, 1, 12});
//
//        System.out.println(reduce(map(l3,x->x.size()),(x,y)->x+y));

//        -----------5.3.4------------
// Ex.1 --------------------------------
//        List<Integer> lst1 = new ArrayList<>();
//        lst1.add(1);
//        lst1.add(-3);
//        lst1.add(7);
// Case 1
//        Creator<List<List<Integer>>> crt = () -> {
//            List<List<Integer>> res2 = new ArrayList<>();
//            return res2;
//        };
//        Consumer<Integer, List<ArrayList<Integer>>> forInt = (lst, num) ->{
//            ArrayList<Integer> resNotABC = new ArrayList<>();
//            ArrayList<Integer> resABC = new ArrayList<>();
//            if(num < 0) resNotABC.add(num);
//            else resNotABC.add(num);
//            lst.add(0, resNotABC);
//            lst.add(1, resABC);
//        };
//        System.out.println(collect(lst1, crt, forInt));
// Case 2
//        Consumer<Integer, ArrayDeque> dq = (adq,num)-> {
//            if(num < 0) adq.addFirst(num);
//            else adq.addLast(num);
//        };
//        System.out.println(collect(lst1, () -> new ArrayDeque<>(), dq));

// Ex.2 --------------------------------
//        List<String> l2 = Arrays.asList("qwerty", "asdfg", "zx");
//    }
//        -----------CW 23.11.21------------
//        Student st1 = new Student("Игорь", x -> x > 0 && x < 6, 5,5,5);
//        Guardian g1 = new Guardian("Мария", x->x<3,"Ты можешь лучше");
//        Guardian g2 = new Guardian("Александр", x->x<3,"М Д А А А");
//        st1.startWatch(g1);
//        st1.startWatch(g2);
//        st1.addGrades(2)

//        -----------CW 07.12.21------------
// Студент чекер, отмены, сохранение, опекун, !оценка сложная (с уровнями)
// Генерик, итератор оценок Сложно: класс светофор
// 3(4) класса (персон(обыч) - студент - препод / security (boolean chek (Person P) Person - false; Student: name null - false/true; Prepod - true
// Объект должен приходить по правильной ссылке
//        StudentNew stn = new StudentNew();
//        stn.name = "Кирилл";
//        StudentNew stn1 = new StudentNew();
//        Security scr = new Security();
//        stn.visit(scr);

//        -----------CW 18.12.21------------
        NewName a = new NewName.BuilderName().setName("Даниил").setSecondName("Александрович").build();
        System.out.println(a);











    }
}

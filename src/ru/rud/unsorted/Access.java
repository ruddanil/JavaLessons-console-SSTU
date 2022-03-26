package ru.rud.unsorted;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//public class Access {
//    List<Predicate<HumanNew>> tests = new ArrayList<>();
//
//    public boolean chek(HumanNew hum) {
//        for (Predicate t : tests) {
//            if (!t.test(hum)) return false;
//        }
//        return ac.chek(hum);
//    }
//
//    public static class BuilderAccess() {
//        private Access bAc;
//        private List<Predicate<HumanNew>> tests = new ArrayList<>();
//
//        public BuilderAccess() {
//        }
//
////        public BuilderAccess add(Access ac) {
////            this.bAc = ac;
////            return this;
////        }
//
//        public BuilderAccess add(Predicate<HumanNew> pr) {
//            this.tests.add(pr);
//            return this;
//        }
//
//        public BuilderAccess of() {
//            return new BuilderAccess();
//        }
//
//        public Access get() {
//            return new Access(tests);
//        }
//    }
//
//    public Access(Access ac, List<Predicate> pr) {
//        this.ac = ac;
//        pr.addAll(pr);
//    }
//
//    private Access(List<Predicate<HumanNew>> tests) {
//    };
//    private Access ac = new Access() {
//        public boolean chek(HumanNew h) {
//            return true;
//        }
//    };
//}

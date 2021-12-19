//package ru.rud.human;
//
//public class Human {
//    private Name name;
//    private Human parent;
//    private int height;
//    private String[] fullName = new String[3];
//
//    public Human(String firstName, String middleName, String patron, int height, Human parent) {
//        this.fullName[0] = firstName;
//        this.fullName[1] = middleName;
//        this.fullName[2] = patron;
//        setHeight(height);
//        this.parent = parent;
//    }
//
//    public Human(String firstName, int height, Human parent) {
//        this(firstName, null, null, height, parent);
//        setParent(parent);
//    }
//
//    public Human(String firstName, int height) {
//        this(firstName, null, null, height, null);
//    }
//
//    public Human(Name name, int height) {
//        this(name.getFullName()[0], name.getFullName()[1], name.getFullName()[2], height, null);
//    }
//
//    public Human(Name name, int height, Human parent) {
//        this(name.getFullName()[0], name.getFullName()[1], name.getFullName()[2], height, parent);
//        setParent(parent);
//    }
//
//    public void setHeight(int height) {
//        if (height > 0 && height <= 500) this.height = height;
//        else throw new IllegalArgumentException("Рост должен быть положительным и не больше 500");
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public String[] getFullName() {
//        return fullName;
//    }
//
//    public Human getParent() {
//        return parent;
//    }
//
//    public Name getName() {
//        return new Name(this.fullName[0], this.fullName[1], this.fullName[2]);
//    }
//
//    public void setParent(Human parent) {
//        this.parent = parent;
//        if (getFullName()[1] == null && parent.getFullName()[1] != null) fullName[1] = parent.getFullName()[1];
//        if (getFullName()[2] == null && parent.getFullName()[0] != null) fullName[2] = parent.getFullName()[0] + "ович";
//    }
//
//    @Override
//    public String toString() {
//        String sFullName2 = "";
//        for (String s : fullName)
//            if (s != null) sFullName2 += s + " ";
//        return sFullName2 + ", " + height;
//    }
//}

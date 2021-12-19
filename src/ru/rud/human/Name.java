package ru.rud.human;

public class Name {
    private static String[] fullName = new String[3];

    private Name(String firstName, String middleName, String patron) {
        if ((firstName != null && firstName != "") || (middleName != null && middleName != "") || (patron != null && patron != "")) {
            fullName[0] = firstName;
            fullName[1] = middleName;
            fullName[2] = patron;
        } else throw new IllegalArgumentException("Как минимум один параметр должен быть заполнен");
    }

    public static Name createFirstName(String firstName){
        return new Name(firstName, null, null);
    }

    public static Name createSecondName(String secondName){
        return new Name(null, secondName, null);
    }

    public static Name createPatron(String patron){
        return new Name(null, null, patron);
    }

    public String[] getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        String sFullName = "";
        for (String s : fullName)
            if (s != null) sFullName += s + " ";
        return sFullName;
    }
}

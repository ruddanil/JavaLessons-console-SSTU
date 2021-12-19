package ru.rud.human;

public class Worker {
    private String name;
    private Department department;

    public Worker(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return department.getDepartmentName();
    }

    public String toString() {
        if (department.getBoss() == this)
            return name + " начальник отдела " + department.toString();
        String bossName = "";
        if (department.getBoss() != null)
            bossName = department.getBoss().getName();
        return name + " работает в отделе " + department.toString() + ", начальник которого " + bossName;
    }
}

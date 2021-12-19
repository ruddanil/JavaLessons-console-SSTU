package ru.rud.human;

public class Department {
    private String departmentName;
    private Worker boss;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setBoss(Worker boss) {
        if (departmentName == boss.getDepartmentName())
            this.boss = boss;
    }

    public Worker getBoss() {
        return boss;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String toString() {
        return departmentName;
    }
}
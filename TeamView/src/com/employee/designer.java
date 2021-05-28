package com.employee;

public class designer extends programmer {
    private double bonus;

    public designer(int id, String name, int age, double salary,Equipment equipment, double bonus) {
        super(id, name, age, salary,equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

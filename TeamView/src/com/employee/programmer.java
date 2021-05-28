package com.employee;
import com.teamservice.Status;
public class programmer extends employee {
    private int memberid;
    private Status status;
    private Equipment equipment;


    public programmer() {
    }
    public programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.status = status.FREE;
        this.equipment = equipment;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + getStatus() + "\t\t\t"
                + getEquipment();
    }

    public String getDetailsForTeam() {
        return memberid + "/" + getId() + "\t" + getName() + "\t" + getAge()
                + "\t" + getSalary() + "\t程序员";
    }
}

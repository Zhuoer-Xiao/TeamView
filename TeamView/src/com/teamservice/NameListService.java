package com.teamservice;
import com.employee.*;
import static com.teamservice.Data.*;
public class NameListService {
    private employee[] employees;
    public NameListService(){
        employees=new employee[EMPLOYEES.length];
        for(int i=0;i<employees.length;++i){
            int type=Integer.parseInt(EMPLOYEES[i][0]);
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case EMPLOYEE:
                    employees[i]=new employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment=createEquipment(i);
                    employees[i]=new programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment=createEquipment(i);
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i]=new designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment=createEquipment(i);
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    stock=Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i]=new architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }

    }
    public Equipment createEquipment(int index){
        int type=Integer.parseInt(EQUIPMENTS[index][0]);
        String model=EQUIPMENTS[index][1];
        String info=EQUIPMENTS[index][2];
        switch(type){
            case PC:
                return new PC(model,info);
            case NOTEBOOK:
                double price=Double.parseDouble(info);
                return new notebook(model,price);
            case PRINTER:
                return new printer(model,info);
        }
        return null;
    }

    public employee[] getAllEmployees(){
        return employees;
    }

    public employee getEmployee(int id) throws TeamException{
        for(int i=0;i<employees.length;++i){
            if (employees[i].getId()==id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }
}


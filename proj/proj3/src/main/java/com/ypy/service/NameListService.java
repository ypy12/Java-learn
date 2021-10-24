package com.ypy.service;

import com.ypy.domain.*;
import static com.ypy.service.Data.*;

public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            // 自己想复杂的地方：
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            // 获取用户的id,name,age,salary
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            int stock;
            double bonus;
            switch (type) {
            case EMPLOYEE:
                employees[i] = new Employee(id, name, age, salary);
                break;
            case PROGRAMMER:
                equipment = createEquipment(i);
                employees[i] = new Programmer(id, name, age, salary, equipment);
                break;
            case DESIGNER:
                equipment = createEquipment(i);
                bonus = Double.parseDouble(EMPLOYEES[i][5]);
                employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                break;
            case ARCHITECT:
                equipment = createEquipment(i);
                bonus = Double.parseDouble(EMPLOYEES[i][5]);
                stock = Integer.parseInt(EMPLOYEES[i][6]);
                employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                break;
            }
        }
    }

    private Equipment createEquipment(int index) {
        // 可能会有错误，传入参数检索错误
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        String model = EQUIPMENTS[index][1];
        String info = EQUIPMENTS[index][2];

        switch (type) {
        case PC:
            return new PC(model, info);
        case NOTEBOOK:
            return new NoteBook(model, Integer.parseInt(info));
        case PRINTER:
            return new Printer(model, info);
        }
        return null;

    }

    public Employee[] getAllEmployee() {
        return employees;

    }

    // 异常处理？？？为什么直接return e不行
	public Employee getEmployee(int id) throws TeamException {
		for (Employee e : employees) {
			if (e.getId() == id)
				return e;
		}
		throw new TeamException("该员工不存在");
	}
}

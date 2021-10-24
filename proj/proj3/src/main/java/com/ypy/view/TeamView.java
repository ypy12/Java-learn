/*
 * @Description: 对最后的系统进行统一的显示
 * @Author: YPY
 * @Date: 2021-10-24 11:55:57
 * @LastEditTime: 2021-10-24 13:53:27
 * @LastEditors: YPY
 * @Reference: 
 */

package com.ypy.view;

import javax.print.PrintService;

import com.ypy.domain.Employee;
import com.ypy.domain.Programmer;
import com.ypy.service.NameListService;
import com.ypy.service.TeamException;
import com.ypy.service.TeamService;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu() {

        boolean loopFlag = true;
        char key = 0;

        do {
            if (key != '1') {
                listAllEmployees();
            }
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            key = TSUtility.readMenuSelection();
            System.out.println();
            switch (key) {
            case '1':
                getTeam();
                break;
            case '2':
                addMember();
                break;
            case '3':
                deleteMember();
                break;
            case '4':
                System.out.print("确认是否退出(Y/N)：");
                char yn = TSUtility.readConfirmSelection();
                if (yn == 'Y')
                    loopFlag = false;
                break;
            }
        } while (loopFlag);
    }

    private void listAllEmployees() {
        System.out.println("--------------开发团队调度软件--------------------");
        Employee[] emps = listSvc.getAllEmployee();
        if (emps == null) {
            System.out.println("团队中没有人员");
        } else {
            System.out.println("ID" + "\t" + "姓名" + "\t" + "工资" + "\t" + "职位" + "\t" + "状态" + "\t" + "奖金" + "\t" + "股票"
                    + "\t" + "\t\t" + "领用设备");
            // 我的写法比较复杂一些
            // for (int i = 0; i < emps.length; i++) {
            // System.out.println(emps[i]);
            // }
            for (Employee e : emps) {
                System.out.println(" " + e);
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    private void getTeam() {
        System.out.println("\n--------------------团队成员列表---------------------\n");
        Programmer[] team = teamSvc.getTeam();
        if (team.length == 0) {
            System.out.println("开发团队目前没有成员！");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
        }

        for (Programmer p : team) {
            System.out.println(" " + p.getDetailsForTeam());
        }
        System.out.println("-----------------------------------------------------");
    }

    private void addMember() {
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee e = listSvc.getEmployee(id);
            teamSvc.addMember(e);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    private void deleteMember() {
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除的员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee e = listSvc.getEmployee(id);
            teamSvc.removeMember(e.getId());
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }
    }
    public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
}

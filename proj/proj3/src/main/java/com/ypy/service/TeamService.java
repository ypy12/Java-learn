/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-10-22 20:47:00
 * @LastEditTime: 2021-11-12 13:38:42
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.service;

import com.ypy.domain.Architect;
import com.ypy.domain.Designer;
import com.ypy.domain.Employee;
import com.ypy.domain.Programmer;

public class TeamService {
    private static int counter = 1;
    private final static int MAX_MEMBER = 5;
    private int total = 0;
    Programmer[] team = new Programmer[MAX_MEMBER];
    private int numOfArch = 0, numOfDsgn = 0, numOfPrg = 0;

    // 这块不太会
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("该团队人满");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该员工不是程序员");
        }

        Programmer p = (Programmer) e;

        if (isExist(p))
            throw new TeamException("该员工已在本团队中");
            //使用枚举类的时候的方法
/*         if (p.getStatus().getName().equals("BUSY")) {
            throw new TeamException("该员工已是某团队成员");
        } else if (p.getStatus().getName().equals("VOCATION")) {
            throw new TeamException("该员正在休假，无法添加");
        } */

        switch(p.status){
            case BUSY:
            throw new TeamException("该员工已是某团队成员");
            case VOCATION:
            throw new TeamException("该员正在休假，无法添加");
        default:
            break;
        }

        // 判断员工类型和该类型是不是人满了
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect)
                numOfArch++;
            else if (team[i] instanceof Designer)
                numOfDsgn++;
            else if (team[i] instanceof Programmer)
                numOfPrg++;
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1)
                throw new TeamException("团队中至多只能有一名架构师");
        } else if (p instanceof Designer) {
            if (numOfDsgn >= 2)
                throw new TeamException("团队中至多只能有两名设计师");
        } else if (p instanceof Programmer) {
            if (numOfPrg >= 3)
                throw new TeamException("团队中至多只能有三名程序员");
        }
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++] = p;

    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int n = 0;
        // 找到指定memberId的员工，并删除
        for (; n < total; n++) {
            if (team[n].getMemberId() == memberId) {
                team[n].setStatus(Status.FREE);
                break;
            }
        }
        // 如果遍历一遍，都找不到，则报异常
        if (n == total)
            throw new TeamException("找不到该成员，无法删除");
        // 后面的元素覆盖前面的元素
        for (int i = n + 1; i < total; i++) {
            team[i - 1] = team[i];
        }
        team[--total] = null;
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];

        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }
}

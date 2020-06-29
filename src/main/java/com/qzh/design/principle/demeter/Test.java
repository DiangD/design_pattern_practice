package com.qzh.design.principle.demeter;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description 迪米特原则
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.checkNumberByTeamLeader(teamLeader);
    }

}

package com.qzh.design.principle.demeter;

/**
 * @ClassName Boss
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class Boss {
    public void checkNumberByTeamLeader(TeamLeader teamLeader) {
        teamLeader.checkNumber();
    }
}

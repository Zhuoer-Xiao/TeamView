package com.teamservice;
import com.employee.*;
public class teamservice {
    private int counter=1;
    final int MAX_MEMBER=5;
    private programmer[] team=new programmer[MAX_MEMBER];
    private int total=0;

    public programmer[] getTeam(){
        programmer[] team=new programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i]=this.team[i];
        }
        return team;
    }

    public void addMember(employee e) throws TeamException{
        if(total>=MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof programmer)){
            throw new TeamException("该成员不是开发人员");
        }
        programmer p=(programmer)e;

        switch (p.getStatus()){
            case BUSY:
                throw new TeamException("该成员已是某团队成员");
            case VOCATION:
                throw new TeamException("该成员正在休假");
        }

        if (isExist(p)){
            throw new TeamException("该员工已在本团队中");
        }
        int numOfPro = 0,numOfDes = 0,numOfArch = 0;
        for(int i = 0;i < total;i++){
            if(team[i] instanceof architect){
                numOfArch++;
            }else if(team[i] instanceof designer){
                numOfDes++;
            }else if(team[i] instanceof programmer){
                numOfPro++;
            }
        }

        if(p instanceof architect&&numOfArch>=1){
            throw new TeamException("团队中至多只能有一名架构师");
        }else if (p instanceof designer&&numOfDes>=2){
            throw new TeamException("团队中至多只能有两名设计师");
        }else if(p instanceof programmer&&numOfPro>=3){
            throw new TeamException("团队中至多只能有三名程序员");
        }

        p.setStatus(Status.BUSY);
        p.setMemberid(counter++);
        team[total++]=p;
    }

    public void removeMember(int memberid)throws TeamException{
        int i;
        for (i = 0; i <total ; i++) {
            if (team[i].getId()==memberid){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i==total){
            throw new TeamException("找不到指定member");
        }

        for (int j = 0; j < total-1; j++) {
            team[j]=team[j+1];
        }

        team[--total]=null;
    }

    private boolean isExist(programmer p){
        for (int i = 0; i < total; i++) {
            if(team[i].getId()==p.getId()){
                return true;
            }
        }
        return false;
    }
}





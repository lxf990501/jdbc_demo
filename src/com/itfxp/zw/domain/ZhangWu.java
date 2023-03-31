package com.itfxp.zw.domain;

import java.util.Date;

public class ZhangWu {
    /**
     * zwid : 账务的id
     */
    private int zwid;
    /**
     * flname : 账务类别
     */
    private String flname;
    /**
     * money : 开销的金额
     */
    private double money;
    /**
     * zhanghu : 支出或收入的账户
     */
    private String zhanghu;
    /**
     * createtime : 支出或收入的时间
     */
    private Date createtime;
    /**
     * description : 花钱的描述
     */
    private String description;


    public ZhangWu() {
    }

    public ZhangWu(int zwid, String flname, double money, String zhanghu, Date createtime, String description) {
        this.zwid = zwid;
        this.flname = flname;
        this.money = money;
        this.zhanghu = zhanghu;
        this.createtime = createtime;
        this.description = description;
    }

    public int getZwid() {
        return zwid;
    }

    public void setZwid(int zwid) {
        this.zwid = zwid;
    }

    public String getFlname() {
        return flname;
    }

    public void setFlname(String flname) {
        this.flname = flname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getZhanghu() {
        return zhanghu;
    }

    public void setZhanghu(String zhanghu) {
        this.zhanghu = zhanghu;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ZhangWu{" +
                "zwid=" + zwid +
                ", flname='" + flname + '\'' +
                ", money=" + money +
                ", zhanghu='" + zhanghu + '\'' +
                ", createtime=" + createtime +
                ", description='" + description + '\'' +
                '}';
    }
}

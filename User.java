package com.neuedu.pojo;

public class User {

    public User()
    {

    }
    public User(String userName,String psw,String cao)
    {
        this.userName = userName;
        this.psw = psw;
        this.cao = cao;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }


    public String getCao() {
        return cao;
    }

    public void setCao(String cao) {
        this.cao = cao;
    }


    private String userName;

    private String psw;

    private String cao;
}

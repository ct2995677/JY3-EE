package com.neuedu.entry;

public class User {
    private  String username;
    private  String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{}";
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


        @Override
    public boolean equals(Object obj) {
       if (obj instanceof User){
           if ((this.username).equals(((User) obj).getUsername()) && (this.password).equals(((User) obj).getPassword())){
               return true;
           }
       }
       return false;
    }
}

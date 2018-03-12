package cn.xiao.entity;

import java.util.Arrays;

public class User {

    private String username;
    private String password;
    private String[] interest;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", interest=" + Arrays.toString(interest) +
                '}';
    }
}

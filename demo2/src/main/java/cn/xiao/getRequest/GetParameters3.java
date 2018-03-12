package cn.xiao.getRequest;

import java.util.Arrays;

// 使用属性封装
public class GetParameters3 {
    // 1.声明属性
    private String username;
    private String password;
    private String[] interest;

    // 2.实现setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    public String useAttributeEncapsulation(){
        System.out.println("GetParameters3 useAttributeEncapsulation:");
        // 3.直接使用
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("interest : " + Arrays.toString(interest));
        return "success";
    }
}

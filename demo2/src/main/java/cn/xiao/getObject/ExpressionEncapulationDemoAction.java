package cn.xiao.getObject;

import cn.xiao.entity.User;

public class ExpressionEncapulationDemoAction {
    // 声明实体类，并实现Setter和getter
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String useExpression(){
        System.out.println("ExpressionEncapulationDemoAction useExpression:");
        // 直接使用
        System.out.println(user);
        return "success";
    }
}

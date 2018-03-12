package cn.xiao.getObject;

import cn.xiao.entity.User;
import com.opensymphony.xwork2.ModelDriven;

// 2. 创建Action，实现ModelDriven
public class ModelDriverDemoAction implements ModelDriven<User> {

    // 4. 声明并创建实体类
    private User user = new User();

    public String useModelDriver() {
        System.out.println("ModelDriverDemoAction use model driver:");
        // 5. 直接使用
        System.out.println(user);
        return "success";
    }

    // 3. 重写唯一的getModel方法
    @Override
    public User getModel() {
        return user;
    }
}
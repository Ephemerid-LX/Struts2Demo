package cn.xiao.setValue;

import cn.xiao.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class SetObjectAction extends ActionSupport{

    private User user;

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        User tmp = new User();
        tmp.setUsername("xiao");
        tmp.setPassword("12345");
        tmp.setInterest(new String[]{"nan", "nv"});
        user = tmp;
        return "debug";
    }
}

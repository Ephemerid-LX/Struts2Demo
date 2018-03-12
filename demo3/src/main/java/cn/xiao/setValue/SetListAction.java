package cn.xiao.setValue;

import cn.xiao.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class SetListAction extends ActionSupport{

    private List<User> users = new ArrayList<User>();

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String execute() throws Exception {
        User user1 = new User();
        user1.setUsername("xiao");
        user1.setPassword("12345");
        user1.setInterest(new String[]{"nan", "nv"});

        User user2 = new User();
        user2.setUsername("liu");
        user2.setPassword("54321");
        user2.setInterest(new String[]{"nv", "nv"});

        users.add(user1);
        users.add(user2);
        return "debug";
    }
}

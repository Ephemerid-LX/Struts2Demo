package cn.xiao.setValue;

import cn.xiao.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

public class SetMapAction extends ActionSupport {
    private Map<String, User> userMap = new HashMap<String, User>();

    public Map<String, User> getUserMap() {
        return userMap;
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

        userMap.put("user1", user1);
        userMap.put("user2", user2);
        return "debug";
    }
}

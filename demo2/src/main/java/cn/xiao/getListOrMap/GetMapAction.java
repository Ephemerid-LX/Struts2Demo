package cn.xiao.getListOrMap;

import cn.xiao.entity.User;

import java.util.Map;

// 封装数据到Map
public class GetMapAction {
    // 声明map，并实现setter和getter
    private Map<String, User> map;

    public Map<String, User> getMap() {
        return map;
    }

    public String get(){
        System.out.println("GetMapAction get:");
        System.out.println("map : " + map);
        return "success";
    }
}

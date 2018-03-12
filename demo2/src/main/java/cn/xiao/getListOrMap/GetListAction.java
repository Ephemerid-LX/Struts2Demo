package cn.xiao.getListOrMap;

import cn.xiao.entity.User;

import java.util.List;

// 封装到list
public class GetListAction {
    // 声明list，并实现setter和getter
    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public String get(){
        System.out.println("GetListAction get:");
        System.out.println("list : " + list);
        return "success";
    }
}

package cn.xiao.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

// 返回一个List
public class ListAction extends ActionSupport {

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    @Override
    public String execute() {
        list.add("it");
        list.add("very");
        list.add("good");
        return SUCCESS;
    }
}

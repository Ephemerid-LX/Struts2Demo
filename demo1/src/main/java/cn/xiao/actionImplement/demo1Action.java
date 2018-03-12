package cn.xiao.actionImplement;

import com.opensymphony.xwork2.Action;

// 实现方式二：实现接口
public class demo1Action implements Action {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}

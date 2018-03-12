package cn.xiao.setValue;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

// 使用ValueStack的set方法来设置值，添加一个map对象来保存设置的值
public class SetStackValueSetterAction extends ActionSupport {

    public String execute() {
        System.out.println("SetStackValueSetterAction execute:");
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("useStackSetter", "it is ok");
        valueStack.set("useStackSetter2", "it is not ok");
        return "debug";
    }
}

package cn.xiao.setValue;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

//push方法将直接把对象加入栈顶。
public class SetStackValuePushAction extends ActionSupport {

    public String execute() {
        System.out.println("SetStackValuePushAction execute:");
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.push("push is ok");
        valueStack.push("push is bad");
        return "debug";
    }
}

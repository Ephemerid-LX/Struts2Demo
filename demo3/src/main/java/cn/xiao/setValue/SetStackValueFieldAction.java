package cn.xiao.setValue;

// 在action中添加一个成员变量，并实现该成员变量的getter，该成员变量便被保存到了值栈中;
// 只是，没有被添加到栈顶，而是保存在action对象中。
import com.opensymphony.xwork2.ActionSupport;

public class SetStackValueFieldAction extends ActionSupport {
    // 增加的成员变量
    private String inputString;
    // 实现getter
    public String getInputString() {
        return inputString;
    }

    public String execute() {
        // 设置值
        inputString = "field is ok";
        return "debug";
    }
}

package cn.xiao.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;

// 登录action
public class LoginAction extends ActionSupport {

    @Override
    public String execute() {
        ActionContext actionContext = ActionContext.getContext();
        HttpParameters parameters = actionContext.getParameters();
        String username = parameters.get("username").getValue();
        String password = parameters.get("password").getValue();

        System.out.println(username + ":" + password);

        // 验证账号密码
        if (!"xiao".equals(username) || !"123456".equals(password)) {
            actionContext.getValueStack().set("errorMessage", "username or password is not right!");
            return ERROR;
        }

        // 将用户名放到session中，将通过它来判断是否登录
        ServletActionContext.getRequest().getSession().setAttribute("username", username);
        return SUCCESS;
    }
}

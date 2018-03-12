package cn.xiao.getRequest;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

public class GetParameters {
    public String userActionContext() {
        // 获取当前线程的ActionContext对象
        ActionContext context = ActionContext.getContext();
        // 获取所有的表单参数
        HttpParameters parameters = context.getParameters();
        // 遍历表单参数
        for (Map.Entry<String, Parameter> parameter : parameters.entrySet()) {
            // 判断是否是一个多值的parameter(类似数组)
            // 如果对一个多只parameter使用getValue，只会取出第一个
            if (parameter.getValue().isMultiple()) {
                System.out.println("key :" + parameter.getKey() + "; value : " +
                        Arrays.toString(parameter.getValue().getMultipleValues()));
            } else {
                System.out.println("key :" + parameter.getKey() + "; value : " +
                        parameter.getValue());
            }
        }
        return "success";
    }

    public String useServletActionContext() {
        System.out.println("GetParameters useServletActionContext:");
        // 获取HttpServletRequest对象
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] interest = request.getParameterValues("interest");

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("interest : " + Arrays.toString(interest));
        return "success";
    }
}

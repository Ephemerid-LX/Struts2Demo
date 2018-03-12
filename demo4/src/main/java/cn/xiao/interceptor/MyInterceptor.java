package cn.xiao.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

// 拦截器，判断用户是否登录，如果没有登录，则返回到登录页面。
public class MyInterceptor extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        // 从session获取
        String username = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
        if (username == null) {

            // 如果不返回invoke()，而去放回其他的值，将会把返回值与设置了拦截器的action中的result结果进行匹配
            return "error";
        }

        // 放行，表示拦截器通过，将继续执行
        return invocation.invoke();
    }
}

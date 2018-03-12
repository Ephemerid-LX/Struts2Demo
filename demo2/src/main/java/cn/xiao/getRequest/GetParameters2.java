package cn.xiao.getRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

// 1. 实现ServletRequestWare接口
public class GetParameters2 implements ServletRequestAware{

    // 3. 声明一个HttpServletRequest对象
    private HttpServletRequest request;

    // 2. 实现serServletRequest方法
    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String useServletRequestAware(){
        System.out.println("GetParameters2 useServletRequestAware:");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] interest = request.getParameterValues("interest");

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("interest : " + Arrays.toString(interest));
        return "success";
    }
}

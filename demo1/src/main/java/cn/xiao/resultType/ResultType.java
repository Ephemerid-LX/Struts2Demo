package cn.xiao.resultType;

public class ResultType {

    public String redirect(){
        System.out.println("ResultType redirect method");
        return "redirect";
    }

    public String dispatcher(){
        System.out.println("ResultType dispatcher method");
        return "dispatcher";
    }
}

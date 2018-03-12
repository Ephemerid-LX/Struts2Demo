package cn.xiao.attachAction;

public class BookAction {

    public String add(){
        System.out.println("book add method");
        return "add";
    }

    public String update(){
        System.out.println("book update method");
        return "update";
    }
}

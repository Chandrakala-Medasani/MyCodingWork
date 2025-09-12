package Exceptions;

public class InsufficientBalance extends Exception{

    String msg;
    InsufficientBalance(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}

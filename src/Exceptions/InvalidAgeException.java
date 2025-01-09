package Exceptions;

public class InvalidAgeException extends Exception{
    String msg;

    InvalidAgeException(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}

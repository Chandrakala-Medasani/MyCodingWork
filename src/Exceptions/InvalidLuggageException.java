package Exceptions;

public class InvalidLuggageException extends Exception{

    String msg;
    InvalidLuggageException(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}

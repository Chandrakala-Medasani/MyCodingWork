package com.encapsulation;

public class EmailValidation {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email!=null && email.contains("@") &&
                email.contains(".") &&
                email.indexOf("@")<email.lastIndexOf(".")) {
            this.email = email;
        }
        else{
            throw new IllegalArgumentException("Invalid mail address");
        }
    }
}

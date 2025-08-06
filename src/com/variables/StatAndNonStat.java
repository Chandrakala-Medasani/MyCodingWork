package com.variables;

public class StatAndNonStat {

    static int a =10;

    public static void display(){
        System.out.println("Static Method and Static Variable = "+a);
    }

    public void print(){
        System.out.println("Non static method and static variable = "+a);
    }

    public static void main(String[] args) {
        StatAndNonStat st = new StatAndNonStat();
        st.display();
        st.print();
    }
}

package com.collections.arrayList;

public class ChanduArrayList {

    int[] a;
    private int top;

    ChanduArrayList(){
        a = new int[10];
        top = 0;
    }

    public boolean add(int n){
        if(top==a.length){
            int newSize = a.length+ (a.length/2);
            int[] b = new int[newSize];
            for(int i=0; i<a.length; i++)
                b[i]=a[i];

           a=b;
        }
        a[top++]=n;
        return true;
    }

    public int get(int index){
        if(index<0 || index>=top)
            return -1;
        return a[index];
    }

    public void printValues(){
        for(int i=0; i<top; i++)
            System.out.print(a[i]+" ");

        System.out.println();
    }

    public boolean delete(){
        if(top==0)
            return false;
        top--;
        return true;
    }

    public boolean add(int i, int n){
        if(i<0 || i>top)
            return false;
        if(top==a.length){
            int newSize = a.length+ (a.length/2);
            int[] b = new int[newSize];
            for(int k=0; k<a.length; k++)
                b[k]=a[k];

            a=b;
        }
        for(int j=top; j>i; j--)
            a[j]=a[j-1];
        a[i] = n;
        top++;
        return true;
    }

    public int indexOf(int element){
        for(int i=0; i<top; i++)
            if(a[i]==element)
                return i;

        return -1;
    }

    public boolean delete(int element){
        int index=indexOf(element);
        if(index==-1)
            return false;
        for(int i=index; i<top-1; i++)
            a[i]=a[i+1];
        top--;
        return true;
    }

    public int size(){
        return top;
    }
}

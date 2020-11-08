package com.SingletonChaining.Chaining;

public class DialogExample {

    public DialogExample setTitle(String title){
        System.out.println(title);
        return this;
    }

    public DialogExample setMessage(String message){
        System.out.println(message);
        return this;
    }

}

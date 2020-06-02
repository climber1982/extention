package com.lovo.mybaits.lambda;

public class LamdbaT {
    public static void main(String[] args) {
        //new User().say(mesa){System.out.println(message)}
    //    IUser user=(message)->{ message=message+"hello world"; System.out.println(message);};
        //调用
      //  user.say("hello lamdba");
       //new User().eat(foood){return "我吃的是"+food}
        IUser user=(food)->"我吃的是"+food;
     String str=   user.eat("牛肉");
        System.out.println(str);
    }
}

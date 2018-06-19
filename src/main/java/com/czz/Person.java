package com.czz;

/**
 * Create by czz on 2018/6/14 14:12
 **/
public class Person {
    //因为Person类要引用IHelloMessage接口，所以将IHelloMessage作为类的一个属性
    private IHelloMessage iHelloMessage;

    /**
     * 自动生成get方法
     * @return
     */
//    public IHelloMessage getiHelloMessage() {
//        return iHelloMessage;
//    }

    /**
     * 自动生成set方法
     * @param iHelloMessage
     */
    public void setiHelloMessage(IHelloMessage iHelloMessage) {
        this.iHelloMessage = iHelloMessage;
    }


    /**
     * person类使用sayHello方法来调用借口的sayHello方法
     * @return
     */
    public String sayHello(){
        return this.iHelloMessage.sayHello();
    }
}

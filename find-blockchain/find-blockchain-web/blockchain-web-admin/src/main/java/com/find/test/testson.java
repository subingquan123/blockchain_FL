package com.find.test;

/**
 * Description:
 * Author: Su
 * Date: 2023/12/28
 */

public class testson extends test{

    @Override
    void test2() {
        System.out.println("子类");
    }

    void test2(String a){
        System.out.println("重载");
        System.out.println(num2);
        System.out.println(num3);
    }
}

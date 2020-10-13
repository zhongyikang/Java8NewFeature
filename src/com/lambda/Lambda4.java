package com.lambda;

import com.DefaultMethodOfInterface.Formula;

class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23; //修改普通field
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72; //修改static field
            return String.valueOf(from);
        };
        
        //以上两个修改都没有报错。
        
//        Formula f = (a) -> sqrt(a * 100);
        //报错， 因为sqrt是函数式接口Fromula的default方法，无法直接调用。
        /**
         * 为什么无法直接调用的思考！
         * default可以理解为成员方法， 必须首先实例化Interface为concret type才能够调用。
         * 而实现接口必须先实例化类。 这就是循环了。
         */
    }
}
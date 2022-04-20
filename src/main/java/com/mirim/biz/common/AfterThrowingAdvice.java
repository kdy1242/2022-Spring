package com.mirim.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
    public void exceptionLog(JoinPoint jp, Exception exceptionObj) {
        String method = jp.getSignature().getName();
        System.out.println("[예외처리]" + method + "() 메소드 수행 중 발생된 예외 메세지 : " + exceptionObj.getMessage());
    }
}

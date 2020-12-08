package com.moqi.java.ch08;

import kotlin.jvm.functions.Function1;

import static com.moqi.kotlin.ch08.ProcessTheAnswer.*;

/**
 * Java ProcessTheAnswerJava
 *
 * @author moqi On 12/8/20 15:34
 */

public class ProcessTheAnswerJava {

    public static void main(String[] args) {

        // 非 lambda
        processTheAnswer(
                new Function1<Integer, Integer>() {
                    @Override
                    public Integer invoke(Integer number) {
                        System.out.println("number = " + number);
                        return number + 1;
                    }
                }
        );

        // lambda
        processTheAnswer(
                number -> {
                    System.out.println("number = " + number);
                    return number + 1;
                }
        );

        // lambda 不带打印
        processTheAnswer(number -> number + 1);

    }

}

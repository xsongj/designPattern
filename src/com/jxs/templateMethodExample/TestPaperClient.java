package com.jxs.templateMethodExample;

/**
 * Created by jiangxs on 2018/5/7.
 */
public class TestPaperClient {

    public static void main(String[] args) {

        System.out.println("学生甲做的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println();

        System.out.println("学生乙做的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}

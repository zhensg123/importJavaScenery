package com.example.importjavascenery.knowledge;


public class TestKnowledge2 implements TestInter{
    void testA() {
        System.out.println(11);
    }

    public static void main(String[] args) {
        TestKnowledge2 t = new TestKnowledge2();
        t.useUU();
    }

    @Override
    public void useUU() {
        System.out.println(121);
    }
}
package com.platzi.functional._10_chaining;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder StringBuilder = new StringBuilder();
            StringBuilder.append("What is love?")
                    .append("Baby don't hurt me")
                    .append("Don't hurt me")
                    .append("no more")
                    .append("(music playing)");
            Chainer chainer = new Chainer ();
            Chainer chainer2=chainer.sayHi();
            Chainer chainer3=chainer2.sayBye();
            chainer.sayHi().sayBye();
        
    }
    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hi");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("bye");
            return this;
        }
    }
}

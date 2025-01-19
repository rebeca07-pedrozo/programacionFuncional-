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
            chainer.sayHi();
            chainer.sayHi();
        
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

package com.richf;

public class Square extends Shape implements Area {

    public Square() {
        super.sides = 4;
    }

    public void sides() {
        System.out.println("Square ");

        super.sides();

        System.out.println("And area ");

        hasArea();
    }

    public void hasArea() {
        System.out.println( "Base x Height" );
    }

}

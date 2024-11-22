package org.example;

public class Main1 {
    public static void main(String[] args) {
        Main object1 = new Main(); //შემოვიტანეთ Main1 კლასში Main კლასის ობიექტი
        object1.z = 9; // ობიექტით მივწვდით Main კლასის არასტატიკურ ცვლადს
        object1.w = 0; // ობიექტით მივწვდით Main კლასის არასტატიკურ ცვლადს
        Main.x = 8; // Main. -ით მივწვდით Main კლასის სტატიკურ ცვლადს

    }

    public void printLastName(){
        System.out.println("Gabelaia"); //Main1 კლასში შევქმენით არასტატიკური ობიექტი, რომელსაც უნდა მივწვდეთ
        // Main კლასში Main1 ობიექტის შექმნით
    }
}

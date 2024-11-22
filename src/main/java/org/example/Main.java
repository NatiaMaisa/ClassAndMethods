package org.example;

public class Main {

    static int x = 5; //სტატიკური ცვლადი კლასის დონეზე
    static int y = 7; //სტატიკური ცვლადი კლასის დონეზე
    int z; //არასტატიკური ცვლადი კლასის დონეზე
    int w; //არასტატიკური ცვლადი კლასისი დონეზე
    final double v = 19.5; //  final ნიშნავს იმას რომ v ცვლადს ვერ მივანიჭებს სხვა მნიშვნელობას,
    // ეს არის მისი საბოლოო მნიშვნელობა და ყოველთვის იქნება 19.5
    public static void main(String[] args) {
        System.out.println(x + y);  /* არასტატიკურ ცვლადს ვერ მივწვდებით სტატიკური მეთოდიდან
    ამისთვის დაგვჭირდება ობიექტების შექმნა, თუმცა თუ არასტატიკურ ცვლადს მივუწერთ
    წინ static მაშინ შევძლებთ მივწვდეთ სტატიკური მეთოდიდან */

        // სტატიკური მეთოდიდან რომ მივწვდეთ არასტატიკურ ცვლადებს ამისთვის უნდა შევქმნათ ობიექტი
        Main object1 = new Main(); //Main კლასის ობიექტი
        object1.z = 6;
        object1.w = 9;
        System.out.println(object1.z + object1.w + x);

        Main object2 = new Main();
        object2.x = 7;
        object2.y = -7;
        System.out.println(object2.x * object2.y);

        printName(); //სტატიკური მეთოდის static Main მეთოდში გამოძახება
        object1.printLastName(); //არასტატიკური მეთოდის static Main მეთოდში გამოზახება ხდება ობიექტით

        Main1 object3 = new Main1(); //შევქმენით Main1 კლასის ობიექტი Main კლასში რათა
        // მივწვდეთ Main1-ის მეთოდებს
        object3.printLastName();

    }



    public static void printName(){
        System.out.println("Natia"); //სტატიკური მეთოდი
    }
    public void printLastName(){
        System.out.println("Maisuradze"); //არასტატიკური მეთოდი
    }




}


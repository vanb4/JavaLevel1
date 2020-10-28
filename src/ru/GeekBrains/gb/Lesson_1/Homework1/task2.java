package ru.GeekBrains.gb.Lesson_1.Homework1;

public class task2 {
        public static void main(String[] args) {
            testPrimitive();
            testObject();


        }

        private static void testObject() {
            //String str = new String ("Hi!");
            String str = "Hi!";

            System.out.println(str);



        }

        private static void testPrimitive() {
            int i = 126;
            byte b = -127;
            short s = 567;
            long l = 34575672L;
            double d = 4.6873763;
            float f = 0.2f;
            System.out.println("int = " + i);
            System.out.println("byte = " + b);
            System.out.println("short = " + s);
            System.out.println("long = " + l);
            System.out.println("double = " + d);
            System.out.println("float = " + f);
        }
    }




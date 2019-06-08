package hn.daniel;

public class HelloWorld
{
    public static String hello() {

        return hello("world");

    }

    public static String hello(String name) {

        String output = "Hello " + name + "!";
        return output;

    }
}

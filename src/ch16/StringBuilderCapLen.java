package ch16;//fIG. 16.11: StringBuilderCapLen.java
//StringBuilder length, seLength, capacity and ensureCapacity methods.

public class StringBuilderCapLen
{
    public static void main (String[]args)
    {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n",
        buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d\n\n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %S\n",
                buffer.length(), buffer.toString());
    } // END MAIN
} // end class StringBuilderCapLen

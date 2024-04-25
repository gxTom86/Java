
class Esempi_Casting_01
{
    public static void main(String args[])
    {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Casting da double a int
        System.out.println("Da double a int: " + myInt);

        long myLong = 128;
        byte myByte = (byte) myLong; // Casting da long a byte
        System.out.println("Da long a byte: " + myByte);

        float myFloat = 10.5f;
        short myShort = (short) myFloat; // Casting da float a short
        System.out.println("Da float a short: " + myShort);

        long anotherLong = 100000L;
        int anotherInt = (int) anotherLong; // Casting da long a int
        System.out.println("Da long a int: " + anotherInt);

        double anotherDouble = 112.35;
        byte anotherByte = (byte) anotherDouble; // Casting da double a byte
        System.out.println("Da double a byte: " + anotherByte);

    }
}
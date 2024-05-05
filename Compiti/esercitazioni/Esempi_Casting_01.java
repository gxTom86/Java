/*  
byte    1 byte  Stores whole numbers from -128 to 127

short   2 bytes Stores whole numbers from -32,768 to 32,767

int     4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647

long    8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float   4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

double  8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits

boolean 1 bit   Stores true or false values

char    2 bytes Stores a single character/letter or ASCII values  */
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

        System.out.println(" ");

        int numeroIntero = 100;
        long numeroLungo = numeroIntero; 
        System.out.println("Da int a long: " + numeroLungo);

        float numeroFloat = 10.5f;
        double numeroDouble = numeroFloat; 
        System.out.println("Da float a double: " + numeroDouble);

        byte numeroByte = 127;
        int interoDaByte = numeroByte;
        System.out.println("Da byte a int: " + interoDaByte);

        char carattere = 'A';
        int interoDaChar = carattere;
        System.out.println("Da char a int: " + interoDaChar);

        short numeroShort = 500;
        double doubleDaShort = numeroShort;
        System.out.println("Da short a double: " + doubleDaShort);



    }
}
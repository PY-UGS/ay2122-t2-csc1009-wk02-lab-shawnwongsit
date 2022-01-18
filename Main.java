import java.util.Scanner;
public class Main {
    static final double PI = 3.14159;
    public static void main(String[] args){
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();
        System.out.println("Byte value: " + byteValue);

        System.out.println("Enter a short value: ");
        short shortValue = input.nextShort();
        System.out.println("Short value: " + shortValue);

        System.out.println("Enter an int value: ");
        int intValue = input.nextInt();
        System.out.println("Int value: " + intValue);

        System.out.println("Enter a long value: ");
        long longValue = input.nextLong();
        System.out.println("Long value: " + longValue);

        System.out.println("Enter a float value: ");
        float floatValue = input.nextFloat();
        System.out.println("Float value: " + floatValue);*/

        //Question 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);

        //Question 2
        /*Scanner input = new Scanner(System.in);
        float sum = 0;
        float[] numbers = new float[3];
        String no = "";
        System.out.print("Enter three numbers: ");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = input.nextFloat();
            sum += numbers[i];
            no += numbers[i] + " ";
        }
        float avg = sum / numbers.length;
        System.out.println("The average of " + no + "is " + avg);*/

        //Question 3
        /*long totalMilli = System.currentTimeMillis();
        long totalSeconds = totalMilli / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");*/

        //Question 4
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int result = year % 12;
        String[] zodiacSigns = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.println(zodiacSigns[result]);*/
        
        
    }
}

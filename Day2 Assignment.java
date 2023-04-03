package week1;

public class Day2Assignment {
    public static void positiveOrNegative() {
        int number = 0;
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is not positive and negative number");
        }
    }

    public static void convertToPositive() {
        int number = 77;
        if (number < 0) {
            int newNumber = number * (-1);
            System.out.println(number + " is converted to " + newNumber);
        } else {
            System.out.println(number + " is already a positive number");
        }
    }

    public static void fibonacci() {
        int number = 10;
        int num1 = 0, num2 = 1, num3;
        System.out.println(num1);
        for (int i = 1; i <= number; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 =num3;
        }
    }

    public static void factorial(){
        int i,fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    public static void mobileDetails(){
        String mobileBrandName = "Samsung s20";
        char mobileLogo = 'S';
        short noOfMobilePiece = 1;
        int modelNumber=20;
        long mobileImeiNumber = 5671293849294758l;
        float mobilePrice = 30000.0f;
        boolean isDamaged = false;


        System.out.println("Brand Name :" +mobileBrandName+ "\n"  +"Logo :"  +mobileLogo+ "\n"  + "Quantity : "+noOfMobilePiece+ "\n"  + "Mobile IMEI number" + mobileImeiNumber+ "\n" + "Model :"+modelNumber+ "\n"  +"Price :"+mobilePrice+ "\n"  +"Mobile is damaged: " +isDamaged );


    }


    public static void main(String[] args) {
        positiveOrNegative();
        convertToPositive();
        fibonacci();
        factorial();
        mobileDetails();
    }
}

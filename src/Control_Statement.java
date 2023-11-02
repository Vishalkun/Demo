public class Control_Statement {
    public static void main(String[] args) {

        // if-statement
        int age=20;
        if(age>18){
            System.out.print("Age is greater than 18");
        }


        // if-else
        int number=13;
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

        //if-else-ladder
        int marks=65;

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else{
            System.out.println("Invalid!");
        }

        //Nested-if-statement
        int age1=20;
        int weight=80;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }

        //switch-statement
        int number1=2;
        switch(number1){
            case 1:
                System.out.println("10");
                break;
            case 2:
                System.out.println("20");
                break;
            case 3:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
                break;
        }

    }
}

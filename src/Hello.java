public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        boolean isAlien = false;
//                if(isAlien == false) {
//                    System.out.println("Not an alien");
//                }
//
//        int topScore = 100;
//                if(topScore != 100) {
//                    System.out.println("You got high score");
//                }
//
//        int newValue = 50;
//        if(newValue == 50) {
//            System.out.print("this is an error");
//        }
//
//        boolean isCar = false;
//        if(isCar == true) {
//            System.out.printf("Somehting");
//        }

        double smallVar = 20.00;
        double bigVar = 80.00;

        double total = (bigVar + smallVar) * 100.00;

        double remainder = total % 40.00;
        
        boolean isTrue = remainder == 0.00 ? true : false;

        System.out.println("isTrue = " + isTrue);

    }
}

package ce103_hw4_2022_2023_bedirhan_kurt;

import java.util.*;

public class MenuConstructor {

    public static int printMenu(String[] options, String prompt){
    	int chosen = 1;
    	while (chosen != options.length) {
            try {
            	for (String option : options){
                System.out.println(option);
            }
            System.out.print(prompt);
            }
            catch (InputMismatchException ex) {
            	System.out.println("Please enter an integer value between 1 and " + options.length);
            }
            catch (Exception ex) {
            	System.out.println("Unknown error. Please try again.");
            }
    	}
    	return chosen;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                     This is a dummy code and is meant only as a reference.                          //
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static int main(String[] args) {                                                          //
//        String[] options = {"1- Option 1",                                                           //
//                            "2- Option 2",                                                           //
//                            "3- Option 3",                                                           //
//                            "4- Exit",                                                               //
//        };                                                                                           //
//        Scanner scanner = new Scanner(System.in);                                                    //
//        int option = 1;                                                                              //
//        while (option!=4){                                                                           //
//            printMenu(options, null);                                                                //
//            try {                                                                                    //
//                option = scanner.nextInt();                                                          //
//            }                                                                                        //
//            catch (InputMismatchException ex){                                                       //
//                System.out.println("Please enter an integer value between 1 and " + options.length); //
//                scanner.next();                                                                      //
//            }                                                                                        //
//            catch (Exception ex){                                                                    //
//                System.out.println("An unexpected error happened. Please try again");                //
//                scanner.next();                                                                      //
//            }                                                                                        //
//        }                                                                                            //
//        return option;                                                                               //
//    }                                                                                                //
/////////////////////////////////////////////////////////////////////////////////////////////////////////
}

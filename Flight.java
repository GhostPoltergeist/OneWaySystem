package CodingwithHarold.Flight;


import java.util.Scanner;

public class Flight {    static Mapping mapping = new Mapping();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
     MainPage();
    }
    private static void MainPage() {
        int i;
        System.out.print("\n Welcome To Philippine Airlines \n\n");
         try {
             String choices = """

                     [x]-[1] Proceed To Flight Mapping
                     [x]-[2] Instruction
                     [x]-[3] View Previous data
                     
                     """;
               for (int j=0; j<choices.length(); j++) {
                   System.out.print(choices.charAt(j));
                   Thread.sleep(1);
               }
         } catch (InterruptedException IE) {System.out.println();}
        System.out.print(":: ");
        i = scan.nextInt();
          if (i == 1) {
           Questions();
	      }
          else if (i == 2) {
           InstructionFlight();
          }
    }

    private static void InstructionFlight() {
        String Instruction = """
                                            Welcome To Flight Mapping
                                               [x] Instruction [x]
                [x] You can select your flight by typing the keywords that the System already provide
                                      
                STEP 1
                Flight Selection :: Type the complete word depending on your flight to avoid major problem
                [FOnly] - Type "FOnly" to view all the (Flights Only) [Overview] you can now start your Mapping
                By following the next Flight Mapping Instructions provided in the next Flight Mapping Phase
                                    
                STEP 2
                Check Flight Availability :: Type the complete word depending on your flight to avoid major problem
                [Check] - Type "Check" to check the flights of a certain airline that you've already selected
                                      
                STEP 3
                Finalizing Your Flight :: Type the complete word depending on your flight to avoid major problem
                [good] - Type (good) if you want to make a complete flight path mapping type
                [bad] - Type (bad) if you want to cancel
                                                            
                """;
        for (int i = 0; i < Instruction.length(); i++) {
            System.out.print(Instruction.charAt(i));
        }
        Questions();
    }
    private static void Questions() {
               System.out.print("[x]Flight: ");
               String FlightSelect = scan.next();
               System.out.print("[x]Flight-Availability: ");
               String FlightAvail = scan.next();
               System.out.print("[x]Flight-Condition: ");
               String FlightCondition = scan.next();

               mapping.CorrespondingFlight(FlightSelect, FlightAvail, FlightCondition);
          }
}

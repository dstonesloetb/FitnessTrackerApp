//Insert Relevant Package Name

//Insert relevant imports here

public class FitnessHealthTracker {

   private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
  
      //Decalre and initialise variables 
       boolean keepRunning = true;

      //Output program heading 

      //While Loop to repeat program
                   
          //Call a function to print the program menu

          //Get user's menu choice

          //Switch on user's choice 
      
          switch (choice) {
            case 1:
                runBmiInterface();
                break;

          } //end switch 

      }//end while
          
    }  //end main
      


    private static void printMenu() {
       //Output menu options
       System.out.println("\n--- MAIN CORE INTERFACES ---");
    }

    // =========================================================================
    // COUPLING INTERFACES (Consumes Input & Dispatches to separate FitnessLibrary)
    // =========================================================================

    private static void runBmiInterface() {
        //Prompt to enter weight

        //Prompt to enter height 

       //Call relevant function
        String result = RelevantLibraryName.calculateBmi(weight, height);

      //Output result 
        System.out.println("System Output: " + result);
    }

    //Add additional interface methods 



} //end class 

  

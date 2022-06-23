package CodingwithHarold.Flight;

import java.util.Scanner;

public class Mapping {
    static Scanner scan = new Scanner(System.in);
    public void CorrespondingFlight(String FlightRecommendation, String FlightAvail, String FlightCondition) {
        if (FlightRecommendation.equals("FOnly") || FlightRecommendation.equals("fonly") || FlightRecommendation.equals("FONLY")) {
            if (FlightAvail.equals("Check") || FlightAvail.equals("check") || FlightAvail.equals("CHECK")) {
                if (FlightCondition.equals("good") || FlightCondition.equals("Good") || FlightCondition.equals("GOOD")) {
                  String MainRegionalCharter = """ 
                          ______________________________________________________________________________________________
                         | Cebu City             | El Nido             | Davao City               | Puerto Princesa     |
                         | Philippines AirAsia   | AirSWIFT            | Philippines AirAsia      | Philippines AirAsia |
                         | Nonstop               | Nonstop             | Nonstop                  | Nonstop             |
                         | 1 hr 25 min           | 1 hr 20 min         | 2 hr                     | 1 hr 25 min         |
                         | php1,938           [1]| php5,683         [2]| php2,717              [3]| php2,538       [4]  |      
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Philippines AirAsia   | Puerto Princesa     | Iloilo City              | Bacolod             |
                         | Nonstop               | Philippines AirAsia | Philippines AirAsia      | Philippines AirAsia |
                         | 2 hr                  | Nonstop             | Nonstop                  | Nonstop             |
                         | php2,717              | 1 hr 25 min         | 1 hr 10 min              | 1 hr 20 min         |
                         |                    [5]| php2,538         [6]| php1,307              [7]| php1,654       [8]  |                                       
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Dumaguete             | Cagayan de Oro      | Legazpi City             | Panglao             |
                         | Cebu Pacific          | Philippines AirAsia | Philippine Airlines      | Philippines AirAsia |
                         | Nonstop               | Nonstop             | Nonstop                  | Nonstop             |
                         | 1 hr 35 min           | 1 hr 40 min         | 1 hr 10 min              | 1 hr 25 min         |
                         | php2,583           [9]| php2,105        [10]| php2,273             [11]| php1,989      [12]  |
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Zamboanga             | Tacloban City       | General Santos City      | Kalibo              |
                         | Philippines AirAsia   | Philippines AirAsia | Cebu Pacific             | Philippines AirAsia |
                         | Nonstop               | Nonstop             | Nonstop                  | Nonstop             |
                         | 1 hr 35 min           | 1 hr 20 min         | 2 hr                     | 1 hr                |
                         | php3,239          [13]| php2,250        [14]| php3,255             [15]| php1,364      [16]  |                                
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Laoag City            | Butuan City         | Roxas City               | Naga                |
                         | Philippine Airlines   | Cebu Pacific        | Philippine Airlines      | Cebgo               |
                         | Nonstop               | Nonstop             | Nonstop                  | Nonstop             |
                         | 1 hr 30 min           | 1 hr 40 min         | 1 hr 5 min               | 1 hr 10 min         |
                         | php4,240          [17]| php3,884        [18]| php2,898             [19]| php3,859       [20] |                                           
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Surigao City          | Tuguegarao City     | Dipolog City             | Caticlan            |
                         | Cebu PacifiC & Cebgo  | Cebu Pacific        | Philippine Airlines      | Philippines AirAsia |
                         | 1 stop                | Nonstop             | Nonstop                  | Nonstop             |
                         | 4 hr 45 min           | 1 hr 10 min         | 1 hr 35 min              | 1 hr 10 min         |
                         | php4,583          [21]| php3,848        [22]| php4,286             [23]| php2,811       [24] |                
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Cotabato City         | Ozamiz City         | Masbate City             | Busuanga            |
                         | Cebu Pacific          | Philippine Airlines | Cebgo                    | Philippine Airlines |
                         | Nonstop               | Nonstop             | Nonstop                  | Nonstop             |
                         | 1 hr 40 min           | 1 hr 40 min         | 1 hr 30 min              | 1 hr 5 min          |
                         | php3,693          [25]| php3,569        [26]| php3,926             [27]| php4,944       [28] |                                                   
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Pagadian City         | Basco               | Cauayan City             | Tawi-Tawi           |
                         | Philippine Airlines   | Philippine Airlines | Cebu Pacific             | Philippine Airlines |
                         | Nonstop               | Nonstop             | Nonstop                  | 1 stop              |
                         | 1 hr 40 min           | 1 hr 45 min         | 1 hr 10 min              | 3 hr 25 min         |
                         | php4,017          [29]| php9,182        [30]| php2,862             [31]| php5,228       [32] |
                         | ----------------------|---------------------|--------------------------|---------------------|
                         | Virac                 | San Jose            | San Jose de Buenavista   | Del Carmen          |
                         | Cebu Pacific          | Cebgo               | Philippine Airlines      | Philippine Airlines |
                         | Nonstop               | Nonstop             | Nonstop                  | 1 stop              |
                         | 1 hr 15 min           | 1 hr 5 min          | 1 hr 20 min              | 5 hr 45 min         |
                         | php4,374          [33]| php3,467        [34]| R4,677               [35]| php5,229       [36] |                                                    
                         |______________________________________________________________________________________________|
                         
                          """;
                  for(int i=0; i<MainRegionalCharter.length(); i++) {
                      System.out.print(MainRegionalCharter.charAt(i));
                  }
                    System.out.print("Your Destination: ");
                    int Destination = scan.nextInt();
                }
            }
        }
    }
}


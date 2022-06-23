package CodingwithHarold.Flight;

import java.text.MessageFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Scanner;

public class Database {
    static String name;
    static String age;
    static Scanner scanner = new Scanner(System.in);
    private static final int cebuCity = 1938;
    private static final int elNido = 5683;
    private static final int davaoCity = 2717;
    private static final int puertoPrincesa = 2538;
    private static final int philAirAsia = 2717;
    private static final int puertoPrincesaDos = 2538;
    private static final int iloiloCity = 1307;
    private static final int bacolod = 1654;
    private static final int dumaguete = 2583;
    private static final int cagayanDeoro = 2105;
    private static final int legazpiCity = 2273;
    private static final int panglao = 1989;
    private static final int zamboanga = 3239;
    private static final int taclobanCity = 2250;
    private static final int generalSantos =  3255;
    private static final int kalibo =  1364;
    private static final int laoagCity = 4240;
    private static final int butuanCity = 3884;
    private static final int roxasCity = 2898;
    private static final int naga = 3859;
    private static final int surigaoCity = 4583;
    private static final int tuguegaraoCity = 3848;
    private static final int dipologCity = 4286;
    private static final int calictan = 2811;
    private static final int cotabatoCity = 3693;
    private static final int ozamizCity = 3569;
    private static final int masbateCity = 3926;
    private static final int busuanga = 4944;
    private static final int pagadianCity = 4017;
    private static final int basco = 9182;
    private static final int cauayanCity = 2862;
    private static final int tawitawi = 5228;
    private static final int virac = 4374;
    private static final int sanjose = 3476;
    private static final int sanjoseBuenavista = 4677;
    private static final int delCarmen = 5229;

  public void gettingUserInput(int x, int y) {
      System.out.print("Name: ");
      name = scanner.next();
      System.out.print("Age: ");
      age = scanner.next();

       if (x==1) {
           if (y==2) {
           printingDataTextFile(true);
        }
       }
  }
  private static void printingDataTextFile(boolean allFirstNumber) {
      if (allFirstNumber) {
          String nameData = MessageFormat.format("[x][name]> {0}", name);
          String ageData = MessageFormat.format("[x][age]> {0}", age);
          String map = """
                  +-----------------------+
                  | Cebu City             |
                  | Philippines AirAsia   |    ``
                  | Nonstop               |`   ` `
                  | 1 hr 25 min           | `  `  `
                  | php1,938           [1]|  ` `   `
                  +-----------------------+   `     `
                                                     `
                                                      `           ______
                                                       `          _\\ _~-\\___
                                                         `=  = ==(____AA____D
                                                                      \\_____\\___________________,-~~~~~~~`-.._
                                                                      /     o O o o o o O O o o o o o o O o  |\\_
                   [x]Flight Direction[x]                             `~-.__        ___..----..                  )
                   One Way Flight System                                    `---~~\\___________/------------`````
                    php1,938 > php5,683                                     =  ===(_________D   
                                                                                               `      
                                                                                                `+---------------------+ 
                                                                                                 | El Nido             | 
                                                                                                 | AirSWIFT            |
                                                                                                 | Nonstop             |
                                                                                                 | 1 hr 20 min         |   
                                                                                                 | php5,683         [2]|
                                                                                                 +---------------------+ 
                  """;
          try {
              BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//ZXZ/Desktop/OneWayMapping.txt"));
              Thread.sleep(150);
              System.out.println("[x]Printing the Map");
              writer.write(nameData);
              writer.write("\n");
              writer.write(ageData);
              writer.write("\n");
              writer.write("\n");
              writer.write(map);
              writer.close();
          } catch (InterruptedException ignored) {
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }
}

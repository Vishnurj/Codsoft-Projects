import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * CurrencyConverter
 */
public class CurrencyConverter {


  private  Map<String,Double> amountexchange;


  public CurrencyConverter() {
    amountexchange = new HashMap<>();
        amountexchange.put("USD_TO_EUR", 0.84);
        amountexchange.put("USD_TO_GBP", 0.72);
        amountexchange.put("USD_TO_INR", 75.0);
        amountexchange.put("USD_TO_AUD", 1.31);
        amountexchange.put("INR_TO_USD", 0.013);
        amountexchange.put("INR_TO_EUR", 0.011);
        amountexchange.put("INR_TO_JPY", 1.82);
        amountexchange.put("USD_TO_JPY", 110.92);

  }
  
  public double convertamount(String basecurrency, String targetcurrency, double amount){
    String key = basecurrency +"_TO_"+targetcurrency;
    double amountexchanges = amountexchange.get(key);
    return amount * amountexchanges;
  }

  public static void main(String[] args) {
    CurrencyConverter cc = new CurrencyConverter();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the basecurrency");
    String basecurrency = sc.nextLine();
    System.out.println("Enter the Target currency");
    String targetcurrency = sc.nextLine();



    System.out.println("Enter the amount to convert");
    int amount = sc.nextInt();

    double convertamount = cc.convertamount(basecurrency, targetcurrency, amount);
    System.out.println(convertamount);
    sc.close();
  }

  
}
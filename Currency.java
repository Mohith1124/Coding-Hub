class Currency {
public static void main(String[] args) {
    int rupee = 100;
    double dollar = 86.24;
    double rupee_dollar = (float) (rupee / dollar);
    double dollar_rupee = (float) (dollar * rupee);  
    System.out.println("Rupee to Dollars: " + rupee_dollar);
    System.out.println("Dollars to Rupees: " + dollar_rupee);
    }
}


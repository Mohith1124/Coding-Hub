class Currency {
    public static void main(String[] args) {
        double rupee = 100;
        double exchangeRate = 86.24;
        double rupeeToDollar = rupee / exchangeRate;
        double dollarToRupee = exchangeRate;

        System.out.println("100 Rupees to Dollars: " + rupeeToDollar);
        System.out.println("1 Dollar to Rupees: " + dollarToRupee);
    }
}

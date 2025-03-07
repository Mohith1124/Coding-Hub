class LibraryBooks {
    public static void main(String[] args) {
        String person = "Inter";  // Change this to test different cases
        int numberOfDays=4; // Total days the book is kept
        int bookPrice=1200;
        int totalFine=0;

        if (numberOfDays>15) { //No fine for first 15 days
            int overdueDays=numberOfDays-15; //Calculate fine for extra days
            if(numberOfDays>=45) { // If days exceed 45 have to pay book price
                totalFine=bookPrice;
            } else{
                if(person=="BTech" || person=="BSc") {
                    totalFine=overdueDays*10; // Fine for BTech & BSc
                } 
                else if(person=="Diploma" || person=="Inter") {
                    totalFine=overdueDays*20; // Fine for Diploma & Inter
                } 
                else {
                    totalFine=overdueDays*30; // Fine for others
                }
            }
        }

        System.out.println("Total fine for " + person + ": " + totalFine);
    }
}

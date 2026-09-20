public class Payment {

    private String customerName;
    private String upiId;
    private double amount;

    public Payment(String customerName, String upiId, Double amount){
          setCustomerName(customerName);
          setupiId(upiId);
          setamount(amount);
    }

    public String getCustomerName(){

        return customerName;
    }

    public void setCustomerName(String customerName){
        if(customerName == null || customerName.equals(" ")) {
            System.out.println("Customer Name cannot be empty!!");
            return;
        }
        this.customerName = customerName;

    }
    public String getupiId(){
        return upiId;
    }

    public void setupiId(String upiId){
        if( upiId== null || upiId.equals(" "));
        System.out.println("UPI ID cannot be empty!!");
        this.upiId = upiId;
        return;

    }

    public void setamount(double amount){
        if( amount <= 0 ) {
            System.out.println("Amount cannot be empty!!");
            return;
        }
            this.amount = amount;

    }

           void processPayment(){
               System.out.println("Payment Processing.....");
               System.out.println("Payment Done");

           }

    void displayPaymentDetails(){

        System.out.println("=========Payment Details=========\n");
        System.out.println("Customer Name: " + customerName);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: " + amount);
        processPayment();



    }

}

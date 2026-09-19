public class Payment {

    private String customerName;
    private String upiId;
    private double amount;

    public Payment(String customerName, String upiId, Double amount){
          setcustomerName = (customerName);
          setupiId = (upiId);
          setamount = (amount);
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        if(customerName == null || customerName.isEquals(" "));
        System.out.println("Customer Name cannot be empty!!");
        return;
        this.customerName = customerName;
    }

    public void set(String customerName){
        if(customerName == null || customerName.isEquals(" "));
        System.out.println("Customer Name cannot be empty!!");
        return;
        this.customerName = customerName;
    }


    void displayPaymentDetails(){

        System.out.println("=========Payment Details=========");
        System.out.println("Customer Name" + customerName);
        System.out.println("UPI ID" + upiId);
        System.out.println("Amount" + amount);



    }

}

package intermidiateJava;

public class NegativePaymentException extends  Exception{
    double payment;

    public NegativePaymentException( double payment){
        this.payment= payment;
    }

    public String toString(){
        return "Error: Can't take negative payment " + payment;
    }
}

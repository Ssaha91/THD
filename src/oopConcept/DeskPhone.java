package oopConcept;

public class DeskPhone implements ITelephone {
    private boolean isRinging;
    private int myNumber;

    public DeskPhone(boolean isRinging, int myNumber) {
        this.isRinging = isRinging;
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action is taken bc Desk phone doesnt have power button");

    }

    @Override
    public void dil(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on desktop");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println(" ringing");
        }
        return isRinging = false;
    }
    @Override
    public void answer(){
        if (isRinging){
            System.out.println("Answer the desk phone");
            isRinging = false;
        }
    }
    @Override
    public boolean isRingig() {
        return isRinging;
    }
}

public class DeskPhone implements Telephone {
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }
    
    @Override
    public void powerOn() {
        System.out.println("Desk phone is always powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the phone");
            isRinging = false;
        } else {
            System.err.println("Phone isn't ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Phone ringing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

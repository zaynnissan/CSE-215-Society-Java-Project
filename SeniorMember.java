package Society;

//Author S M Gazzali Arafat Nishan
//Date :24 - 05 -2020
// Senior Member Class

public class SeniorMember extends Member {
    private int fee;

    public SeniorMember(String name, String address, int fee) {
        super(name, address);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

}
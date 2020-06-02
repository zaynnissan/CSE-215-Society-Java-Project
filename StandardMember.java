package Society;
//Author S M Gazzali Arafat Nishan
//Date :24 - 05 -2020
//Standard Member Class

public class StandardMember extends Member {
    public StandardMember(String name, String address) {
        super(name, address);
    }

    public int getFee() {
        return 50;
    }
}
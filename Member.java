package Society;
//Author S M Gazzali Arafat Nishan
//Date :24 - 05 -2020
//Society Class

public abstract class Member {
    private String name;
    private String address;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract int getFee();
}
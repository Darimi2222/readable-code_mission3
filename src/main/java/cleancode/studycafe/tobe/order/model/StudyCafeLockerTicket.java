package cleancode.studycafe.tobe.order.model;

public class StudyCafeLockerTicket {

    private final StudyCafePassType passType;
    private final int duration;
    private final int price;

    private StudyCafeLockerTicket(StudyCafePassType passType, int duration, int price) {
        this.passType = passType;
        this.duration = duration;
        this.price = price;
    }

    public static StudyCafeLockerTicket of(StudyCafePassType passType, int duration, int price) {
        return new StudyCafeLockerTicket(passType, duration, price);
    }

    public StudyCafePassType getPassType() {
        return passType;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public String display() {
        if (passType == StudyCafePassType.HOURLY) {
            return String.format("%s시간권 - %d원", duration, price);
        }
        if (passType == StudyCafePassType.WEEKLY) {
            return String.format("%s주권 - %d원", duration, price);
        }
        if (passType == StudyCafePassType.FIXED) {
            return String.format("%s주권 - %d원", duration, price);
        }
        return "";
    }

}

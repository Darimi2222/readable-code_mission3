package cleancode.studycafe.tobeByCoach.model.pass.locker;

import cleancode.studycafe.tobeByCoach.model.pass.StudyCafePass;
import cleancode.studycafe.tobeByCoach.model.pass.StudyCafePassType;

public class StudyCafeLockerPass implements StudyCafePass {

    private final StudyCafePassType passType;
    private final int duration;
    private final int price;

    private StudyCafeLockerPass(StudyCafePassType passType, int duration, int price) {
        this.passType = passType;
        this.duration = duration;
        this.price = price;
    }

    public static StudyCafeLockerPass of(StudyCafePassType passType, int duration, int price) {
        return new StudyCafeLockerPass(passType, duration, price);
    }

    public boolean isSameDuration(int duration) {
        return this.duration == duration;
    }

    public boolean isSamePassType(StudyCafePassType passType) {
        return this.passType == passType;
    }
    @Override
    public StudyCafePassType getPassType() {
        return passType;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getDuration() {
        return duration;
    }

}

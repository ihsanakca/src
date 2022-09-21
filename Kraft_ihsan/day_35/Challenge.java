package day_35;

public class Challenge extends GameActivity {

    private int shootOption;
    private int pointOfShoot;
    private int shootSuccess;

    public Challenge(int shootOption, int shootSuccess) {
        int point;
        this.shootOption = shootOption;
        this.shootSuccess = shootSuccess;

        this.pointOfShoot=1000/shootOption;
        point=pointOfShoot*shootSuccess;

        setScore(point);
    }
}

package data;

public enum UserDataIndex {

    STEPS(0), RESTING_BPM(1), HEIGHT(2), WEIGHT(3), BODY_FAT(4), ACTIVITY_LEVEL(5), BENCH(6), DEADLIFT(7), SQUAT(8), INFO(9), GENDER(10);

    private final int index;

    UserDataIndex(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}

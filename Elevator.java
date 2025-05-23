public class Elevator {

private int weightLimit = 2000;
private boolean inUse;
private int currentWeight;

private boolean elevatorPass;

public Elevator(int currentWeight, boolean inUse) {
    this.currentWeight = currentWeight;
    this.inUse = inUse;
}

public void changePass(boolean equalsTrue) {
     elevatorPass = equalsTrue;
}

public int getWeightLimit() {
    return weightLimit;
}

public int getCurrentWeight() {
    return currentWeight;
}

public String displayStatus(String elevator) {
    
}
}

   



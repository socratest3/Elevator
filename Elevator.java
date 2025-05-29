public class Elevator 
{
    private int weightLimit = 2000;
    private boolean inUse;
    private int currentWeight;
    private boolean elevatorPass;

    public Elevator(int currentWeight, boolean inUse) 
    {
        this.currentWeight = currentWeight;
        this.inUse = inUse;
        this.elevatorPass = false;
    }

    public void changePass(boolean hasPass) 
    {
        elevatorPass = hasPass;
    }

    public boolean getPass() {
        return elevatorPass;
    }

    public int getWeightLimit() 
    {
        return weightLimit;
    }

    public int getCurrentWeight() 
    {
        return currentWeight;
    }

    public boolean canUseElevator(int userWeight) 
    {
        return (userWeight + currentWeight) <= weightLimit;
    }




    public String displayStatus(String elevatorName)
    {
        String status = "Elevator " + elevatorName;
        
        if (inUse) 
        {
            status += "In Use: true";
        } 
        else 
        {
            status += "In Use: false";
        }

        if (elevatorPass) 
        {
            status += "Pass Required: Yes";
        } 
        else 
        {
            status += "Pass Required: No";
        }
        return status;
    }
}

package assignment3.interfaces.task5;

public class Solution {
    public static void main(String[] args) {
        BeeerLover drinker = new BeeerLover();
        drinker.askForMore("eshe 2 pivka");
        if(drinker.isReadyToGoHome() == false) {
            drinker.askForMore("eshe 5 pivka");
            drinker.sleepOnTheFloor();
        } else {
            drinker.sayThankYou();
        }
    }
}

package ac.su.kdt.myfirstspring.manualdiexample.main;

import ac.su.kdt.myfirstspring.manualdiexample.obj_cons_injection.Broadcast;
import ac.su.kdt.myfirstspring.manualdiexample.obj_cons_injection.Singer;
import ac.su.kdt.myfirstspring.manualdiexample.obj_cons_injection.Stage;

public class ConstructorInjectionMain {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Stage stage = new Stage(singer);
        Broadcast BrStation = Broadcast.getBroadcastingStation(stage);
        BrStation.startBroadcasting();
    }
}

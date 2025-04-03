package ac.su.kdt.myfirstspring.manualdiexample.main;

import ac.su.kdt.myfirstspring.manualdiexample.obj_setter_injection.Broadcast;
import ac.su.kdt.myfirstspring.manualdiexample.obj_setter_injection.Singer;
import ac.su.kdt.myfirstspring.manualdiexample.obj_setter_injection.Stage;

public class SetterInjectionMain {
    public static void main(String[] args) {
        // 의존성 니즈가 발생하는 객체들을 미리 생성
        Broadcast broadcast = new Broadcast();
        Stage stage = new Stage();
        Singer singer = new Singer();
        // 주입 작업을 한번에 처리, public 필드로 인한 문제 해결
        broadcast.setStage(stage);  // 아직 무대 객체 동작 불가능
        stage.setSinger(singer);  // 아직 공연자 객체 동작 불가능
        // 방송 송출 시작
        broadcast.startBroadcasting();
    }
}

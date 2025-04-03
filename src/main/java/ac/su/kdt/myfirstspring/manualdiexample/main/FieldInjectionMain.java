package ac.su.kdt.myfirstspring.manualdiexample.main;

import ac.su.kdt.myfirstspring.manualdiexample.obj_field_injection.Broadcast;
import ac.su.kdt.myfirstspring.manualdiexample.obj_field_injection.Singer;
import ac.su.kdt.myfirstspring.manualdiexample.obj_field_injection.Stage;

public class FieldInjectionMain {
    public static void main(String[] args) {
        // 객체를 주입받는 구조를 만들면 new 키워드를 포함한 코드 제어부가
        // 한군데 (main 메서드)로 집중됨
        Broadcast broadcast = new Broadcast();
        // 아직 무대 객체가 생성되지 않음
        broadcast.stage = new Stage();
        // 아직 공연자 객체가 생성되지 않음
        broadcast.stage.singer = new Singer();

        // 각 의존성 필드가 public -> 의도치 않은 변경 가능성
        // 트레이드 오프 요소 파악 필요!

        // 방송 송출 시작
        broadcast.startBroadcasting();
    }
}

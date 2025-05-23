package ac.su.kdt.myfirstspring.manualdiexample.obj_field_injection;

public class Broadcast {
    public Stage stage;

    // 방송국 객체가 생성될 때, 무대도 함께 생성
    public Broadcast() {
        System.out.println("방송국 생성");
    }

    // static 메서드
    public static void broadcastSelfDI() {
        Broadcast broadcastingStation = new Broadcast();
        broadcastingStation.startBroadcasting();
    }

    public void startBroadcasting() {
        // 아래 코드처럼 방송이 시작될 때 무대를 지으면 안됨
        // this.stage = new Stage();

        // 방송 시작 콘솔 출력 (방송 송출 로직 호출)
        System.out.println("방송 송출 시작");

        // 무대 공연으로 연결
        this.stage.startPerformance();
    }
}

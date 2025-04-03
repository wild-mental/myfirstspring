package ac.su.kdt.myfirstspring.obj_cons_injection;

public class Broadcast {
    private Stage stage;

    // 방송국 객체가 생성될 때, 무대도 함께 생성
    public Broadcast(Stage stage) {
        this.stage = stage;
        System.out.println("방송국 생성");
    }

    // 프레임워크 등에서 자동으로 주입해줄 수 있는 코드를 본 메서드로 대체함
    public static Broadcast getBroadcastingStation(Stage stage) {
        return new Broadcast(stage);
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

package ac.su.kdt.myfirstspring.manualdiexample.obj_self_depend_clear;

public class Singer {
    public Singer() {
        // 생성자에서 직접 의존성을 해소! (주입받는 것이 아님)
        System.out.println("가수 생성");
    }

    public void startSinging() {
        // 공연자 공연 시작
        System.out.println("가수가 노래를 부릅니다.");
    }
}

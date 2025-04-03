package ac.su.kdt.myfirstspring.obj_cons_injection;

public class Stage {
    // 공연자가 미리 준비되어 있어야 함
    private Singer singer;

    // 공연자가 무대에 올라가야 하므로, 생성자에서 공연자를 주입받음
    public Stage(Singer singer) {
        this.singer = singer;
        System.out.println("무대 생성");
    }

    public void startPerformance() {
        // 무대 공연이 시작될 때, 공연자가 함께 생성되면 안됨
        // this.singer = new Singer();

        // 공연 시작 콘솔 출력 (공연 송출 로직 호출)
        System.out.println("공연 시작");

        // 공연자 공연 시작
        this.singer.startSinging();
    }
}

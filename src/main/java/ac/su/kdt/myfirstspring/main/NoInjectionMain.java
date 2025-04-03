package ac.su.kdt.myfirstspring.main;

import ac.su.kdt.myfirstspring.obj_self_depend_clear.Broadcast;

// 각 객체에서 직접 의존성을 제어하도록 개발된 시나리오를 호출합니다.
// 여기에서는 IoC가 아니라 개발자의 직접 제어로 의존성을 주입합니다.
public class NoInjectionMain {
    public static void main(String[] args) {
        // Broadcast broadcast = new Broadcast();
        // 클래스가 Static 메서드 내에서 스스로의 의존성까지 해결하는 흐름 개발
        Broadcast.broadcastSelfDI();
    }
}

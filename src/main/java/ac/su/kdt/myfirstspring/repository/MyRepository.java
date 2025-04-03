package ac.su.kdt.myfirstspring.repository;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {
    // 생성자
    public MyRepository() {
        // 리포지토리 생성
        System.out.println("리포지토리 생성");
        doSomething();
    }

    public void doSomething() {
        // 리포지토리에서 하는 일
        System.out.println("리포지토리에서 무언가를 합니다.");
    }
}

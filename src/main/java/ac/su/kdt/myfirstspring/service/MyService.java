package ac.su.kdt.myfirstspring.service;

import ac.su.kdt.myfirstspring.repository.MyRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component // 스프링이 관리하는 Bean 으로 등록
public class MyService {
    // Field 주입
    @Autowired
    private final MyRepository myRepository;

    // 생성자 주입
//    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
        // 서비스 생성
        System.out.println("서비스 생성");
    }

    // Setter 주입
//    @Autowired
//    public void setMyRepository(MyRepository myRepository) {
//        this.myRepository = myRepository;
//        System.out.println("리포지토리를 Setter 방식으로 주입");
//    }

    // 주입받은 Bean 호출 예제
    public void callMyRepository() {
        System.out.println("리포지토리 호출");
        myRepository.doSomething();
    }

}

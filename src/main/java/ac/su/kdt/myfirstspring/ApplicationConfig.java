package ac.su.kdt.myfirstspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = MyfirstspringApplication.class)
public class ApplicationConfig {
    // 추가 설정이 필요한 경우 여기에 작성
}

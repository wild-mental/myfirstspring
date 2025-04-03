package ac.su.kdt.myfirstspring;

import ac.su.kdt.myfirstspring.manualdiexample.obj_cons_injection.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiCheckMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Singer singer = context.getBean(Singer.class);
        singer.startSinging();
    }
}

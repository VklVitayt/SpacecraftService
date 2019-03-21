
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import java.time.LocalTime;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.fly();
    }

    private int randomNumber() {
        int a = 1;
        int b = 3;
        int random_number = a + (int) (Math.random() * b);
        return random_number;
    }

    private void randomShuttle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            if (randomNumber() == 1) {
                Shuttle shuttle = (Shuttle) context.getBean("Venera");
                System.out.println(shuttle);
            } else if (randomNumber() == 2) {
                Shuttle shuttle = (Shuttle) context.getBean("Avrora");
                System.out.println(shuttle);
            } else {
                Shuttle shuttle = (Shuttle) context.getBean("Mars");
                System.out.println(shuttle);
            }

    }

    private void fly() throws InterruptedException {
        System.out.println("Экипаж шатла сформирован!");
        Thread.sleep(1000);
        randomShuttle();
        System.out.println("Начало обратного отсчёта:");
        for (int i = 10; i > -1; i--) {
            Thread.sleep(1000);
            String iString = String.valueOf(i);
            System.out.println(iString);
        }
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Время начала полета: " + localTime.toString());
    }
}


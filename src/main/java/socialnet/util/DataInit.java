package socialnet.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import socialnet.service.EmailService;

@Component
public class DataInit implements CommandLineRunner {

    private final EmailService emailService;

    public DataInit(EmailService emailService) {this.emailService = emailService;}

    @Override
    public void run(String... args) throws Exception {
//        this.emailService.sendSimpleMessage("...........", "test", "text");
    }
}

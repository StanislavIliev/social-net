package socialnet.service.impl;

import io.swagger.annotations.ApiModel;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import socialnet.models.entities.User;
import socialnet.repository.UserRepository;
import socialnet.service.EmailService;
import java.util.UUID;


@Service
@ApiModel(description = "Details about methods in the mail service.")
public class MailServiceImpl implements EmailService {

    private final JavaMailSender javaMailSender;
    private final UserRepository userRepository;

    public MailServiceImpl(JavaMailSender javaMailSender, UserRepository userRepository) {
        this.javaMailSender = javaMailSender;
        this.userRepository = userRepository;
    }


    @Override
    public void sendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("zstefchev2@gmail.com");
        message.setTo(to);
        message.setSubject("Request Reset Password");
        String uniqueString = generateString();
        message.setText("http://localhost:4200/response-reset/" + uniqueString);
        User user= this.userRepository.findUserByEmail(to).orElse(null);
        if(user !=null) {
            user.setConfirmLinkPassword(uniqueString);
            this.userRepository.saveAndFlush(user);
        }
        javaMailSender.send(message);
    }

    public static String generateString() {
        return UUID.randomUUID().toString();
    }
}

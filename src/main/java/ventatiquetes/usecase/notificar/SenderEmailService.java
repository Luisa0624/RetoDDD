package ventatiquetes.usecase.notificar;

public interface SenderEmailService {

    void sendEmail(String email, String content_body);
}

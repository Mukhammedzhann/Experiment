package Labka.Labka_4;

public class Test_Notification {
    public static void main(String[] args) {
        INotificationService emailService = new EmailService();
        Notification notification = new Notification(emailService);

        notification.send("Привет, это тестовое сообщение!");
    }
}

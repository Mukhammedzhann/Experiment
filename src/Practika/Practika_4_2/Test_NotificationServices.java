package Practika.Practika_4_2;

public class Test_NotificationServices {
    public static void main(String[] args) {
        NotificationServices emailNotification = new NotificationServices(new EmailSender());
        emailNotification.sendNotification("This is an email notification!");

        NotificationServices smsNotification = new NotificationServices(new SmsSender());
        smsNotification.sendNotification("This is an SMS notification!");
    }
}

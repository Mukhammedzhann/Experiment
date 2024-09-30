package Practika.Practika_4_2;

interface MessageSender {
    void sendMessage(String message);
}


class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}


class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}


class NotificationServices {
    private final MessageSender messageSender;


    public NotificationServices(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}


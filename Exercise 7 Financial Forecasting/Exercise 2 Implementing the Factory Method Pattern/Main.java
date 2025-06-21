public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new SMSNotificationFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser(); // Output: Sending an SMS notification

        factory = new EmailNotificationFactory();
        notification = factory.createNotification();
        notification.notifyUser(); // Output: Sending an Email notification
    }
}
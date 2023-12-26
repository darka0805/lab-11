package second;

public class Main {
    private static final int CLIENT_AGE = 18;

    public static void main(String[] args) {
        Client client = new Client("Darka", Client.Gender.FEMALE, CLIENT_AGE);
        MailInfo birthdayMail = new MailInfo(client, 1);
        MailInfo giftMail = new MailInfo(client, 2);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();
    }
}

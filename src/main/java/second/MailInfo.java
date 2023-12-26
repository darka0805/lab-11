package second;

import lombok.Getter;

@Getter
public class MailInfo {
    private final Client client;
    private final int mailCode;

    public MailInfo(Client client, int mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }
}
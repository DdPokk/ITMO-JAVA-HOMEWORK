package HOMEWORK6;

public class BankWorker extends Client {
    private final String bankName;

    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName, "���������");
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String getAllInfo() {
        return "��� ���������: " + getFirstName() + "\n������� ���������: " + getLastName() + "\n�������� �����: " + bankName;
    }
}

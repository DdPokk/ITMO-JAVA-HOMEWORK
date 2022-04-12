package HOMEWORK6;

public class BankWorker extends Client {
    private final String bankName;

    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName, "Альфабанк");
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String getAllInfo() {
        return "Имя работника: " + getFirstName() + "\nФамилия работника: " + getLastName() + "\nНазвание банка: " + bankName;
    }
}

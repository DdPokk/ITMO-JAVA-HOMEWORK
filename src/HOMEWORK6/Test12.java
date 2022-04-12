package HOMEWORK6;

public class Test12 {
    public static void main(String[] args) {
        Client client = new Client("Петров", "Петр", "Альфабанк");
        BankWorker employee = new BankWorker("Иван", "Иванов", "Сбербанк");
        System.out.println("--------");
        System.out.println(client.getFirstName());
        System.out.println(client.getLastName());
        System.out.println(client.getBankName());
        System.out.println(client.getAllInfo());
        System.out.println("--------");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getBankName());
        System.out.println(employee.getAllInfo());
        System.out.println("--------");
        infoPerson(client);
        infoPerson(employee);
    }

    public static void infoPerson(Person person) {
        System.out.println(person.getBankName());
        System.out.println(person.getAllInfo());
    }
}

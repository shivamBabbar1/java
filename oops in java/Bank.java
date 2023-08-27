import java.util.ArrayList;

public class Bank {
    private static ArrayList<Account> accountBook = new ArrayList<Account>();

    public static void addAc(Account Ac) {
        accountBook.add(Ac);
    }

    public static void removeAc(Account Ac) {
        accountBook.remove(Ac);
    }

    public static void allAccounts() {
        int n = 1;
        for (Account ac : accountBook) {
            System.out.println("Account number : " + n + " : " + ac.name + " : " + ac.id + " : " + ac.accountNo
                    + " total balance ; " + ac.money);

            n++;
        }
    }

    public static void main(String[] args) {
        Account p1 = new Account("rahul", "a22", 24, 500000.0);
        Account p2 = new Account("govind", "a42", 2004, 100000.0);
        Bank.addAc(p1);
        Bank.addAc(p2);
        // Bank.allAccounts();
        // Bank.removeAc(p1);
        // Bank.allAccounts();
        System.out.println(p1.getDetail());
        p1.deposit(100000.0);
        System.out.println(p1.getDetail());
        p1.withdraw(590100);
        System.out.println(p1.getDetail());

    }
}

class Account extends Bank {
    String name, id;
    int accountNo;
    double money;

    Account(String name, String id, int accountNo, double money) {
        this.name = name;
        this.id = id;
        this.accountNo = accountNo;
        this.money = money;

    }

    public void deposit(double money) {
        System.out.println(money + " : is deposit in your account");
        this.money = this.money + money;
    }

    public void withdraw(double money) {
        System.out.println(money + " : is withdraw from your account");
        this.money = this.money - money;
    }

    public String getDetail() {
        // String a = String.valueOf(accountNo);
        return "Name : " + name + ", id : " + id + ", Account No. : " + accountNo + " total balance ; " + money;
    }
}
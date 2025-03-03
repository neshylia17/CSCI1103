package practice;

public class bankAccount {
   
        // Parameters
        public static int userCount;

        public String name;

        private String userName;
        private String password;

        private double balance;

        private int pin;

        // Constructors
        public bankAccount(String name, String userName, String password, int pin) {
            userCount++;
            this.name = name;
            this.userName = name;
            this.password = password;
            this.pin = pin;
            this.balance = 0;
        }

        public bankAccount() {
            this.name = "Guest";
            this.userName = "Guest";
            this.password = "";
            this.pin = 1234;
            this.balance = 0;
        }

        // Methods
        public String getUserName() {
            return this.userName;
        }

        public void setUserName(String password, String newUserName) {
            if (password == this.password) {
                this.userName = newUserName;
            } else {
                System.out.println("Not logged in");
            }
        }

        public String getPassword(String password) {
            if (password == this.password) {
                return this.password;
            } else {
                System.out.println("Not logged in");
                return "";
            }
        }

        public void setPassword(String password, String newPassword) {
            if (password == this.password) {
                this.password = newPassword;
            } else {
                System.out.println("Not logged in");
            }
        }

        public double getBalance(String password) {
            if (password == this.password) {
                return this.balance;
            } else {
                System.out.println("Not logged in");
                return 0;
            }
        }

        public double deposit(String password, double amount) {
            if (password == this.password) {
                this.balance += amount;
                return this.balance;
            }
            return 0;
        }

        public double currencyTransfer(double euros) {
            // 1 euro = 1.05 * 1 dollar
            return euros / 1.05;
        }

        // Main
        public static void main(String[] args) {
            // Instantiation
            bankAccount natesAccount = new bankAccount("Nate", "nates", "testing", 3456);
            System.out.println(natesAccount.getBalance("testing"));
            natesAccount.deposit("testing", 1000);

            bankAccount jasonsAccount = new bankAccount("Jason", "jasonj", "543", 5432);
            jasonsAccount.deposit("543", 100);

            bankAccount ashersAccount = new bankAccount("Asher", "Ashers", "asheriscool", 2);
            ashersAccount.deposit("asheriscool", 1);

            System.out.println(jasonsAccount.getBalance("543"));
            System.out.println(natesAccount.getBalance("testing"));
            System.out.println(ashersAccount.getBalance("asheriscool"));

            System.out.println(bankAccount.userCount);

        }
 }


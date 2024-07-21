package databaseconnectionmanager;

public class Main {
        public static void main(String[] args) {
       DatabaseConnectionManager dbM1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager dbM2 = DatabaseConnectionManager.getInstance();

        System.out.println("dbM1 == dbM2: " + (dbM1 == dbM2)); // True

        dbM2.connect();
        System.out.println("Is connected: " + dbM2.isConnected());

        dbM2.disconnect();
        System.out.println("Is connected: " + dbM2.isConnected());      
    }
}

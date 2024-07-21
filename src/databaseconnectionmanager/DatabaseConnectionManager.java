package databaseconnectionmanager;

class DatabaseConnectionManager {
   private static DatabaseConnectionManager instance;
   private boolean connected;
 
   private DatabaseConnectionManager() {
       System.out.println("Database Connection Manager instance created.");
    }
   
   public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
            instance.connected = true;
        }
        return instance;
    }
   
     public void connect() {
        if (connected) {
            System.out.println("Already connected to the database.");
        } else {
            connected = true;
            System.out.println("Connected to the database.");
        }
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected from the database.");
        } else {
            System.out.println("No active database connection to disconnect.");
        }
    }

    public boolean isConnected() {
        return connected;
    }
}

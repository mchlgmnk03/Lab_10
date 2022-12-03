package task1;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        User oles = new User("Oles", "dobosevych@ucu.edu.ua", 31);
        oles.setDb(db);
        oles.save();
    }
}

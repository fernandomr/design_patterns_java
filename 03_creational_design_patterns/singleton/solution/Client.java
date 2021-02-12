package singleton.solution;

public class Client {
    
    public static void main(String[] args){

        Preferences p = Preferences.getInstance();
        p.helloSingleton();
        System.out.println("Test message begin is: " + p.aTestMessage);
        p.aTestMessage = "First instance";
        System.out.println(p.aTestMessage);
        
        Preferences p2 = Preferences.getInstance();
        System.out.println("Test message begin is: " + p2.aTestMessage);
        
        // change on p2 reflects on p1:
        p2.aTestMessage = "Second test message";
        System.out.println(p.aTestMessage);
        
        /*
         * MyPreferences extends Preferences, and as such is a singleton
         * And as we can observe, it gets the same message as defined in p2.aTestMessage
         */
        System.out.println(MyPreferences.getInstance().aTestMessage);
    }

}
package singleton;

public class Client {
    
    public static void main(String[] args){

        System.out.println(Preferences.globalPreferences.getPreferenceDetail());

        Preferences secondPreference = new Preferences("second preference");

        Preferences.globalPreferences = secondPreference;

        System.out.println(Preferences.globalPreferences.getPreferenceDetail());
    }

}
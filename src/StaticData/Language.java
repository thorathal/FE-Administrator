package StaticData;

/**
 * @author Bjarke Carlsen
 * Controls the language Strings of the program
 */
public class Language {
    
    // Current Language
    public static String currentLanguage = "Dansk";
    
    // Languages
    public static String language;
    public final static String english = "English";
    public final static String danish = "Dansk";

    
    // Create
        
        
        // Edit
        
        
        // Customer
    
    public static void setLanguage(String language) {
        System.out.println("Language.changeLanguage - starting");
        switch (language) {
            case english: English.initialize();
            System.out.println("English");
            break;
            case danish:  Danish.initialize();
            System.out.println("Dansk"); 
            break;
        }
        currentLanguage = language;
    }
    
}

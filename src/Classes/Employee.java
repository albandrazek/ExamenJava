package Classes;

/**
 * Cette classe Employee permet de créer un employé dans une entreprise.
 * Chacun des employés a un prénom, un nom, un nombre d'années d'expérience et un niveau de classement
 * junior, intermediare et senior.
 */
public class Employee {
    private String prenom;
    private String nom;
    private String niveau;
    private int anneesExperience;
    
    
    /**
     * Ceci est le constructeur de la classe Employee. il prend en compte plusieurs paramètres
     * @param prenom Le prénom de l'employé.
     * @param nom Le nom de l'employé.
     * @param anneesExperience Le nombre d'années d'expérience dans l'entreprise.
     * @param niveau Le niveau de l'employé (Junior, Intermédiaire, Sénior).
     */
    
    public Employee(String prenom, String nom, String niveau, int anneesExperience ) {
        this.prenom = prenom;
    	this.nom = nom;
        this.niveau = niveau;
        this.anneesExperience = anneesExperience;
    }

    /**
     * Il y a en dessous les getters et les setters qui permettent l'accès aux données
     * 
     */

    public String getPrenom() {
        return prenom;
    }
    
    public String getNom() {
        return nom;
    }
    public String getNiveau() {
        return niveau;
    }

    public int getAnneesExperience() {
        return anneesExperience;
    }

    
}

package Classes;

/**
 * La classe EmployeeManager gère les employés d'une entreprise.
 * Elle peut calculer le salaire d'un employé et son coefficient selon son expérience.
 */
public class EmployeeManager {
	
	

	/**
     * La méthode ci-dessous alcule le salaire d'un employé.
     * @param employee L'employé pour lequel calculer le salaire.
     * @return Le salaire de l'employé.
     * @throws IllegalArgumentException Si le niveau de l'employé est incorrect.
     */
	
    public double calculateSalary(Employee employee) {
        double BaseSalaire;
        switch (employee.getNiveau()) {
            case "Junior":
            	BaseSalaire = 20000;
                break;
            case "Intermediaire":
            	BaseSalaire = 40000;
                break;
            case "Senior":
            	BaseSalaire = 60000;
                break;
            default:
                throw new IllegalArgumentException("Le niveau est incorrect");
        }
        return BaseSalaire;
    }
    
    public double calculateExperienceMultiplier(int anneesExperience) {
        return 1 + (anneesExperience * 0.05);
    }
}

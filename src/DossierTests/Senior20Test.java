package DossierTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Classes.Employee;
import Classes.EmployeeManager;

/**
 * Test de la classe Senior20Test.
 * Elle test si le calcul du salaire est correct selon les paramètres renseignés (20ans dans ce cas).
 */
public class Senior20Test {
    @Test
    public void testSalaireJuniorAvec1AnExperience() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("Alban", "Drazek", "Senior", 20);
        double salaireAttendu = 20000 * 1.05; // augmentation de 5% pour 1 an
        assertEquals(salaireAttendu, manager.calculateSalary(employee), "Calcul de salaire incorrect");
    }
}

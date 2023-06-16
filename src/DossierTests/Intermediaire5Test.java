package DossierTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Classes.Employee;
import Classes.EmployeeManager;

/**
 * Test de la classe Intermediaire5Test.
 * Elle test si le calcul du salaire est correct selon les paramètres renseignés (5ans dans ce cas).
 */
public class Intermediaire5Test {
    @Test
    public void testSalaireJuniorAvec1AnExperience() {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee("Alban", "Drazek", "Intermediaire", 5);
        double salaireAttendu = 20000 * 1.05; // augmentation de 5% pour 1 an
        assertEquals(salaireAttendu, manager.calculateSalary(employee), "Calcul de salaire incorrect");
    }
}

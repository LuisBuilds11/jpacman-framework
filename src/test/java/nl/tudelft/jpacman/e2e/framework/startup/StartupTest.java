package nl.tudelft.jpacman.e2e.framework.startup;

import io.cucumber.junit.platform.engine.Cucumber;

/**
 * Clase de integración para ejecutar los tests de Cucumber.
 * Compatible con Cucumber 7+ y JUnit 5.
 *
 * Nota:
 * - No se usa @RunWith ni @CucumberOptions de JUnit 4.
 * - La configuración de features y glue se define en src/test/resources/cucumber.properties
 */
@Cucumber
public class StartupTest {
    // Esta clase queda vacía; Cucumber se encarga de ejecutar todos los features.
}



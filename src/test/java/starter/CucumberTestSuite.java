package starter; // Define el paquete al que pertenece esta clase

import org.junit.platform.suite.api.ConfigurationParameter; // Importa la anotación para parámetros de configuración en JUnit Platform
import org.junit.platform.suite.api.IncludeEngines; // Importa la anotación para incluir motores en la suite en JUnit Platform
import org.junit.platform.suite.api.SelectClasspathResource; // Importa la anotación para seleccionar recursos de classpath en JUnit Platform
import org.junit.platform.suite.api.Suite; // Importa la anotación para definir una suite de pruebas en JUnit Platform

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME; // Importa la constante PLUGIN_PROPERTY_NAME de Cucumber

@Suite // Anotación para indicar que esta clase es una suite de pruebas
@IncludeEngines("cucumber") // Indica que la suite debe incluir el motor "cucumber"
@SelectClasspathResource("/features") // Selecciona los recursos del classpath que se utilizarán para las pruebas (carpeta /features)
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
// Configura parámetros para la suite de pruebas, en este caso, relacionados con el plugin SerenityReporterParallel de Cucumber y la generación de informes
public class CucumberTestSuite { // Declara la clase CucumberTestSuite que representa la suite de pruebas

}

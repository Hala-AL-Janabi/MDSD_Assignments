/**
 * generated by Xtext 2.25.0
 */
package assignment3;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MathStandaloneSetup extends MathStandaloneSetupGenerated {
  public static void doSetup() {
    new MathStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

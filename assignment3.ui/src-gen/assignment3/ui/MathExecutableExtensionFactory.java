/*
 * generated by Xtext 2.25.0
 */
package assignment3.ui;

import assignment3.ui.internal.Assignment3Activator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MathExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Assignment3Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Assignment3Activator activator = Assignment3Activator.getInstance();
		return activator != null ? activator.getInjector(Assignment3Activator.ASSIGNMENT3_MATH) : null;
	}

}

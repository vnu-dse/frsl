/*
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.sme.frsl.ui.internal.FRSLActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FRSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FRSLActivator.getInstance().getInjector("org.eclipse.sme.frsl.FRSL");
	}

}

/*
 * generated by Xtext 2.25.0
 */
package assignment3.scoping

import assignment3.math.LetBinding
import assignment3.math.MathExp
import assignment3.math.VariableUse
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MathScopeProvider extends AbstractMathScopeProvider {

	override getScope(EObject context, EReference reference) {
		return context.scopeForEObject(reference)
	}
	
	def dispatch scopeForEObject(EObject context, EReference reference) {
		return super.getScope(context, reference)
	}
	
	def dispatch scopeForEObject(VariableUse varUse, EReference reference) {
		varUse.scopeForVarUse
	}
	
	def IScope scopeForVarUse(EObject context) {
		val container = context.eContainer
		switch container {
			LetBinding: {
				if(container.binding == context)
					container.scopeForVarUse
				else
					Scopes.scopeFor(#[container], container.scopeForVarUse)
			}
			MathExp: Scopes.scopeFor(container.variables.filter[it != context])
			default: container.scopeForVarUse
		}
	}
}


/**
 *
 */

package infrastructurelibrary.core.abstractions.constraints;

import infrastructurelibrary.core.abstractions.namespaces.NamedElement;

/**
 * Associations
 * <ul>
 * <li>constrainedElement: Element[*]</li>
 * The ordered set of Elements referenced by this Constraint.
 * <li>context: Namespace [0..1]</li>
 * Specifies the Namespace that is the context for evaluating this constraint.
 * Subsets NamedElement::namespace.
 * <li>specification: ValueSpecification[1]</li>
 * A condition that must be true when evaluated in order for the constraint to
 * be satisfied. Subsets Element::ownedElement.
 * </ul>
 *
 * @author oalpha
 *
 */
public interface Constraint extends NamedElement {

  //
  
}
/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.typedelements;

/**
 * A typed element has a type.
 *
 * <h2>Description</h2>
 *
 * A typed element is an element that has a type that serves as a constraint on
 * the range of values the element can represent. Typed element is an abstract
 * metaclass.
 *
 * <h2>Associations</h2>
 * <ul>
 * <li>type: Type [0..1]</li>
 * <p>
 * The type of the TypedElement.
 * </p>
 * </ul>
 *
 * <h2>Semantics</h2>
 *
 * Values represented by the element are constrained to be instances of the
 * type. A typed element with no associated type may represent values of any
 * type.
 *
 * @author oalpha
 */
public interface TypedElement {

}
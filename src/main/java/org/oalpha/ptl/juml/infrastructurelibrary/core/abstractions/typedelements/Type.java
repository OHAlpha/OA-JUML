/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.typedelements;

/**
 * A type constrains the values represented by a typed element.
 *
 * <h2>Description</h2>
 *
 * A type serves as a constraint on the range of values represented by a typed
 * element. Type is an abstract metaclass.
 *
 * <h2>Additional Operations</h2>
 * <ol>
 * <li>The query conformsTo() gives true for a type that conforms to another. By
 * default, two types do not conform to each other. This query is intended to be
 * redefined for specific conformance situations.</li>
 *
 * <pre>
 * conformsTo(other: Type): Boolean;
 * conformsTo = false
 * </pre>
 *
 * </ol>
 *
 * <h2>Semantics</h2> A type represents a set of values. A typed element that
 * has this type is constrained to represent values within this set.
 *
 * @author oalpha
 */
public interface Type {

  boolean conformsTo( Type other );

}
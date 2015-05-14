/**
 *
 */

package infrastructurelibrary.core.abstractions.namespaces;

import java.util.Set;

import primitivetypes.Boolean;
import primitivetypes.String;

/**
 * Associations
 * <ul>
 * <li>member: NamedElement [*]</li>
 * A collection of NamedElements identifiable within the Namespace, either by
 * being owned or by being introduced by importing or inheritance. This is a
 * derived union.
 * <li>ownedMember: NamedElement [*]</li>
 * A collection of NamedElements owned by the Namespace. Subsets
 * Element::ownedElement and Namespace::member. This is a derived union.
 * </ul>
 *
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Namespace extends NamedElement {

  Set< String > getNamesOfMember();
  
  Boolean membersAreDistinguishable();
  
}
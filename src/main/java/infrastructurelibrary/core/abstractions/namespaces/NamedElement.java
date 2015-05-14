/**
 *
 */

package infrastructurelibrary.core.abstractions.namespaces;

import infrastructurelibrary.core.abstractions.ownerships.Element;

import java.util.List;

import primitivetypes.Boolean;
import primitivetypes.String;

/**
 * Associations
 * <ul>
 * <li>namespace: Namespace [0..1]</li>
 * Specifies the namespace that owns the NamedElement. Subsets Element::owner.
 * This is a derived union.
 * </ul>
 *
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface NamedElement extends Element {
  
  List< Namespace > allNamespaces();
  
  Boolean isDistinguishableFrom( NamedElement n, Namespace ns );

  String separator();
  
}
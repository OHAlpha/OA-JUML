/**
 *
 */

package infrastructurelibrary.core.abstractions.ownerships;

import java.util.Set;

import primitivetypes.Boolean;

/**
 * Associations
 * <ul>
 * <li>ownedElement: Element[*]</li>
 * The Elements owned by this element. This is a derived union.
 * <li>owner: Element [0..1]</li> The Element that owns this element. This is a
 * derived union.
 * <ul>
 *
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Element extends
infrastructurelibrary.core.abstractions.elements.Element {
  
  /**
   * TODO: type is Set belonging to PrimitiveTypes
   *
   * @return
   */
  Set< Element > allOwnedElements();

  Boolean mustBeOwned();
  
}
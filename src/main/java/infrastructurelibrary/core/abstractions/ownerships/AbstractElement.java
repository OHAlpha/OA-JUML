/**
 *
 */

package infrastructurelibrary.core.abstractions.ownerships;

import java.util.Set;

import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
public abstract class AbstractElement implements Element {
  
  /**
   *
   */
  public AbstractElement() {
    
    // TODO Auto-generated constructor stub
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.Element#allOwnedElements()
   */
  @Override
  public Set< Element > allOwnedElements() {
    
    // TDOD: allOwnedElements = ownedElement->union(ownedElement->collect(e |
    // e.allOwnedElements()))
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.Element#mustBeOwned()
   */
  @Override
  public Boolean mustBeOwned() {

    return Boolean.True;
  }
  
}
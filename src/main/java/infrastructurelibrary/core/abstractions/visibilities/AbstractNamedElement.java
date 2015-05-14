/**
 *
 */

package infrastructurelibrary.core.abstractions.visibilities;

import infrastructurelibrary.core.abstractions.ownerships.AbstractElement;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractNamedElement extends AbstractElement implements
NamedElement {

  protected VisibilityKind visibility;

  /**
   *
   */
  public AbstractNamedElement() {

    // TODO Auto-generated constructor stub
  }

}

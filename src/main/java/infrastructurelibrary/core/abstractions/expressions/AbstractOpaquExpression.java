/**
 *
 */

package infrastructurelibrary.core.abstractions.expressions;

import infrastructurelibrary.core.abstractions.ownerships.AbstractElement;
import primitivetypes.String;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractOpaquExpression extends AbstractElement implements
OpaqueExpression {
  
  protected String[] Body;
  
  protected String[] language;
  
  /**
   *
   */
  public AbstractOpaquExpression() {
    
    // TODO Auto-generated constructor stub
  }
  
}
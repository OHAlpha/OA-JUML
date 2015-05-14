/**
 *
 */

package infrastructurelibrary.core.abstractions.comments;

import infrastructurelibrary.core.abstractions.ownerships.AbstractElement;
import primitivetypes.String;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractComment extends AbstractElement implements
Comment {
  
  protected String body;
  
  /**
   *
   */
  public AbstractComment() {
    
    // TODO Auto-generated constructor stub
  }
  
}
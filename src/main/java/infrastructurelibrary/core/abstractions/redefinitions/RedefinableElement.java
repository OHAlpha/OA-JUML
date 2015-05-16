/**
 *
 */

package infrastructurelibrary.core.abstractions.redefinitions;

import infrastructurelibrary.core.abstractions.namespaces.NamedElement;
import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface RedefinableElement extends NamedElement {
  
  Boolean isConsistentWith( RedefinableElement redefinee );
  
  Boolean isRedefinitionContexValid( RedefinableElement redefinable );
  
}

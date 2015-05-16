/**
 *
 */

package infrastructurelibrary.core.abstractions.typedelements;

import infrastructurelibrary.core.abstractions.namespaces.NamedElement;
import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Type extends NamedElement {
  
  Boolean conformsTo( Type other );
  
}
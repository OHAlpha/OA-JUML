/**
 *
 */

package infrastructurelibrary.core.abstractions.generalizations;

import java.util.Set;

import primitivetypes.Boolean;

/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Classifier extends
infrastructurelibrary.core.abstractions.supers.Classifier {
  
  Boolean conformsTo( Classifier other );
  
  @Override
  Set<Classifier> parents();
  
}
/**
 *
 */

package infrastructurelibrary.core.abstractions.multiplicities;

import infrastructurelibrary.core.abstractions.elements.Element;
import primitivetypes.Boolean;
import primitivetypes.Integer;
import primitivetypes.UnlimitedNatural;

/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface MultiplicityElement extends Element {

  Boolean includesCardinality( Integer C );

  Boolean includesMultiplicity( MultiplicityElement M );

  Boolean isMultivalued();
  
  Integer lowerBound();
  
  UnlimitedNatural upperBound();

}
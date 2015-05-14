/**
 *
 */

package infrastructurelibrary.core.abstractions.expressions;

import infrastructurelibrary.core.abstractions.ownerships.Element;
import primitivetypes.Boolean;
import primitivetypes.Integer;
import primitivetypes.Real;
import primitivetypes.String;
import primitivetypes.UnlimitedNatural;

/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface ValueSpecification extends Element {

  Boolean[] booleanValue();

  Integer[] integerValue();

  Boolean isComputable();

  Boolean isNull();

  Real[] realValue();

  String[] stringValue();

  UnlimitedNatural[] unlimitedValue();

}
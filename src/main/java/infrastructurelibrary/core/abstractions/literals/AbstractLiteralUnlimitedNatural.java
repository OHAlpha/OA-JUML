/**
 *
 */

package infrastructurelibrary.core.abstractions.literals;

import infrastructurelibrary.core.abstractions.expressions.AbstractValueSpecification;
import oalpha.OAlpha;
import primitivetypes.Boolean;
import primitivetypes.UnlimitedNatural;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractLiteralUnlimitedNatural extends AbstractValueSpecification
implements LiteralBoolean {
  
  UnlimitedNatural value;

  /**
   *
   */
  public AbstractLiteralUnlimitedNatural() {

    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.expressions.ValueSpecification#
   * isComputable()
   */
  @Override
  public Boolean isComputable() {

    return Boolean.True;
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.expressions.ValueSpecification#
   * isNull()
   */
  @OAlpha
  @Override
  public Boolean isNull() {

    return Boolean.valueOf( this.value == null );
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.expressions.AbstractValueSpecification
   * #booleanValue()
   */
  @Override
  public UnlimitedNatural[] unlimitedValue() {

    return new UnlimitedNatural[] {
        this.value
    };
  }

}
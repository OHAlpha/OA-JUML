/**
 *
 */

package infrastructurelibrary.core.abstractions.literals;

import infrastructurelibrary.core.abstractions.expressions.AbstractValueSpecification;
import oalpha.OAlpha;
import primitivetypes.Boolean;
import primitivetypes.Real;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractLiteralReal extends AbstractValueSpecification
implements LiteralBoolean {
  
  Real value;

  /**
   *
   */
  public AbstractLiteralReal() {

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
  public Real[] realValue() {

    return new Real[] {
        this.value
    };
  }

}
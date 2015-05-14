/**
 *
 */

package infrastructurelibrary.core.abstractions.literals;

import infrastructurelibrary.core.abstractions.expressions.AbstractValueSpecification;
import oalpha.OAlpha;
import primitivetypes.Boolean;
import primitivetypes.Integer;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractLiteralInteger extends AbstractValueSpecification
    implements LiteralInteger {
  
  Integer value;

  /**
   *
   */
  public AbstractLiteralInteger() {

    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.expressions.AbstractValueSpecification
   * #booleanValue()
   */
  @Override
  public Integer[] integerValue() {

    return new Integer[] {
        this.value
    };
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

}
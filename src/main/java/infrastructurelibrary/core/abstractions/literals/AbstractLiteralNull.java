/**
 *
 */

package infrastructurelibrary.core.abstractions.literals;

import infrastructurelibrary.core.abstractions.expressions.AbstractValueSpecification;
import oalpha.OAlpha;
import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
public abstract class AbstractLiteralNull extends AbstractValueSpecification
implements LiteralBoolean {

  /**
   *
   */
  public AbstractLiteralNull() {

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

    return Boolean.True;
  }

}
/**
 *
 */

package infrastructurelibrary.core.abstractions.expressions;

import infrastructurelibrary.core.abstractions.ownerships.AbstractElement;
import primitivetypes.Boolean;
import primitivetypes.Integer;
import primitivetypes.Real;
import primitivetypes.String;
import primitivetypes.UnlimitedNatural;


/**
 * @author oalpha
 *
 */
public abstract class AbstractValueSpecification extends AbstractElement
    implements
ValueSpecification {

  /**
   *
   */
  public AbstractValueSpecification() {

    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.expressions.ValueSpecification#booleanValue()
   */
  @Override
  public Boolean[] booleanValue() {
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.expressions.ValueSpecification#integerValue()
   */
  @Override
  public Integer[] integerValue() {
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.expressions.ValueSpecification#realValue()
   */
  @Override
  public Real[] realValue() {
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.expressions.ValueSpecification#stringValue()
   */
  @Override
  public String[] stringValue() {
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.expressions.ValueSpecification#unlimitedValue()
   */
  @Override
  public UnlimitedNatural[] unlimitedValue() {
    return null;
  }

}
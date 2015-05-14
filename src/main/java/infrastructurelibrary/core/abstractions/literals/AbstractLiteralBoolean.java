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
@SuppressWarnings( "javadoc" )
public abstract class AbstractLiteralBoolean extends AbstractValueSpecification
implements LiteralBoolean {

  Boolean value;
  
  /**
   *
   */
  public AbstractLiteralBoolean() {
    
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
  public Boolean[] booleanValue() {
  
    return new Boolean[] {
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
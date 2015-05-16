/**
 *
 */

package infrastructurelibrary.core.basic;

import java.util.Collection;

import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractClass implements Class {

  protected Boolean isAbstract;

  protected Collection< Property > ownedAttribute;

  protected Collection< Operation > ownedOperation;

  protected Collection< Class > superClass;

  /**
   *
   */
  public AbstractClass() {

    // TODO Auto-generated constructor stub
  }

}
/**
 *
 */

package infrastructurelibrary.core.basic;

import infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement;
import infrastructurelibrary.core.abstractions.ownerships.Element;

import java.util.Set;

import primitivetypes.Boolean;
import primitivetypes.Integer;
import primitivetypes.UnlimitedNatural;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractParameter implements Parameter {

  protected Operation operation;

  /**
   *
   */
  public AbstractParameter() {

    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.ownerships.Element#allOwnedElements()
   */
  @Override
  public Set< Element > allOwnedElements() {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement#includesCardinality(primitivetypes.Integer)
   */
  @Override
  public Boolean includesCardinality( Integer C ) {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement#includesMultiplicity(infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement)
   */
  @Override
  public Boolean includesMultiplicity( MultiplicityElement M ) {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement#isMultivalued()
   */
  @Override
  public Boolean isMultivalued() {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement#lowerBound()
   */
  @Override
  public Integer lowerBound() {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.ownerships.Element#mustBeOwned()
   */
  @Override
  public Boolean mustBeOwned() {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement#upperBound()
   */
  @Override
  public UnlimitedNatural upperBound() {

    // TODO Auto-generated method stub
    return null;
  }

}

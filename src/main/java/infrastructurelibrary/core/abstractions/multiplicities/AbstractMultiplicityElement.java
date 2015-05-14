/**
 *
 */

package infrastructurelibrary.core.abstractions.multiplicities;

import primitivetypes.Boolean;
import primitivetypes.Integer;
import primitivetypes.UnlimitedNatural;

/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractMultiplicityElement implements
MultiplicityElement {

  protected Boolean isOrdered;

  protected Boolean isUnique;

  /**
   * TODO: type is Integer from PrimitiveTypes
   *
   */
  protected Integer lower;

  /**
   * TODO: type is UnlimitedNatural
   *
   */
  protected UnlimitedNatural upper;

  /**
   *
   */
  public AbstractMultiplicityElement() {

    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement
   * #includesCardinality(java.lang.Integer)
   */
  @Override
  public Boolean includesCardinality( Integer C ) {

    return Boolean.valueOf( this.lowerBound().compareTo( C ) <= 0
        && this.upperBound().compareToInteger( C ) >= 0 );
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement
   * #includesMultiplicity
   * (infrastructurelibrary.core.abstractions.multiplicities
   * .MultiplicityElement)
   */
  @Override
  public Boolean includesMultiplicity( MultiplicityElement M ) {

    return Boolean.valueOf( this.lowerBound().compareTo( M.lowerBound() ) <= 0
        && this.upperBound().compareTo( M.upperBound() ) >= 0 );
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement
   * #isMultivalued()
   */
  @Override
  public Boolean isMultivalued() {

    return Boolean.valueOf( this.upperBound().intValue() > 1 );
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement
   * #lowerBound()
   */
  @Override
  public Integer lowerBound() {

    return this.lower == null ? Integer.valueOf( 1 ) : this.lower;
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.multiplicities.MultiplicityElement
   * #upperBound()
   */
  @Override
  public UnlimitedNatural upperBound() {

    return this.upper == null ? UnlimitedNatural.valueOf( 1 ) : this.upper;
  }

}
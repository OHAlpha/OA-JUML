/**
 *
 */

package infrastructurelibrary.core.basic;

import infrastructurelibrary.core.abstractions.namespaces.NamedElement;
import infrastructurelibrary.core.abstractions.namespaces.Namespace;
import infrastructurelibrary.core.abstractions.ownerships.Element;

import java.util.List;
import java.util.Set;

import primitivetypes.Boolean;
import primitivetypes.String;


/**
 * @author oalpha
 *
 */
public abstract class AbstractType implements Type {

  protected Package pack;

  /**
   *
   */
  public AbstractType() {

    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.namespaces.NamedElement#allNamespaces()
   */
  @Override
  public List< Namespace > allNamespaces() {

    // TODO Auto-generated method stub
    return null;
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
   * @see infrastructurelibrary.core.abstractions.typedelements.Type#conformsTo(infrastructurelibrary.core.abstractions.typedelements.Type)
   */
  @Override
  public Boolean conformsTo(
      infrastructurelibrary.core.abstractions.typedelements.Type other ) {

    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.namespaces.NamedElement#isDistinguishableFrom(infrastructurelibrary.core.abstractions.namespaces.NamedElement, infrastructurelibrary.core.abstractions.namespaces.Namespace)
   */
  @Override
  public Boolean isDistinguishableFrom( NamedElement n, Namespace ns ) {

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
   * @see infrastructurelibrary.core.abstractions.namespaces.NamedElement#separator()
   */
  @Override
  public String separator() {

    // TODO Auto-generated method stub
    return null;
  }

}

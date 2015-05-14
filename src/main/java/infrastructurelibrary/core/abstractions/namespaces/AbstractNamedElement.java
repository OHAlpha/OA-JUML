/**
 *
 */

package infrastructurelibrary.core.abstractions.namespaces;

import infrastructurelibrary.core.abstractions.ownerships.AbstractElement;

import java.util.List;

import primitivetypes.Boolean;
import primitivetypes.String;

/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractNamedElement extends AbstractElement implements
NamedElement {

  protected String name;

  protected String qualifiedName;

  /**
   *
   */
  public AbstractNamedElement() {

    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.namespaces.NamedElement#allNamespaces
   * ()
   */
  @Override
  public List< Namespace > allNamespaces() {

    // TODO NamedElement::allNamespaces(): Sequence(Namespace);
    // allNamespaces =
    // if self.namespace->isEmpty()
    // then Sequence{}
    // else self.namespace.allNamespaces()->prepend(self.namespace)
    // endif
    return null;
  }

  /*
   * (non-Javadoc)
   *
   * @see infrastructurelibrary.core.abstractions.namespaces.NamedElement#
   * isDistinguishableFrom
   * (infrastructurelibrary.core.abstractions.namespaces.NamedElement,
   * infrastructurelibrary.core.abstractions.namespaces.Namespace)
   */
  @Override
  public Boolean isDistinguishableFrom( NamedElement n, Namespace ns ) {

    // TODO NamedElement::isDistinguishableFrom(n:NamedElement, ns: Namespace):
    // Boolean;
    // isDistinguishable =
    // if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)
    // then
    // ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
    // else true
    // endif
    return null;
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * infrastructurelibrary.core.abstractions.namespaces.NamedElement#separator()
   */
  @Override
  public String separator() {
  
    return String.valueOf( "::" );
  }

}
/**
 *
 */

package infrastructurelibrary.core.abstractions.supers;

import infrastructurelibrary.core.abstractions.classifiers.Feature;
import infrastructurelibrary.core.abstractions.namespaces.NamedElement;
import infrastructurelibrary.core.abstractions.namespaces.Namespace;
import infrastructurelibrary.core.abstractions.visibilities.AbstractNamedElement;

import java.util.List;
import java.util.Set;

import primitivetypes.Boolean;
import primitivetypes.String;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public abstract class AbstractClassifier extends AbstractNamedElement implements
Classifier {
  
  protected Boolean isAbstract;
  
  /**
   *
   */
  public AbstractClassifier() {
    
    // TODO Auto-generated constructor stub
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.classifiers.Classifier#allFeatures()
   */
  @Override
  public Set< Feature > allFeatures() {
    
    // TODO Auto-generated method stub
    return null;
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
   * @see infrastructurelibrary.core.abstractions.supers.Classifier#allParents()
   */
  @Override
  public Set< Classifier > allParents() {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.namespaces.Namespace#getNamesOfMember()
   */
  @Override
  public Set< String > getNamesOfMember() {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.supers.Classifier#hasVisibilityOf(infrastructurelibrary.core.abstractions.visibilities.NamedElement)
   */
  @Override
  public Boolean hasVisibilityOf(
      infrastructurelibrary.core.abstractions.visibilities.NamedElement n ) {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.supers.Classifier#inherit(java.util.Set)
   */
  @Override
  public
  Set< infrastructurelibrary.core.abstractions.visibilities.NamedElement >
  inherit(
      Set< infrastructurelibrary.core.abstractions.visibilities.NamedElement > inhs ) {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.supers.Classifier#inheritableMembers()
   */
  @Override
  public
  Set< infrastructurelibrary.core.abstractions.visibilities.NamedElement >
  inheritableMembers() {
    
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
   * @see infrastructurelibrary.core.abstractions.supers.Classifier#maySpecializeType(infrastructurelibrary.core.abstractions.supers.Classifier)
   */
  @Override
  public Boolean maySpecializeType( Classifier c ) {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.namespaces.Namespace#membersAreDistinguishable()
   */
  @Override
  public Boolean membersAreDistinguishable() {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  /* (non-Javadoc)
   * @see infrastructurelibrary.core.abstractions.supers.Classifier#parents()
   */
  @Override
  public Set< Classifier > parents() {
    
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

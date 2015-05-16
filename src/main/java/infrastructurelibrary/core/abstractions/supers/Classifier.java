/**
 *
 */

package infrastructurelibrary.core.abstractions.supers;

import infrastructurelibrary.core.abstractions.visibilities.NamedElement;

import java.util.Set;

import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Classifier extends
infrastructurelibrary.core.abstractions.classifiers.Classifier {
  
  Set< Classifier > allParents();
  
  Boolean hasVisibilityOf( NamedElement n );

  Set<NamedElement> inherit(Set<NamedElement> inhs);

  Set< NamedElement > inheritableMembers();
  
  Boolean maySpecializeType( Classifier c );
  
  Set< ? extends Classifier > parents();

}
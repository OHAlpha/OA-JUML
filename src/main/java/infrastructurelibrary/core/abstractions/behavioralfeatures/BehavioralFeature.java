/**
 *
 */

package infrastructurelibrary.core.abstractions.behavioralfeatures;

import infrastructurelibrary.core.abstractions.classifiers.Feature;
import infrastructurelibrary.core.abstractions.namespaces.NamedElement;
import infrastructurelibrary.core.abstractions.namespaces.Namespace;
import primitivetypes.Boolean;


/**
 * @author oalpha
 *
 */
public interface BehavioralFeature extends Feature, Namespace {

  @Override
  Boolean isDistinguishableFrom( NamedElement n, Namespace ns );

}
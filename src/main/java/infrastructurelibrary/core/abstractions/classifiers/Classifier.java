/**
 *
 */

package infrastructurelibrary.core.abstractions.classifiers;

import infrastructurelibrary.core.abstractions.namespaces.Namespace;

import java.util.Set;

/**
 * Associations
 * <ul>
 * <li>feature : Feature [*]</li>
 * Specifies each feature defined in the classifier. Subsets Namespace::member.
 * This is a derived union.
 * </ul>
 *
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Classifier extends Namespace {
  
  Set< Feature > allFeatures();

}
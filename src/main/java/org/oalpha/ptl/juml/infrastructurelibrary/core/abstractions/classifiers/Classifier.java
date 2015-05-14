/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.classifiers;

import java.util.Collection;

import org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.namespaces.Namespace;

/**
 * A classifier is a classification of instances — it describes a set of
 * instances that have features in common.
 *
 * <h2>Description</h2>
 *
 * A classifier is a namespace whose members can include features. Classifier is
 * an abstract metaclass.
 *
 * <h2>Associations</h2>
 * <ul>
 * <li>/ feature : Feature [*]</li>
 * <p>
 * Specifies each feature defined in the classifier. Subsets Namespace::member.
 * This is a derived union.
 * </p>
 * </ul>
 *
 * <h2>Additional Operations</h2>
 * <ol>
 * <li>The query allFeatures() gives all of the features in the namespace of the
 * classifier. In general, through mechanisms such as inheritance, this will be
 * a larger set than feature.</li>
 *
 * <pre>
 * Classifier::allFeatures(): Set(Feature);
 * allFeatures = member->select(oclIsKindOf(Feature))
 * </pre>
 *
 * <h2>Semantics</h2>
 * A classifier is a classification of instances according to their features.
 *
 * <h2>Notation</h2>
 * The default notation for a classifier is a solid-outline rectangle containing
 * the classifier’s name, and optionally with compartments separated by
 * horizontal lines containing features or other members of the classifier. The
 * specific type of classifier can be shown in guillemets above the name. Some
 * specializations of Classifier have their own distinct notations.
 *
 * <h2>Presentation Options</h2>
 * Any compartment may be suppressed. A separator line is not drawn for a
 * suppressed compartment. If a compartment is suppressed, no inference can be
 * drawn about the presence or absence of elements in it. Compartment names can
 * be used to remove ambiguity, if necessary.
 *
 * </ol>
 *
 * @author oalpha
 */
public interface Classifier extends Namespace {

  Collection< Feature > allFeatures();
  
}
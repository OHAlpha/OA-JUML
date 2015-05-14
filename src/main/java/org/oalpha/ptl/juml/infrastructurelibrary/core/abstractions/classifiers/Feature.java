/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.classifiers;

import org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.namespaces.NamedElement;

/**
 * A feature declares a behavioral or structural characteristic of instances of
 * classifiers.
 *
 * <h2>Description</h2>
 *
 * A feature declares a behavioral or structural characteristic of instances of
 * classifiers. Feature is an abstract metaclass.
 *
 * <h2>Associations</h2>
 * <ul>
 * <li>/ featuringClassifier: Classifier [0..*]</li>
 * <p>
 * The Classifiers that have this Feature as a feature. This is a derived union.
 * </p>
 * </ul>
 *
 * <h2>Semantics</h2>
 *
 * A Feature represents some characteristic for its featuring classifiers. A
 * Feature can be a feature of multiple classifiers.
 *
 * <h2>Notation</h2>
 *
 * No general notation. Subclasses define their specific notation.
 *
 * @author oalpha
 */
public interface Feature extends NamedElement {

}
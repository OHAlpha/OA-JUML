/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.behavoiralfeatures;

import org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.classifiers.Feature;
import org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.namespaces.NamedElement;
import org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.namespaces.Namespace;

/**
 * A behavioral feature is a feature of a classifier that specifies an aspect of
 * the behavior of its instances.
 *
 * A behavioral feature is a feature of a classifier that specifies an aspect of
 * the behavior of its instances. BehavioralFeature is an abstract metaclass
 * specializing Feature and Namespace. Kinds of behavioral aspects are modeled
 * by subclasses of BehavioralFeature.
 *
 * @author oalpha
 */
public interface BehavoiralFeature extends Feature, Namespace {

  /**
   * The query isDistinguishableFrom() determines whether two BehavioralFeatures
   * may coexist in the same Namespace. It specifies that they have to have
   * different signatures.
   * 
   * <pre>
   * BehavioralFeature::isDistinguishableFrom(n:
   * NamedElement, ns: Namespace): Boolean; isDistinguishableFrom = if
   * n.oclIsKindOf(BehavioralFeature) then if
   * ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()
   * then Set{}->including(self)->including(n)->isUnique( bf |
   * bf.parameter->collect(type)) else true endif else true endif
   * </pre>
   *
   * @return
   */
  @Override
  boolean isDistinguishableFrom( NamedElement n, Namespace ns );
  
}
/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.ownerships;

import java.util.Collection;

/**
 * An element is a constituent of a model. As such, it has the capability of
 * owning other elements.
 *
 * <h2>Description</h2>
 *
 * Element has a derived composition association to itself to support the
 * general capability for elements to own other elements.
 *
 * <h2>Associations</h2>
 * <ul>
 * <li>/ ownedElement: Element[*]</li>
 * <p>
 * The Elements owned by this element. This is a derived union.
 * </p>
 * <li>/ owner: Element [0..1]</li>
 * <p>
 * The Element that owns this element. This is a derived union.
 * </p>
 * </ul>
 *
 * <h2>Constraints</h2>
 * <ol>
 * <li>An element may not directly or indirectly own itself.</li>
 *
 * <pre>
 * not self.allOwnedElements()->includes(self)
 * </pre>
 *
 * <li>Elements that must be owned must have an owner.</li>
 *
 * <pre>
 * self.mustBeOwned() implies owner->notEmpty()
 * </pre>
 *
 * </ol>
 *
 * <h2>Additional Operations</h2>
 * <ol>
 * <li>The query allOwnedElements() gives all of the direct and indirect owned
 * elements of an element.</li>
 *
 * <pre>
 * Element::allOwnedElements(): Set(Element);
 * allOwnedElements = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
 * </pre>
 *
 * <li>The query mustBeOwned() indicates whether elements of this type must have
 * an owner. Subclasses of Element that do not require an owner must override
 * this operation.</li>
 *
 * <pre>
 * Element::mustBeOwned() : Boolean;
 * mustBeOwned = true
 * </pre>
 *
 * </ol>
 *
 * <h2>Semantics</h2>
 *
 * Subclasses of Element will provide semantics appropriate to the concept they
 * represent. The derived ownedElement association is subsetted (directly or
 * indirectly) by all composed association ends in the metamodel. Thus
 * ownedElement provides a convenient way to access all the elements that are
 * directly owned by an Element.
 *
 * <h2>Notation</h2>
 *
 * There is no general notation for an Element. The specific subclasses of
 * Element define their own notation.
 *
 * @author oalpha
 */
public interface Element
extends
org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.elements.Element {

  /**
   * The query allOwnedElements() gives all of the direct and indirect owned
   * elements of an element.
   *
   * <pre>
   *  Element::allOwnedElements(): Set(Element);
   *  allOwnedElements = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
   * </pre>
   *
   * @return the collection
   */
  Collection< Element > allOwnedElements();

  /**
   * Not included in OMG specification.
   *
   * @return the number of owned elements
   */
  int getNumOwnedElements();

  /**
   * Not included in OMG specification.
   *
   * @return the owner of this element
   */
  Element getOwner();

  /**
   * The query mustBeOwned() indicates whether elements of this type must have
   * an owner. Subclasses of Element that do not require an owner must override
   * this operation.
   *
   * <pre>
   *  Element::mustBeOwned() : Boolean;
   *  mustBeOwned = true
   * </pre>
   *
   * Elements that must be owned must have an owner.
   *
   * <code>self.mustBeOwned()</code> implies <code>!owner.isEmpty()</code>
   *
   * @return whether elements of this type must have an owner
   */
  boolean mustBeOwned();

  /**
   * Not included in OMG specification.
   *
   * @param e
   *          the new owner of this element
   */
  void setOwner( Element e );

}
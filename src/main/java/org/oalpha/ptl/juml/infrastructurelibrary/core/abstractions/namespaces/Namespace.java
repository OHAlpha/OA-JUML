/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.namespaces;

import java.util.Collection;

import org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.ownerships.Element;

/**
 * A namespace is an element in a model that contains a set of named elements
 * that can be identified by name.
 *
 * <h2>Description</h2>
 *
 * A namespace is a named element that can own other named elements. Each named
 * element may be owned by at most one namespace. A namespace provides a means
 * for identifying named elements by name. Named elements can be identified by
 * name in a namespace either by being directly owned by the namespace or by
 * being introduced into the namespace by other means (e.g., importing or
 * inheriting). Namespace is an abstract metaclass.
 *
 * <h2>Associations</h2>
 * <ul>
 * <li>/ member: NamedElement [*]</li>
 * <p>
 * A collection of NamedElements identifiable within the Namespace, either by
 * being owned or by being introduced by importing or inheritance. This is a
 * derived union.
 * </p>
 * <li>/ ownedMember: NamedElement [*]</li>
 * <p>
 * A collection of NamedElements owned by the Namespace. Subsets
 * Element::ownedElement and Namespace::member. This is a derived union.
 * </p>
 * </ul>
 *
 * <h2>Constraints</h2>
 * <ol>
 * <li>All the members of a Namespace are distinguishable within it.</li>
 * <code>membersAreDistinguishable()</code>
 * </ol>
 * <h2>Additional Operations</h2>
 * <ol>
 * <li>The query getNamesOfMember() gives a set of all of the names that a
 * member would have in a Namespace. In general a member can have multiple names
 * in a Namespace if it is imported more than once with different aliases. Those
 * semantics are specified by overriding the getNamesOfMember operation. The
 * specification here simply returns a set containing a single name, or the
 * empty set if no name.</li>
 *
 * <pre>
 * Namespace::getNamesOfMember(element: NamedElement): Set(String);
 * getNamesOfMember =
 * if member->includes(element) then Set{}->including(element.name) else Set{} endif
 * </pre>
 *
 * <li>The Boolean query membersAreDistinguishable() determines whether all of
 * the namespace’s members are distinguishable within it.</li>
 *
 * <pre>
 * Namespace::membersAreDistinguishable() : Boolean;
 * membersAreDistinguishable =
 * self.member->forAll( memb |self.member->excluding(memb)->forAll(other |
 * memb.isDistinguishableFrom(other, self)))
 * </pre>
 *
 * </ol>
 *
 * <h2>Semantics</h2>
 *
 * A namespace provides a container for named elements. It provides a means for
 * resolving composite names, such as name1::name2::name3. The member
 * association identifies all named elements in a namespace called N that can be
 * referred to by a composite name of the form N::<x>. Note that this is
 * different from all of the names that can be referred to unqualified within N,
 * because that set also includes all unhidden members of enclosing namespaces.
 * Named elements may appear within a namespace according to rules that specify
 * how one named element is distinguishable from another. The default rule is
 * that two elements are distinguishable if they have unrelated types, or
 * related types but different names. This rule may be overridden for particular
 * cases, such as operations that are distinguished by their signature. Notation
 * No additional notation. Concrete subclasses will define their own specific
 * notation.
 *
 * @author oalpha
 */
public interface Namespace extends Element {
  
  Collection< String > getNamesOfMember();
  
  boolean membersAreDistinguishable();
  
}
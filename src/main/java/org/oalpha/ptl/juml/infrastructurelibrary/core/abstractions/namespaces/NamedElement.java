/**
 *
 */

package org.oalpha.ptl.juml.infrastructurelibrary.core.abstractions.namespaces;

/**
 * A named element is an element in a model that may have a name.
 *
 * <h2>Description</h2>
 *
 * A named element represents elements that may have a name. The name is used
 * for identification of the named element within the namespace in which it is
 * defined. A named element also has a qualified name that allows it to be
 * unambiguously identified within a hierarchy of nested namespaces.
 * NamedElement is an abstract metaclass.
 *
 * <h2>Attributes</h2>
 * <ul>
 * <li>name: String [0..1]</li>
 * <p>
 * The name of the NamedElement.
 * </p>
 * <li>/ qualifiedName: String [0..1]</li>
 * <p>
 * A name which allows the NamedElement to be identified within a hierarchy of
 * nested Namespaces. It is constructed from the names of the containing
 * namespaces starting at the root of the hierarchy and ending with the name of
 * the NamedElement itself. This is a derived attribute.
 * </p>
 * </ul>
 *
 * <h2>Associations</h2>
 * <ul>
 * <li>/ namespace: Namespace [0..1]
 * <li>
 * <p>
 * Specifies the namespace that owns the NamedElement. Subsets Element::owner.
 * This is a derived union.
 * </p>
 *
 * <h2>Constraints</h2>
 * <ol>
 * <li>If there is no name, or one of the containing namespaces has no name,
 * there is no qualified name.</li>
 *
 * <pre>
 * (self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
 * implies self.qualifiedName->isEmpty()
 * </pre>
 *
 * <li>When there is a name, and all of the containing namespaces have a name,
 * the qualified name is constructed from the names of the containing
 * namespaces.</li>
 *
 * <pre>
 * (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
 * self.qualifiedName = self.allNamespaces()->iterate( ns : Namespace; result: String = self.name |
 * ns.name->union(self.separator())->union(result))
 * </pre>
 *
 * </ol>
 * <h2>Additional Operations</h2>
 * <ol>
 * <li>The query allNamespaces() gives the sequence of namespaces in which the
 * NamedElement is nested, working outwards.</li>
 *
 * <pre>
 * NamedElement::allNamespaces(): Sequence(Namespace);
 * allNamespaces =
 * if self.namespace->isEmpty()
 * then Sequence{}
 * else self.namespace.allNamespaces()->prepend(self.namespace)
 * endif
 * </pre>
 *
 * <li>The query isDistinguishableFrom() determines whether two NamedElements
 * may logically co-exist within a Namespace. By default, two named elements are
 * distinguishable if (a) they have unrelated types or (b) they have related
 * types but different names.</li>
 *
 * <pre>
 * NamedElement::isDistinguishableFrom(n:NamedElement, ns: Namespace): Boolean;
 * isDistinguishable =
 * if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)
 * then ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
 * else true
 * endif
 * </pre>
 *
 * <li>The query separator() gives the string that is used to separate names
 * when constructing a qualified name.</li>
 *
 * <pre>
 * NamedElement::separator(): String;
 * separator = ‘::’
 * </pre>
 *
 * </ol>
 *
 * <h2>Semantics</h2>
 *
 * The name attribute is used for identification of the named element within
 * namespaces where its name is accessible. Note that the attribute has a
 * multiplicity of [0..1], which provides for the possibility of the absence of
 * a name (which is different from the empty name).
 *
 * @author oalpha
 */
public interface NamedElement {

  /**
   * Not included in OMG specification.
   *
   * @return the name of this element
   */
  String getName();

  /**
   * Not included in OMG specification.
   *
   * @return the namespace that owns this element
   */
  Namespace getNamespace();

  /**
   * Not included in OMG specification.
   *
   * @return the qualified name of this element
   */
  String getQualifiedName();

  /**
   * The query isDistinguishableFrom() determines whether two NamedElements may
   * logically co-exist within a Namespace. By default, two named elements are
   * distinguishable if (a) they have unrelated types or (b) they have related
   * types but different names.
   *
   * @param n
   * @param ns
   * @return
   */
  boolean isDistinguishableFrom( NamedElement n, Namespace ns );

  /**
   * The query separator() gives the string that is used to separate names when
   * constructing a qualified name.
   *
   * @return
   */
  String separator();

}
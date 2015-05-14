/**
 *
 */

package infrastructurelibrary.core.abstractions.comments;

import infrastructurelibrary.core.abstractions.ownerships.Element;

/**
 * Associations
 * <ul>
 * <li>annotatedElement: Element[*]</li>
 * References the Element(s) being commented.
 * </ul>
 *
 * TODO: Association: Aggregation: { owner: Element, child: Comment name:
 * ownedComment, subsets: ownedElement }
 *
 * @author oalpha
 *
 */
public interface Comment extends Element {

  //

}
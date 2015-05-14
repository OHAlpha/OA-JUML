/**
 *
 */

package infrastructurelibrary.core.abstractions.expressions;

/**
 * Attributes
 * <ul>
 * <li>body: String [0..*] {nonunique, ordered}</li>
 * The text of the expression, possibly in multiple languages.
 * <li>language: String [0..*] {ordered}</li>
 * Specifies the languages in which the expression is stated. The interpretation
 * of the expression body depends on the language. If languages are unspecified,
 * it might be implicit from the expression body or the context. Languages are
 * matched to body strings by order.
 * </ul>
 *
 * @author oalpha
 *
 */
public interface OpaqueExpression extends ValueSpecification {

}
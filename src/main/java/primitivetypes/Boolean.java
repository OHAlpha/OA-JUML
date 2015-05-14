/**
 *
 */

package primitivetypes;

import oalpha.OAlpha;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Boolean {
  
  @OAlpha
  static Boolean valueOf( boolean b ) {

    // TODO: Boolean.valueOf( boolean )

    if( Boolean.True == null ) {
      ;
    }
    if( Boolean.False == null ) {
      ;
    }

    return b ? Boolean.True : Boolean.False;
  }
  
  @OAlpha
  public static Boolean True = Boolean.valueOf( true );
  
  @OAlpha
  public static Boolean False = Boolean.valueOf( false );
  
  @OAlpha
  boolean value();
  
}
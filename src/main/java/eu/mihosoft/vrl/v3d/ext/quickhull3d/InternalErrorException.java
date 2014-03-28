package eu.mihosoft.vrl.v3d.ext.quickhull3d;

/**
 * Exception thrown when QuickHull3D encounters an internal error.
 */
public class InternalErrorException extends RuntimeException
{
	private static final long serialVersionUID = 8424934829117876669L;

	public InternalErrorException (String msg)
	 { super (msg);
	 }
}

/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Sun Apr 10 20:43:37 2016
 * Arguments: "-B" "macro_default" "-W" "java:drawplot,Class1" "-T" "link:lib" "-d" 
 * "F:\\DesignLife\\GradPrj\\code\\Location-Recognition\\matlab\\drawplot\\for_testing" 
 * "class{Class1:F:\\DesignLife\\GradPrj\\code\\Location-Recognition\\matlab\\PlotExample\\PlotDemoComp\\drawplot.m}" 
 */

package drawplot;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>Class1Remote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
 * <pre>
 *  F:\\DesignLife\\GradPrj\\code\\Location-Recognition\\matlab\\PlotExample\\PlotDemoComp\\drawplot.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>Class1Remote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of drawplot.Class1.
 */
public interface Class1Remote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>drawplot</code> M-function 
     * with 2 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %DRAWPLOT Plot a curve from x and y arrays.
     * %   DRAWPLOT(X,Y) Plots a curve from x and y arrays in a MATLAB
     * %   figure window.  This file is used as an example
     * %   for the MATLAB Java Package product.
     * </pre>
     *
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] drawplot(Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}

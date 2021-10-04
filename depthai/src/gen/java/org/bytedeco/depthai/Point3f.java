// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Point3f structure
 *
 * x,y,z coordinates that define a 3D point.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Point3f extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point3f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point3f position(long position) {
        return (Point3f)super.position(position);
    }
    @Override public Point3f getPointer(long i) {
        return new Point3f((Pointer)this).offsetAddress(i);
    }

    public Point3f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3f(float x, float y, float z) { super((Pointer)null); allocate(x, y, z); }
    private native void allocate(float x, float y, float z);
    public native float x(); public native Point3f x(float setter);
    public native float y(); public native Point3f y(float setter);
    public native float z(); public native Point3f z(float setter);
}
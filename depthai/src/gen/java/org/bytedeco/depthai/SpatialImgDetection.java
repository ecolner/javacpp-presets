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
 * SpatialImgDetection structure
 *
 * Contains image detection results together with spatial location data.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialImgDetection extends ImgDetection {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpatialImgDetection() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialImgDetection(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialImgDetection(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpatialImgDetection position(long position) {
        return (SpatialImgDetection)super.position(position);
    }
    @Override public SpatialImgDetection getPointer(long i) {
        return new SpatialImgDetection((Pointer)this).offsetAddress(i);
    }

    public native @ByRef Point3f spatialCoordinates(); public native SpatialImgDetection spatialCoordinates(Point3f setter);
}
// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;

/**
    The sk_region encapsulates the geometric region used to specify
    clipping areas for drawing.
*/
@Opaque @Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_region_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public sk_region_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_region_t(Pointer p) { super(p); }
}
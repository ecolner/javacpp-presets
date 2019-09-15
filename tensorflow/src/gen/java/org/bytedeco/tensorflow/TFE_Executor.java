// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_Executor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_Executor(Pointer p) { super(p); }

  public TFE_Executor(@Cast("bool") boolean async) { super((Pointer)null); allocate(async); }
  private native void allocate(@Cast("bool") boolean async);

  public TFE_Executor(EagerExecutor executor) { super((Pointer)null); allocate(executor); }
  private native void allocate(EagerExecutor executor);

  public native EagerExecutor executor();

  public native @MoveUniquePtr EagerExecutor owned_executor(); public native TFE_Executor owned_executor(EagerExecutor setter);
  public native EagerExecutor unowned_executor(); public native TFE_Executor unowned_executor(EagerExecutor setter);
}
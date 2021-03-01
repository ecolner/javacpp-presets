// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Plain C Tensor object, does not manage memory.
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class DLTensor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DLTensor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DLTensor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DLTensor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DLTensor position(long position) {
        return (DLTensor)super.position(position);
    }
    @Override public DLTensor getPointer(long i) {
        return new DLTensor((Pointer)this).position(position + i);
    }

  /**
   * \brief The opaque data pointer points to the allocated data. This will be
   * CUDA device pointer or cl_mem handle in OpenCL. This pointer is always
   * aligned to 256 bytes as in CUDA.
   *
   * For given DLTensor, the size of memory required to store the contents of
   * data is calculated as follows:
   *
   * <pre>{@code {.c}
   * static inline size_t GetDataSize(const DLTensor* t) {
   *   size_t size = 1;
   *   for (tvm_index_t i = 0; i < t->ndim; ++i) {
   *     size *= t->shape[i];
   *   }
   *   size *= (t->dtype.bits * t->dtype.lanes + 7) / 8;
   *   return size;
   * }
   * }</pre>
   */
  public native Pointer data(); public native DLTensor data(Pointer setter);
  /** \brief The device context of the tensor */
  public native @ByRef DLContext ctx(); public native DLTensor ctx(DLContext setter);
  /** \brief Number of dimensions */
  public native int ndim(); public native DLTensor ndim(int setter);
  /** \brief The data type of the pointer*/
  public native @ByRef DLDataType dtype(); public native DLTensor dtype(DLDataType setter);
  /** \brief The shape of the tensor */
  public native @Cast("int64_t*") LongPointer shape(); public native DLTensor shape(LongPointer setter);
  /**
   * \brief strides of the tensor (in number of elements, not bytes)
   *  can be NULL, indicating tensor is compact and row-majored.
   */
  public native @Cast("int64_t*") LongPointer strides(); public native DLTensor strides(LongPointer setter);
  /** \brief The offset in bytes to the beginning pointer to data */
  public native @Cast("uint64_t") long byte_offset(); public native DLTensor byte_offset(long setter);
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Initialization parameters used by {@link BGFX#bgfx_init init}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; select rendering backend. When set to {@link BGFX#BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT} a default rendering backend will be selected appropriate to the platform. One of:<br><table><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_NOOP RENDERER_TYPE_NOOP}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table></li>
 * <li>{@code vendorId} &ndash; vendor PCI id. If set to {@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE} it will select the first device. One of:<br><table><tr><td>{@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE}</td><td>{@link BGFX#BGFX_PCI_ID_SOFTWARE_RASTERIZER PCI_ID_SOFTWARE_RASTERIZER}</td><td>{@link BGFX#BGFX_PCI_ID_AMD PCI_ID_AMD}</td><td>{@link BGFX#BGFX_PCI_ID_INTEL PCI_ID_INTEL}</td><td>{@link BGFX#BGFX_PCI_ID_NVIDIA PCI_ID_NVIDIA}</td></tr></table></li>
 * <li>{@code deviceId} &ndash; device id. If set to 0 it will select first device, or device with matching id.</li>
 * <li>{@code resolution} &ndash; backbuffer resolution and reset parameters</li>
 * <li>{@code callback} &ndash; provide application specific callback interface</li>
 * <li>{@code allocator} &ndash; custom allocator. When a custom allocator is not specified, bgfx uses the CRT allocator. Bgfx assumes	custom allocator is thread safe.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_init_t {
 *     bgfx_renderer_type_t type;
 *     uint16_t vendorId;
 *     uint16_t deviceId;
 *     {@link BGFXResolution bgfx_resolution_t} resolution;
 *     {@link BGFXInitLimits bgfx_init_limits_t} limits;
 *     {@link BGFXCallbackInterface bgfx_callback_interface_t} * callback;
 *     {@link BGFXAllocatorInterface bgfx_allocator_interface_t} * allocator;
 * }</code></pre>
 */
@NativeType("struct bgfx_init_t")
public class BGFXInit extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        VENDORID,
        DEVICEID,
        RESOLUTION,
        LIMITS,
        CALLBACK,
        ALLOCATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(BGFXResolution.SIZEOF, BGFXResolution.ALIGNOF),
            __member(BGFXInitLimits.SIZEOF, BGFXInitLimits.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        VENDORID = layout.offsetof(1);
        DEVICEID = layout.offsetof(2);
        RESOLUTION = layout.offsetof(3);
        LIMITS = layout.offsetof(4);
        CALLBACK = layout.offsetof(5);
        ALLOCATOR = layout.offsetof(6);
    }

    BGFXInit(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXInit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXInit(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("bgfx_renderer_type_t")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code vendorId} field. */
    @NativeType("uint16_t")
    public short vendorId() { return nvendorId(address()); }
    /** Returns the value of the {@code deviceId} field. */
    @NativeType("uint16_t")
    public short deviceId() { return ndeviceId(address()); }
    /** Returns a {@link BGFXResolution} view of the {@code resolution} field. */
    @NativeType("bgfx_resolution_t")
    public BGFXResolution resolution() { return nresolution(address()); }
    /** Passes the {@code resolution} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BGFXInit resolution(java.util.function.Consumer<BGFXResolution> consumer) { consumer.accept(resolution()); return this; }
    /** Returns a {@link BGFXInitLimits} view of the {@code limits} field. */
    @NativeType("bgfx_init_limits_t")
    public BGFXInitLimits limits() { return nlimits(address()); }
    /** Passes the {@code limits} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BGFXInit limits(java.util.function.Consumer<BGFXInitLimits> consumer) { consumer.accept(limits()); return this; }
    /** Returns a {@link BGFXCallbackInterface} view of the struct pointed to by the {@code callback} field. */
    @Nullable
    @NativeType("bgfx_callback_interface_t *")
    public BGFXCallbackInterface callback() { return ncallback(address()); }
    /** Returns a {@link BGFXAllocatorInterface} view of the struct pointed to by the {@code allocator} field. */
    @Nullable
    @NativeType("bgfx_allocator_interface_t *")
    public BGFXAllocatorInterface allocator() { return nallocator(address()); }

    /** Sets the specified value to the {@code type} field. */
    public BGFXInit type(@NativeType("bgfx_renderer_type_t") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code vendorId} field. */
    public BGFXInit vendorId(@NativeType("uint16_t") short value) { nvendorId(address(), value); return this; }
    /** Sets the specified value to the {@code deviceId} field. */
    public BGFXInit deviceId(@NativeType("uint16_t") short value) { ndeviceId(address(), value); return this; }
    /** Copies the specified {@link BGFXResolution} to the {@code resolution} field. */
    public BGFXInit resolution(@NativeType("bgfx_resolution_t") BGFXResolution value) { nresolution(address(), value); return this; }
    /** Copies the specified {@link BGFXInitLimits} to the {@code limits} field. */
    public BGFXInit limits(@NativeType("bgfx_init_limits_t") BGFXInitLimits value) { nlimits(address(), value); return this; }
    /** Sets the address of the specified {@link BGFXCallbackInterface} to the {@code callback} field. */
    public BGFXInit callback(@Nullable @NativeType("bgfx_callback_interface_t *") BGFXCallbackInterface value) { ncallback(address(), value); return this; }
    /** Sets the address of the specified {@link BGFXAllocatorInterface} to the {@code allocator} field. */
    public BGFXInit allocator(@Nullable @NativeType("bgfx_allocator_interface_t *") BGFXAllocatorInterface value) { nallocator(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXInit set(
        int type,
        short vendorId,
        short deviceId,
        BGFXResolution resolution,
        BGFXInitLimits limits,
        @Nullable BGFXCallbackInterface callback,
        @Nullable BGFXAllocatorInterface allocator
    ) {
        type(type);
        vendorId(vendorId);
        deviceId(deviceId);
        resolution(resolution);
        limits(limits);
        callback(callback);
        allocator(allocator);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXInit set(BGFXInit src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXInit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXInit malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link BGFXInit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXInit calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link BGFXInit} instance allocated with {@link BufferUtils}. */
    public static BGFXInit create() {
        return new BGFXInit(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXInit} instance for the specified memory address. */
    public static BGFXInit create(long address) {
        return new BGFXInit(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXInit createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXInit} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXInit mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXInit} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXInit callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXInit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInit mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXInit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInit callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + BGFXInit.TYPE); }
    /** Unsafe version of {@link #vendorId}. */
    public static short nvendorId(long struct) { return memGetShort(struct + BGFXInit.VENDORID); }
    /** Unsafe version of {@link #deviceId}. */
    public static short ndeviceId(long struct) { return memGetShort(struct + BGFXInit.DEVICEID); }
    /** Unsafe version of {@link #resolution}. */
    public static BGFXResolution nresolution(long struct) { return BGFXResolution.create(struct + BGFXInit.RESOLUTION); }
    /** Unsafe version of {@link #limits}. */
    public static BGFXInitLimits nlimits(long struct) { return BGFXInitLimits.create(struct + BGFXInit.LIMITS); }
    /** Unsafe version of {@link #callback}. */
    @Nullable public static BGFXCallbackInterface ncallback(long struct) { return BGFXCallbackInterface.createSafe(memGetAddress(struct + BGFXInit.CALLBACK)); }
    /** Unsafe version of {@link #allocator}. */
    @Nullable public static BGFXAllocatorInterface nallocator(long struct) { return BGFXAllocatorInterface.createSafe(memGetAddress(struct + BGFXInit.ALLOCATOR)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + BGFXInit.TYPE, value); }
    /** Unsafe version of {@link #vendorId(short) vendorId}. */
    public static void nvendorId(long struct, short value) { memPutShort(struct + BGFXInit.VENDORID, value); }
    /** Unsafe version of {@link #deviceId(short) deviceId}. */
    public static void ndeviceId(long struct, short value) { memPutShort(struct + BGFXInit.DEVICEID, value); }
    /** Unsafe version of {@link #resolution(BGFXResolution) resolution}. */
    public static void nresolution(long struct, BGFXResolution value) { memCopy(value.address(), struct + BGFXInit.RESOLUTION, BGFXResolution.SIZEOF); }
    /** Unsafe version of {@link #limits(BGFXInitLimits) limits}. */
    public static void nlimits(long struct, BGFXInitLimits value) { memCopy(value.address(), struct + BGFXInit.LIMITS, BGFXInitLimits.SIZEOF); }
    /** Unsafe version of {@link #callback(BGFXCallbackInterface) callback}. */
    public static void ncallback(long struct, @Nullable BGFXCallbackInterface value) { memPutAddress(struct + BGFXInit.CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #allocator(BGFXAllocatorInterface) allocator}. */
    public static void nallocator(long struct, @Nullable BGFXAllocatorInterface value) { memPutAddress(struct + BGFXInit.ALLOCATOR, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long callback = memGetAddress(struct + BGFXInit.CALLBACK);
        if (callback != NULL) {
            BGFXCallbackInterface.validate(callback);
        }
        long allocator = memGetAddress(struct + BGFXInit.ALLOCATOR);
        if (allocator != NULL) {
            BGFXAllocatorInterface.validate(allocator);
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

}
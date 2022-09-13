package org.bytedeco.libdmtx.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.presets.javacpp;
import org.bytedeco.javacpp.tools.*;

@Properties(
	inherit=javacpp.class,
    value = {
        @Platform(value = "windows", include = { "dmtxstatic.h", "dmtx.h" })
    },
    target = "org.bytedeco.libdmtx",
    global = "org.bytedeco.libdmtx.global.libdmtx"
)
public class libdmtx implements InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "libdmtx"); }

    public void map(InfoMap infoMap) {
		infoMap.put(new Info().enumerate())
			.put(new Info("DmtxBoolean").cppTypes("unsigned int").translate(false))
			.put(new Info("DmtxPassFail").cppTypes("unsigned int").translate(false))
			.put(new Info("DmtxByte").cast().valueTypes("byte"))
			.put(new Info("DmtxDirection").cast().valueTypes("byte"))
			.put(new Info("DmtxScheme").cast().valueTypes("byte"));
    }
}
#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" libdmtx
    popd
    exit
fi

LIBDMTX_VERSION=0.7.7
download https://github.com/dmtx/libdmtx/archive/refs/tags/v$LIBDMTX_VERSION.zip libdmtx-$LIBDMTX_VERSION.zip
unzip -o libdmtx-$LIBDMTX_VERSION.zip
cp ../libdmtx.def libdmtx-$LIBDMTX_VERSION

mkdir -p $PLATFORM
cd $PLATFORM
mkdir -p include
cp -r ../libdmtx-$LIBDMTX_VERSION/* include
cd ..
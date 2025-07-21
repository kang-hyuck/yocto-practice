SUMMARY = "External Linux Kernel Module Exmaple"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=fc35e270e76cac1128d202f427ec9155"

inherit module
SRC_URI = "file://Makefile \
           file://kh-kernel-mod.c \
           file://COPYING \
           "

RPROVIDES_${PN} += "kernel-module-kh-kernel-mod"

KERNEL_MODULE_AUTOLOAD += "kh-kernel-mod"

S = "${WORKDIR}"
ALLOW_EMPTY_${PN} = "1"
FILESEXTRAPATHS_prepend := "${THISDIR}/file:"

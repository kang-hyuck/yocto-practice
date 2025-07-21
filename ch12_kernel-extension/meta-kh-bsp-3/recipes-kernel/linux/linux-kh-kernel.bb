DESCRIPTION = "Linux kernel from kernel.org git repository"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
inherit kernel-yocto

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=git;nocheckout=1"

SRCREV = "af42d3466bdc8f39806b26f593604fdc54140bcb"
KBUILD_DEFCONFIG = "kh-defconfig"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

LINUX_VERSION ?= "5.4-rc8"
LINUX_VERSION_EXTENSION  = "-kh-linux"

PROVIDES += "virtual/kernel"

PV = "${LINUX_VERSION}+git${SRCPV}"
COMPATIBLE_MACHINE = "kh"

FILESEXTRAPATHS_prepend := "${THISDIR}/file:"

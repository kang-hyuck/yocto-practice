SRC_URI += "file://kernel-driver.cfg \
            file://0001-misc-add-test-driver.patch \
           "

KBRANCH_kh = "v5.4/standard/base"
KMACHINE_kh = "qemux86-64"
SRCREV_machine_kh = "35826e154ee014b64ccfa0d1f12d36b8f8a75939"
COMPATIBLE_MACHINE_kh = "kh"
LINUX_VERSION_kh = "5.4.219"

FILESEXTRAPATHS_prepend := "${THISDIR}/file:"

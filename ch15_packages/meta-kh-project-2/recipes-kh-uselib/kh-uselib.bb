DESCRIPTION = "use libtest.so"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://voice_main.c"

do_compile(){
    ${CC} ${LDFLAGS} -I -wl,-rpath=${libdir} -L . voice_main.c -ltest -o voice_main
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 voice_main ${D}${bindir}
}

DEPENDS = "kh-lib"

S = "${WORKDIR}"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
FILES_${PN} += "${bindir}/voice_main"

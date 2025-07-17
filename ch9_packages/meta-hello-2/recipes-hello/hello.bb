DESCRIPTION = "Simple helloworld application example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=8eb5acfe2f71c86ac23799abce2aef53"

SRC_URI = "file://hello.c"
SRC_URI_append = " file://COPYING"
SRC_URI_append = " file://hello.service"
inherit systemd
S = "${WORKDIR}"
SYSTEMD_SERVICE_${PN} = "hello.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_compile(){
    ${CC} hello.c ${LDFLAGS} -o hello
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 hello.service ${D}${systemd_unitdir}/system
}

FILESEXTRAPATHS_prepend := "${THISDIR}/source:"
FILES_${PN} += "${bindir}/hello"
FILES_${PN} += "${systemd_unitdir}/system/hello.service"


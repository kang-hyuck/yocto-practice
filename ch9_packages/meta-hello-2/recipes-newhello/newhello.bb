DESCRIPTION = "new helloworld"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=8eb5acfe2f71c86ac23799abce2aef53"

SRC_URI = "file://newhello.c"
SRC_URI += "file://COPYING"
SRC_URI += "file://hello.service"

inherit systemd

S = "${WORKDIR}"
SYSTEMD_SERVICE_${PN} = "hello.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_compile(){
    ${CC} newhello.c ${LDFLAGS} -o hello
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 hello.service ${D}${systemd_unitdir}/system
}

RREPLACES_${PN} = "hello"
RPROVIDES_${PN} = "hello"
RCONFLICTS_${PN} = "hello"

FILESEXTRAPATHS_prepend := "${THISDIR}/source:"

FILES_${PN} += "${bindir}/hello"
FILES_${PN} += "${systemd_unitdir}/system/hello.service"


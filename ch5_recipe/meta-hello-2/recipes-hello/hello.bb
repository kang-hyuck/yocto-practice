DESCRIPTION = "Simple helloworld application example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=8eb5acfe2f71c86ac23799abce2aef53"

SRC_URI = "file://hello.c"
SRC_URI_append = " file://COPYING"
S = "${WORKDIR}"

do_compile(){
    ${CC} hello.c ${LDFLAGS} -o hello
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}
}

FILESEXTRAPATHS_prepend := "${THISDIR}/source:"
FILES_${PN} += "${bindir}/hello"


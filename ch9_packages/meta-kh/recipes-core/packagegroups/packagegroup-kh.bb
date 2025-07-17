DESCRIPTION = "package group, kh"
inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS_${PN} = "\
                hello \
                nano \
                "

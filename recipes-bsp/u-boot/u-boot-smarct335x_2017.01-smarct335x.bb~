require u-boot-smarc.inc

COMPATIBLE_MACHINE = "smarct335x"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PV = "2017.01-smarct335x"
PR = "r0+gitr${SRCPV}"

SRC_URI = "${EMB_UBOOT_MIRROR};protocol=ssh;branch=${BRANCH}"

BRANCH = "v2017.01-smarct3x"

SRCREV = "93e96ce2ff6bd0458bcf3ab2861832b277628277"

S = "${WORKDIR}/git"

UBOOT_SUFFIX = "img"

SPL_BINARY = "MLO"
UBOOT_SPI_BINARY = "u-boot.img"
SPL_UART_BINARY = "u-boot-spl.bin"

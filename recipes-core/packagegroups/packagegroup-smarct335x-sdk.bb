DESCRIPTION = "Target packages for the standalone SDK"
PR = "r12"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = "\
    libgcc \
    libgcc-dev \
    libstdc++-dev \
    ${LIBC_DEPENDENCIES} \
    glibc-staticdev \
    linux-libc-headers-dev \
    gdbserver \
    alsa-dev \
    alsa-lib-dev \
    alsa-utils-dev \
    curl-dev \
    i2c-tools-dev \
    freetype-dev \
    ${@base_conditional('PREFERRED_PROVIDER_jpeg', 'libjpeg-turbo', 'libjpeg-turbo-dev', 'jpeg-dev', d)}  \
    lzo-dev \
    opkg-dev \
    libpng-dev \
    readline-dev \
    ${@base_conditional('QT_PROVIDER', 'qt5', '', 'tslib-dev', d)} \
    libusb-compat-dev \
    libusb1-dev \
    zlib-dev \
    ncurses-dev \
    opkg-dev \
    util-linux-dev \
    sudo \
    screen \
    boost \
    nodejs \
    tzdata \
    lftp \
    vim \
    minicom \
    procps \
    git \
    cronie \
    iputils-ping \
    start-stop-daemon \
    net-tools \
    fbida \
    ${@base_conditional('TCMODE', 'external-linaro', 'libgomp-dev', '', d)} \
    "

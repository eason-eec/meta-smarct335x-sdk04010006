require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

PR_append = ".smarc2"

BRANCH = "smarct3x-processor-sdk-04.01.00.06"

SRCREV = "c0b8b686a0f6dfa2fd8f9975c9ed2602b73cd07d"

SRC_URI = "${EMB_KERNEL_MIRROR};protocol=ssh;branch=${BRANCH} \
"
S = "${WORKDIR}/git"

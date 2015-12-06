# Adapted from linux-imx_${PV}.bb, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udoo.inc 
include linux-dtb.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
# Kernel_Unico is a branch from 3.0.35 so we apply the 3.0.35 patches

SRC_URI = "git://github.com/deadloko/linux_kernel.git;protocol=git;branch=${SRCBRANCH} \
           file://defconfig"

KERNEL_IMAGETYPE = "uImage"
SRCBRANCH = "imx_3.14.28_1.0.0_ga_a62"
SRCREV = "6c8f3b0246bc130ca322cc411463351aa9be8e64"
LOCALVERSION = "imx_3.14.28_1.0.0_ga_a62"

# Patches need for Yocto and not applied by Freescale when doing 4.1.0 branch

COMPATIBLE_MACHINE = "(mx6)"

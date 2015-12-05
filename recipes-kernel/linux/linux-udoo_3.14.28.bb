# Adapted from linux-imx_${PV}.bb, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udoo.inc

# Kernel_Unico is a branch from 3.0.35 so we apply the 3.0.35 patches
SRCREV = "6c8f3b0246bc130ca322cc411463351aa9be8e64"
LOCALVERSION = "imx_3.14.28_1.0.0_ga_a62"

# Patches need for Yocto and not applied by Freescale when doing 4.1.0 branch

COMPATIBLE_MACHINE = "(mx6)"
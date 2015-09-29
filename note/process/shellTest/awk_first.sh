#########################################################################
# File Name: awk_first.sh
# Author: ma6174
# mail: ma6174@163.com
# Created Time: 2015年07月19日 星期日 10时35分43秒
#########################################################################
#!/bin/bash

who | awk '{print $1"\t"$2}'

echo "file system"
df -k | awk '{print $1}' | grep -v "Filesystem"

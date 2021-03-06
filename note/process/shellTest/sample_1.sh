#########################################################################
# File Name: sample_1.sh
# Author: GBK
# mail: GBK@163.com
# Created Time: 2015年07月15日 星期三 21时36分53秒
#########################################################################
#!/bin/bash

LOG_DIR=/var/log 
ROOT_UID=0
LINES=50
E_XCD=66
E_NOTROOT=67

if [ "$UID" -ne "$ROOT_UID" ]
then
    echo "Must be root to run this scripts"
    exit $E_NOTROOT
fi 

if [ -n "$1" ]
then 
    lines=$1 
else
    lines=$LINES 
fi 

cd $LOG_DIR
cat /dev/null > messages
echo "Logs cleans up."
exit

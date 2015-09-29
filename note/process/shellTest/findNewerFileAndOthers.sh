#########################################################################
# File Name: find_newer_file.sh
# Author: ma6174
# mail: ma6174@163.com
# Created Time: 2015年07月19日 星期日 09时55分27秒
#########################################################################
#!/bin/bash

down_oldfile=$1
up_newfile=$2

# 寻找大于旧文件小于新文件之内的所有文件
find . -newer $down_oldfile ! -newer $up_newfile -exec ls -l {} \
find . -newer $down_oldfile ! -newer $up_newfile -print 

# 查找所有目录
find /etc -type d -print 

# 除去目录之外的
find /etc ! -type d -print 

# 查找所有符号链接
find /etc -type 1 -print 

# 超出一定大小的文件
find . -size +100000c -print 

find . -name "note.txt" -depth -print 

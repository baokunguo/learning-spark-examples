#########################################################################
# File Name: awk_print.sh
# Author: ma6174
# mail: ma6174@163.com
# Created Time: 2015年07月22日 星期三 06时53分03秒
#########################################################################
#!/bin/bash

#awk -F: '{print $0}' ./passwd 
#awk -F: '{print $1,$4}' ./passwd

#输出某一列
#awk -F: 'BEGIN {print "Name Belta\n ---"}{print $1, $4} END {"END-of-Report"}' ./passwd 
#包含
#awk -F: 'BEGIN {print "Name Belta\n ---"}{if($0~/bao/) print $1, $4}' ./passwd 
# 不包含
#awk -F: 'BEGIN {print "Name Belta\n ---"}{if($0!~/bao/) print $1, $4,$3,$2,$5}' ./passwd 
#设置大小写
#awk -F: '/[Aa]dmin/' ./passwd
#awk -F: 'BEGIN {print "Name Belta\n ---"}{if($5~/[Aa]dmin/) print $1, $4,$3,$2,$5}' ./passwd 

#任意字符
#awk -F: '$5 ~/^...i/' ./passwd 

#关系字符串
#awk -F: '$5~/(Admin|admin)/' ./passwd 

#复合模式 && || !
#awk -F: '{if ($5>1 && $6>1 ) print $0 }' ./passwd 
#awk -F: '{if ($5>1 || $6>1 ) print $0 }' ./passwd 
 



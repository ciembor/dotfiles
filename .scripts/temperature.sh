#!/bin/bash

# This script protects the computer from being turned off 
# after the temperature is too high. It sends warnings to 
# the user and kills the most CPU intensive process.
#
# dependencies: awk, espeak, sensors
# author: Maciej Ciemborowicz

PERIOD=10
# 82/83 => poweroff
WARN_TEMP=77
KILL_TEMP=80

prev_temp=0
cur_temp=0

#espeak -p10 -s160 "starting temperature monitor"

while true; do
  cur_temp=`sensors | grep 'CPU Temperature' | cut -c22-23`
  if [ $cur_temp -ge $WARN_TEMP -a $cur_temp -ge $prev_temp ] 
  then
#    espeak -p10 -s160 $cur_temp
    if [ $cur_temp -ge $KILL_TEMP -a $cur_temp -gt $prev_temp ]
    then
      top_process_string=`ps -eo "%cpu",pid,comm | sort -nr | head -n 1`
      top_process=(`echo $top_process_string | awk -v OFS=" " '$1=$1' | tr " " "\n"`)
      espeak -p10 -s160 `echo "killing-${top_process[2]}" `
      kill -9 ${top_process[1]}
    fi
  fi
  prev_temp=$cur_temp
  sleep $PERIOD
done

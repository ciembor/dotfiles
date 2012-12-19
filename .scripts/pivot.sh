#!/bin/bash

case "$1" in
  vertical)
		echo "vertical"
		killall tilda
		xrandr -o left &
		tilda -y 1300 &
    ;;

  horizontal)
    	echo "horizontal"
    	killall tilda
    	xrandr -o normal &
    	tilda -y 900 &
    ;;
  *) 
	echo "usage: $0 {vertical|horizontal}"
esac
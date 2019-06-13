#!/bin/bash
java -cp . com.src.Main $1
echo "--jar--"
java -cp fib.jar com.src.Main $1
package com.bvb

fun main(args : Array<String>)
{
    println("Doing nothing with the args: " + args.fold("", { acc, new -> acc + new + "," }))
}
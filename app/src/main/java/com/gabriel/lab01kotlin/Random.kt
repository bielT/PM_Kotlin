package com.gabriel.lab01kotlin

import java.util.Random


fun random():Int  {
    var n = Random()
    return n.nextInt(6) + 1
}
/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper

class Robot {
    // ------------ START EDITING HERE ----------------------

    int x
    int y

    void left() {
        x -= 1
    }

    void right() {
        x += 1
    }

    void up() {
        y += 1
    }

    void down() {
        y -= 1
    }

    def invokeMethod(String name, Object args) {
        name.eachMatch(/([L|l]eft)|([R|r]ight)|([U|u]p)|([D|d]own)/) {
            "${it[0].toLowerCase()}"()
        }
    }

    // ------------ STOP EDITING HERE  ----------------------
}

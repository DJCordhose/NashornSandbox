#!/usr/bin/env jjs -scripting

var name = $ARG[0];
print(name ? "Hello, ${name}!" : "Hello, world!");


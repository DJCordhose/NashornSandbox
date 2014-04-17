#!/usr/bin/env jjs

// this is how we get access to Java class Thread
var Thread = Java.type("java.lang.Thread");

// subclass with our run method
var MyThread = Java.extend(Thread, {
    run: function() {
        print("Run in separate thread");
    }
});
var th = new MyThread();
th.start();
th.join();

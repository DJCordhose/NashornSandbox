#!/usr/bin/env jjs

print("Arrays");

var jsArray = [4,1,3,2];
jsArray.forEach(function(el) { print(el) } );
//jsArray.forEach((el) => { print(el); } )

print("After forEach");

var javaArray = Java.to(jsArray, Java.type("java.lang.Number[]"))
// not possible
//javaArray.forEach(function(el) print(el));
for (var i in javaArray) {
    print(javaArray[i]);
}

for each (var el in javaArray) {
    print(el);
}

print("List");

var list = java.util.Arrays.asList(jsArray);

print (typeof list.forEach );
print (list.forEach);
for each (var el in list) {
    print(el);
}

print("forEach");

//var Consumer = Java.type("java.util.function.Consumer")
//list.forEach(new Consumer({accept: function(el) print(el)}));
//list.forEach(new Consumer(function(el) print(el)));
list.forEach(function(el) { print(el) });
//list.forEach(function(el) print(el));
//list.forEach(el => { print(el } );

print("fertig");
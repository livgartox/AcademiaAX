package com.v4;

@FunctionalInterface
public interface Predicado<T> {
	//trabajar de esta manera solo permite un pétodo abstracto
	boolean probar(T t);
}

package com.lambda;

@FunctionalInterface
public
interface Converter<F, T> {
    T convert(F from);
}

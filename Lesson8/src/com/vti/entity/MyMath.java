package com.vti.entity;

public class MyMath<T extends Number> {
	public static <T extends Comparable<T>> T max(T a, T b) {
		if (a.compareTo(b) > 0)
			return a;
		return b;
	}

	public T add(T a, T b) {
		if (a instanceof Integer) {
			return (T) (new Integer(a.intValue() + b.intValue()));
		} else if (a instanceof Float) {
			return (T) (new Float(a.floatValue() + b.floatValue()));
		} else if (a instanceof Double) {
			return (T) (new Double(a.doubleValue() + b.doubleValue()));
		} else if (a instanceof Long) {
			return (T) (new Long(a.longValue() + b.longValue()));
		}
		return null;
	}

	public T subtract(T a, T b) {
		if (a instanceof Integer) {
			return (T) (new Integer(a.intValue() - b.intValue()));
		} else if (a instanceof Float) {
			return (T) (new Float(a.floatValue() - b.floatValue()));
		} else if (a instanceof Double) {
			return (T) (new Double(a.doubleValue() - b.doubleValue()));
		} else if (a instanceof Long) {
			return (T) (new Long(a.longValue() - b.longValue()));
		}
		return null;
	}

	public T power(T a, T b) {

		return null;
	}

	public T add(T a, T b, T c) {
		return add(add(a, b), c);
	}

	public T add(T a, T b, T c, T d) {
		return add(add(add(a, b), c), d);
	}
}

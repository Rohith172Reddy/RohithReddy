package com.package_demo;

import com.package_demo.Parent;

public class Child extends Parent {
    private int childVariable;

    public Child(int parentVariable, int childVariable) {
        super();
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super();
        this.childVariable = childVariable;
    }

    public int getParentVariable() {
        return parentVariable;
    }

    public int getChildVariable() {
        return childVariable;
    }
}
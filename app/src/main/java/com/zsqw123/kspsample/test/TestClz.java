package com.zsqw123.kspsample.test;

class Impl1 {
}

class Impl2 {
}

class Impl3 {
}

public class TestClz {
    public Object findClass(String className, int idx) {
        if (className.equals("com.interface1")) {
            switch (idx) {
                case 555:
                    return new Impl1();
                case 222:
                    return new Impl2();
                default:
                    return null;
            }
        }
        if (className.equals("com.interface2")) {
            switch (idx) {
                case 211:
                    return new Impl2();
                case 233:
                    return new Impl3();
                default:
                    return null;
            }
        }
        if (className.equals("com.interface3")) {
            switch (idx) {
                case 888:
                    return new Impl3();
                case 556:
                    return new Impl1();
                default:
                    return null;
            }
        }
        return null;
    }
}

package org.example.impl;

import org.example.intf.HelloIntf;
import org.example.intf.IPerson;

public class HelloBean implements HelloIntf {

    private String myName;
    private IPerson person;

    public IPerson getPerson() {
        return person;
    }

    public void setPerson(IPerson person) {
        this.person = person;
    }

    public HelloBean() {
    }

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }

    @Override
    public String greetByName(String greetStr) {
        return greetStr + ", " + myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "myName='" + myName + '\'' +
                ", person=" + person +
                '}';
    }
}

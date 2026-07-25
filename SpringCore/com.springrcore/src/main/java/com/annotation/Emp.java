package com.autowire.annotation;

public class Emp {
    public Address address;

    public Emp(){
        super();
    }
    public Emp(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp [address=" + address + "]";
    }
}
